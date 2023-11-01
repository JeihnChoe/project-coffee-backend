package shop.mtcoding.projectcoffeebackend.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ManagerController {
    @Autowired
    ManagerService managerService;

    @GetMapping("/")
    public String index() {

        return "index";
    }

    // 상품, 이벤트, 카드, 매출
    @GetMapping("/beverage")
    public String viewBeverage() {

        return "beverage";
    }

    // 상품, 이벤트, 카드, 매출
    @GetMapping("/foods")
    public String viewFoods() {

        return "foods";
    }

    @GetMapping("/manager/beverage/registration")
    public String registrationFoods() {
        managerService.음료추가();
        return "null";
    }
}
