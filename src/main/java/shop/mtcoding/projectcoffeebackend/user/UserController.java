package shop.mtcoding.projectcoffeebackend.user;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
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

    // 음료 등록 페이지
    @GetMapping("/product/registerbeveragesform")
    public String viewBeverage(HttpServletRequest request) {
        List<Object[]> beverages = userService.음료조회();
        request.setAttribute("beverages", beverages);
        return "/product/registerBeveragesForm";
    }



    @GetMapping("/product/registerfoodsform")
    public String viewFoods() {

        return "/product/registerFoodsForm";
    }

    @PostMapping("/product/registerfoods")
    public String registrationFoods(UserRequest.ResgisterFoodDTO requestDTO) {
        userService.푸드추가(requestDTO);
        return "/product/registerFoodsForm";
    }

    public String registrationFoods() {

        return "null";
    }

    @GetMapping("/manager/card/register")
    public String registrationCard() {

        return "registerCardsDivisionForm";
    }

}