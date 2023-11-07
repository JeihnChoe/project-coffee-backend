package shop.mtcoding.projectcoffeebackend.product;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.RequiredArgsConstructor;
import shop.mtcoding.projectcoffeebackend.product.ProductResponse.MyProductDTO;
import shop.mtcoding.projectcoffeebackend.product.ProductResponse.MySizeAndOptionDTO;
import shop.mtcoding.projectcoffeebackend.user.UserRequest;

@Controller
@RequiredArgsConstructor
public class ProductController {

    final private ProductService productService;

    // 음료 등록 페이지
    @GetMapping("/product/registerbeveragesform")
    public String viewBeverage(HttpServletRequest request) {
        List<MyProductDTO> beverages = productService.음료조회();
        List<MySizeAndOptionDTO> options = productService.옵션조회();
        request.setAttribute("beverages", beverages);
        request.setAttribute("options", options);
        return "/product/registerBeveragesForm";
    }

    @PostMapping("/beverage/register")
    // @RequestMapping(value = "/manager/beverage/register", method = {
    // RequestMethod.POST })
    public String registrationBeverages(UserRequest.RegistrationBeverageDTO requestDTO) {

        productService.음료추가(requestDTO);
        return "/product/registerBeveragesForm";
    }

}
