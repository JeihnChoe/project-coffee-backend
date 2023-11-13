package shop.mtcoding.projectcoffeebackend.order.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import shop.mtcoding.projectcoffeebackend._core.errors.exception.Exception401;
import shop.mtcoding.projectcoffeebackend._core.utils.ApiUtils;
import shop.mtcoding.projectcoffeebackend.order.OrderService;
import shop.mtcoding.projectcoffeebackend.order.item.ItemJPARepository;
import shop.mtcoding.projectcoffeebackend.user.User;

import javax.servlet.http.HttpSession;
import java.util.List;


@RequestMapping("/api/order")
@RestController
@RequiredArgsConstructor
public class OrderRestController {

    private final HttpSession session;
    private OrderService orderService;

    @PostMapping("/save")
        public ResponseEntity<?> save() {
        if (session == null) {
            throw new Exception401("로그인을 해 주세요");
        }

        User sessionUser =(User)session.getAttribute("sessionUser");

        orderService.saveOrder(sessionUser);

        return ResponseEntity.ok().body(ApiUtils.success(null));
    }

    @GetMapping("/viewallorder")
    public ResponseEntity<?> viewAllOrder(){
        if (session == null) {
            throw new Exception401("로그인이 필요한 서비스입니다.");
        }
        User sessionUser =(User)session.getAttribute("sessionUser");
        System.out.println(sessionUser.getUserName());
        List<OrderRestResponse.FindAllOrderDTO> response =  orderService.viewAllOrder(sessionUser.getId());

        return ResponseEntity.ok().body(ApiUtils.success(response));

    }

}
