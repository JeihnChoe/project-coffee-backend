package shop.mtcoding.projectcoffeebackend.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@RequiredArgsConstructor
@Controller
public class UserController {


    final private HttpSession session;
    final private UserService userService;

    @GetMapping("/test")
    public String test() {

        return "test";
    }

    @GetMapping("/")
    public String index() {

        return "index";
    }

    // 상품, 이벤트, 카드, 매출
    @GetMapping("/product/registerbeveragesform")
    public String viewBeverage() {

        return "/product/registerBeveragesForm";
    }

    @PostMapping("/beverage/register")
    public String registrationBeverages(UserRequest.RegistrationBeverageDTO requestDTO) {
        userService.음료추가(requestDTO);
        return "//manager/product/registerbeveragesform";
    }

    // 상품, 이벤트, 카드, 매출
    @GetMapping("/product/registerfoodsform")
    public String viewFoods() {

        return "/product/registerFoodsForm";
    }

    @PostMapping("/food/register")
    public String registrationFoods() {

        return "null";
    }

    @GetMapping("/manager/card/register")
    public String registrationCard() {

        return "registerCardsDivisionForm";
    }

    @GetMapping("manager/product/registerpromotionsform")
    public String registrationPromotions() {
        return "/product/registerPromotionForm";
    }
}