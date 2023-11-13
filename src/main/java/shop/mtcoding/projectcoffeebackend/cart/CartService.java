package shop.mtcoding.projectcoffeebackend.cart;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.ToString;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestHeader;
import shop.mtcoding.projectcoffeebackend._core.errors.exception.Exception401;
import shop.mtcoding.projectcoffeebackend._core.utils.JwtTokenUtils;
import shop.mtcoding.projectcoffeebackend.cart.api.CartRestRequest;
import shop.mtcoding.projectcoffeebackend.cart.api.CartRestResponse;
import shop.mtcoding.projectcoffeebackend.cart.api.CartRestResponse.ViewCartListDTO;
import shop.mtcoding.projectcoffeebackend.product.option.Option;
import shop.mtcoding.projectcoffeebackend.product.option.OptionJPARepository;
import shop.mtcoding.projectcoffeebackend.product.option.size.Size;
import shop.mtcoding.projectcoffeebackend.user.User;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class CartService {

    final OptionJPARepository optionJPARepository;
    final CartJPARepository cartJPARepository;

    @Transactional
    public List<CartRestResponse.AddCartDTO> addCartList(List<CartRestRequest.AddCartListDTO> addCartDTOS,
                                                         User sessionUser) {
        System.out.println("서비스 진입");
        List<CartRestResponse.AddCartDTO> cartDTOs = new ArrayList<>();
        for (CartRestRequest.AddCartListDTO addCartDTO : addCartDTOS) {
            int optionId = addCartDTO.getOptionId();
            int isIced = addCartDTO.getIsIced();
            int quantity = addCartDTO.getQuantity();
            int sizeId = addCartDTO.getSizeId();
            int cupType = addCartDTO.getCupType();

            Option optionPS = optionJPARepository.findByOptionId(optionId, isIced, sizeId).orElseThrow(() -> new Exception401("옵션이 없습니다."));
            int totalPrice = optionPS.getPrice() * quantity;
            System.out.println("isIced, sizeId들고오냐? " + optionPS.getProduct().getIsIced() + ", " + optionPS.getSize().getId());

            Cart cart = Cart.builder()
                    .option(optionPS)
                    .quantity(quantity)
                    .totalPrice(totalPrice)
                    .cupType(cupType)
                    .user(sessionUser).build();

            cartJPARepository.save(cart);
            System.out.println("카트id" + cart.getId());
            cartDTOs.add(new CartRestResponse.AddCartDTO(cart));
        }
        return cartDTOs;
    }

    public ViewCartListDTO viewCartList(User sessionUser) {

        System.out.println("테스트 : view 카트 카트서비스 진입");

        List<Cart> cartList = cartJPARepository.findByUserId(sessionUser.getId());

        return new ViewCartListDTO(cartList);

        // System.out.println("테스트 : DTO나옴?" + viewCartListDTOs.get(0).getName());

    }

    public void cartDelete(Integer id) {
        cartJPARepository.deleteById(id);
    }
}