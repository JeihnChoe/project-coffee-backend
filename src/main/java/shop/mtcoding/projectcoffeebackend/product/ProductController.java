package shop.mtcoding.projectcoffeebackend.product;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.RequiredArgsConstructor;
import shop.mtcoding.projectcoffeebackend.user.UserRequest;

@Controller
@RequiredArgsConstructor
public class ProductController {

    final private ProductService productService;

    // 음료 등록 페이지
    @GetMapping("/product/registerbeveragesform")
    public String viewBeverage(HttpServletRequest request) {
        List<MyProductDTO> beverages = productService.음료조회();
        System.out.println("컨트롤러 테스트 : " + beverages.get(0).getPrice());
        System.out.println("컨트롤러 테스트 : " + beverages.get(0).getDescription());
        request.setAttribute("beverages", beverages);
        return "/product/registerBeveragesForm";
    }

    @PostMapping("/beverage/register")
    // @RequestMapping(value = "/manager/beverage/register", method = {
    // RequestMethod.POST })
    public String registrationBeverages(UserRequest.RegistrationBeverageDTO requestDTO) {

        productService.음료추가(requestDTO);
        return "/product/registerBeveragesForm";
    }

    @GetMapping("/product/registerfoodsform")
    public String viewFoods() {

        return "/product/registerFoodsForm";
    }

    @PostMapping("/product/registerfoods")
    public String registrationFoods(ProductRequest.RegisterFoodDTO resgisterFoodDTO) {

        productService.푸드추가(resgisterFoodDTO);

        return "/product/registerFoodsForm";
    }

}
