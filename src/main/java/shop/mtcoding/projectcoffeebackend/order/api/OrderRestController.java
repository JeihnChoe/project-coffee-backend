package shop.mtcoding.projectcoffeebackend.order.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import shop.mtcoding.projectcoffeebackend._core.errors.exception.Exception401;
import shop.mtcoding.projectcoffeebackend._core.utils.ApiUtils;
import shop.mtcoding.projectcoffeebackend.order.OrderService;
import shop.mtcoding.projectcoffeebackend.user.User;

import javax.servlet.http.HttpSession;


@RequestMapping("/api")
@RestController
@RequiredArgsConstructor
public class OrderRestController {

    private final HttpSession session;
    private OrderService orderService;

    @PostMapping("/orders/save")
        public ResponseEntity<?> save() {
User sessionUser =(User)session.getAttribute("sessionUser");

        if (sessionUser == null) {
            throw new Exception401("로그인을 해 주세요");
        }

        orderService.saveOrder(sessionUser);



        return ResponseEntity.ok().body(ApiUtils.success(null));
    }


}
