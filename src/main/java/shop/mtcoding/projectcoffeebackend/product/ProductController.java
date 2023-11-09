package shop.mtcoding.projectcoffeebackend.product;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.RequiredArgsConstructor;
import shop.mtcoding.projectcoffeebackend.product.ProductResponse.MyProductDTO;

@Controller
@RequiredArgsConstructor
public class ProductController {

    final private ProductService productService;

    // 음료 등록 페이지
    @GetMapping("/product/registerbeveragesform")
    public String viewBeverage(HttpServletRequest request) {
        List<MyProductDTO> beverages = productService.음료조회();
        request.setAttribute("beverages", beverages);
        return "/product/registerBeveragesForm";
    }

    @PostMapping("/beverage/register")
    // @RequestMapping(value = "/manager/beverage/register", method = {
    // RequestMethod.POST })
    public String registrationBeverages(ProductRequest.RegistrationBeverageDTO requestDTO) {

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

    @PostMapping("/product/deletefoods")
    public String deleteFoods(String id, HttpServletRequest request) {
        int foodId = Integer.parseInt(id);
        productService.푸드삭제(foodId);

        return "/product/registerFoodsForm";
    }

}
