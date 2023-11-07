package shop.mtcoding.projectcoffeebackend.cart;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import shop.mtcoding.projectcoffeebackend._core.errors.exception.Exception401;
import shop.mtcoding.projectcoffeebackend.cart.api.CartRestRequest;
import shop.mtcoding.projectcoffeebackend.cart.api.CartRestResponse.ViewCartListDTO;
import shop.mtcoding.projectcoffeebackend.product.option.Option;
import shop.mtcoding.projectcoffeebackend.product.option.OptionJPARepository;
import shop.mtcoding.projectcoffeebackend.user.User;

import java.util.List;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class CartService {

    final OptionJPARepository optionJPARepository;
    final CartJPARepository cartJPARepository;

    @Transactional
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

    public void viewCartList(User sessionUser) {
        int userId = sessionUser.getId();
        System.out.println("테스트 : 카트리스트뽑기");

        List<ViewCartListDTO> viewCartListDTOs = cartJPARepository.findByUserIdAndOptionId(userId);

        System.out.println("테스트 : DTO나옴?" + viewCartListDTOs.get(0).getProductName());

    }
}
