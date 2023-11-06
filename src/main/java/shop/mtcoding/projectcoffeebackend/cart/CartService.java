package shop.mtcoding.projectcoffeebackend.cart;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import shop.mtcoding.projectcoffeebackend._core.errors.exception.Exception401;
import shop.mtcoding.projectcoffeebackend.cart.api.CartRestRequest;
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
    public void 장바구니담기(List<CartRestRequest.AddCartDTO> addCartDTOS, User sessionUser) {

        for (CartRestRequest.AddCartDTO addCartDTO: addCartDTOS) {
            int optionId = addCartDTO.getOptionId();
            int quantity = addCartDTO.getQuantity();
            String cupType = addCartDTO.getCupType();

            Option optionPS = optionJPARepository.findById(optionId).orElseThrow(() -> new Exception401("옵션이 없습니다."));
            int totalPrice = optionPS.getPrice()*quantity;

            Cart cart = Cart.builder()
                    .option(optionPS)
                    .quantity(quantity)
                    .totalPrice(totalPrice)
                    .cupType(cupType)
                    .user(sessionUser).build();

            cartJPARepository.save(cart);
        }
    }
}
