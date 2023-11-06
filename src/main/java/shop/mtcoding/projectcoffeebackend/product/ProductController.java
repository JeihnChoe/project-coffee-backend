package shop.mtcoding.projectcoffeebackend.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import shop.mtcoding.projectcoffeebackend.user.UserRequest;

@RequiredArgsConstructor
@Controller
public class ProductController {

    final ProductService productService;

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
        productService.음료추가(requestDTO);
        return "/product/registerBeveragesForm";
    }
}
