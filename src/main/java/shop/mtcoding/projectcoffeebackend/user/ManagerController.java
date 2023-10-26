package shop.mtcoding.projectcoffeebackend.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ManagerController {

    @GetMapping("/")
    public String index() {
        return "/index";
    }
    // 상품, 이벤트, 카드, 매출
}
