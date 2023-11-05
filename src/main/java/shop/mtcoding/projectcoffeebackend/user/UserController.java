package shop.mtcoding.projectcoffeebackend.user;

import lombok.RequiredArgsConstructor;
import shop.mtcoding.projectcoffeebackend.beverage.Beverage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

    @PostMapping("/beverage/register")
    // @RequestMapping(value = "/manager/beverage/register", method = {
    // RequestMethod.POST })
    public String registrationBeverages(UserRequest.RegistrationBeverageDTO requestDTO) {
        System.out.println("테스트 제품명: " + requestDTO.getBeverageName());
        System.out.println("테스트 제품영문명 : " + requestDTO.getBeverageEngName());
        System.out.println("테스트 설명: " + requestDTO.getBeverageDescription());
        System.out.println("테스트 팁: " + requestDTO.getBeverageTip());
        System.out.println("테스트 핫/아이스: " + requestDTO.getHot());
        System.out.println("테스트 핫/아이스: " + requestDTO.getIced());
        System.out.println("테스트 사진 url: " + requestDTO.getBeveragePicUrl());
        System.out.println("테스트 카테고리이름: " + requestDTO.getCategoryName());
        System.out.println("테스트 크기1: " + requestDTO.getSize1());
        System.out.println("테스트 크기2: " + requestDTO.getSize2());
        System.out.println("테스트 크기3: " + requestDTO.getSize3());
        System.out.println("테스트 가격1: " + requestDTO.getOptionPrice1());
        System.out.println("테스트 가격2: " + requestDTO.getOptionPrice2());
        System.out.println("테스트 가격3: " + requestDTO.getOptionPrice3());
        userService.음료추가(requestDTO);
        return "/product/registerBeveragesForm";
    }

    @GetMapping("/product/registerfoodsform")
    public String viewFoods() {

        return "/product/registerFoodsForm";
    }

    @PostMapping("/food/register")
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