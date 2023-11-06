package shop.mtcoding.projectcoffeebackend.cart.api;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import shop.mtcoding.projectcoffeebackend._core.errors.exception.Exception401;
import shop.mtcoding.projectcoffeebackend._core.utils.ApiUtils;
import shop.mtcoding.projectcoffeebackend.cart.CartService;
import shop.mtcoding.projectcoffeebackend.user.User;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class CartRestController {

    private final CartService cartService;
    private final HttpSession session;

    User sessionUser = (User) session.getAttribute("sessionUser");

    @PostMapping("/carts/add")
        public ResponseEntity<?> addCartList(@RequestBody List<CartRestRequest.AddCartDTO> addCartDTOS, Errors errors) {

        if(sessionUser == null){
            throw new Exception401("로그인이 필요한 서비스입니다.");
        }

        cartService.장바구니담기(addCartDTOS,sessionUser);




            return ResponseEntity.ok().body(ApiUtils.success(null));
        }



}
