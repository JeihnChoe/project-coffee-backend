package shop.mtcoding.projectcoffeebackend.cart;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.ToString;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import shop.mtcoding.projectcoffeebackend._core.errors.exception.Exception401;
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

        List<CartRestResponse.AddCartDTO> cartDTOs = new ArrayList<>();
        for (CartRestRequest.AddCartListDTO addCartDTO : addCartDTOS) {
            int optionId = addCartDTO.getOptionId();
            int quantity = addCartDTO.getQuantity();
            String cupType = addCartDTO.getCupType();

            Option optionPS = optionJPARepository.findById(optionId).orElseThrow(() -> new Exception401("옵션이 없습니다."));
            int totalPrice = optionPS.getPrice() * quantity;

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
}