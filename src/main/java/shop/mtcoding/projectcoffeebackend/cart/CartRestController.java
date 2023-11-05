package shop.mtcoding.projectcoffeebackend.cart;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import shop.mtcoding.projectcoffeebackend._core.errors.exception.Exception401;
import shop.mtcoding.projectcoffeebackend.user.User;

import javax.servlet.http.HttpSession;

@RestController
@RequiredArgsConstructor
public class CartRestController {

    private final CartService cartService;
    private final HttpSession session;

    // 장바구니 담기
    @PostMapping("/carts/add")
    public ResponseEntity<?> addCartList() {
        User sessionUser = (User) session.getAttribute("sessionUser");

        if (sessionUser == null) {
            throw new Exception401("로그인을 해주세요");
        }

        cartService.addCartList(requestDTOs, sessionUser);

        return null;
    }


    // 장바구니 조회
    @GetMapping("/carts")
    public ResponseEntity<?> findAllByUser() {
        User sessionUser = (User) session.getAttribute("sessionUser");

        if (sessionUser == null) {
            throw new Exception401("로그인을 해주세요");
        }


        return null;
    }
}
