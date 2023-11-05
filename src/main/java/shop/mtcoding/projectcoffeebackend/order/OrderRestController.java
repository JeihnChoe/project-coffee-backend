package shop.mtcoding.projectcoffeebackend.order;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import shop.mtcoding.projectcoffeebackend._core.errors.exception.Exception401;
import shop.mtcoding.projectcoffeebackend.user.User;

import javax.servlet.http.HttpSession;

@RestController
@RequiredArgsConstructor
public class OrderRestController {

    private final HttpSession session;
    private final OrderService orderService;

    @GetMapping("/order/save")
    public ResponseEntity<?> save() {
        User sessionUser = (User) session.getAttribute("sessionUser");

        if (sessionUser == null) {
            throw new Exception401("로그인을 해주세요");
        }

        orderService.saveOrder(sessionUser);

        return null;
    }


}
