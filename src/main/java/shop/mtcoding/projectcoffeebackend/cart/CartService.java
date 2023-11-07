package shop.mtcoding.projectcoffeebackend.cart;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import shop.mtcoding.projectcoffeebackend._core.errors.exception.Exception401;
import shop.mtcoding.projectcoffeebackend.cart.api.CartRestRequest;
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

    public void addCartList(List<CartRestRequest.AddCartListDTO> addCartDTOS, User sessionUser) {

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
        }
    }

    public List<ViewCartListDTO> viewCartList(User sessionUser) {

        System.out.println("테스트 : view 카트 카트서비스 진입");

        List<ViewCartListDTO> cartPS = cartJPARepository.findByUserId(sessionUser.getId());

        System.out.println("테스트 : 카트리스트뽑기" + cartPS.get(0).getPrice());

        // List<ViewCartListDTO> responseDTO = cartPS.stream().map(e -> new
        // ViewCartListDTO(e))
        // .collect(Collectors.toList());

        System.out.println("테스트 : 카트리스트뽑기" + cartPS.get(0).getPrice());

        return cartPS;
        // System.out.println("테스트 : DTO나옴?" + viewCartListDTOs.get(0).getName());

    }
}
