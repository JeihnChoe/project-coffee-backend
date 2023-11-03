package shop.mtcoding.projectcoffeebackend.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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

    @PostMapping("/manager/beverage/register")
    public String registrationBeverages(ManagerRequest.RegistrationBeverageDTO requestDTO) {
        managerService.음료추가(requestDTO);
        return "//manager/product/registerbeveragesform";
    }

    // 상품, 이벤트, 카드, 매출
    @GetMapping("/manager/product/registerfoodsform")
    public String viewFoods() {

        return "/product/registerFoodsForm";
    }

    @PostMapping("manager/food/register")
    public String registrationFoods() {

        return "null";
    }

    @GetMapping("/manager/card/register")
    public String registrationCard() {

        return "/cards/registerCardsForm";
    }


    @GetMapping("manager/product/registerpromotionsform")
    public String registrationPromotions() {
        return "/product/registerPromotionForm";
    }
}
