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
    @GetMapping("/manager/product/registerbeveragesform")
    public String viewBeverage() {

        return "/product/registerBeveragesForm";
    }

    // 상품, 이벤트, 카드, 매출
    @GetMapping("/manager/product/registerfoodsform")
    public String viewFoods() {

        return "/resources/templates/product/registerFoodsForm.mustache";
    }

    @GetMapping("manager/beverage/register")
    public String registrationFoods() {
        managerService.음료추가();
        return "null";
    }
}
