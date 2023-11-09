package shop.mtcoding.projectcoffeebackend.product;

import javax.servlet.http.HttpServletRequest;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.RequiredArgsConstructor;
import shop.mtcoding.projectcoffeebackend.product.ProductResponse.MyProductDTO;

@Controller
@RequiredArgsConstructor
public class ProductController {

    final private ProductService productService;

    // 음료 등록 페이지
    @GetMapping("/product/registerbeveragesform")
    public String viewBeverage(@RequestParam(defaultValue = "0") Integer page, HttpServletRequest request) {
        Page<MyProductDTO> beveragePG = productService.음료조회(page);
        request.setAttribute("page", page);
        request.setAttribute("beveragePG", beveragePG);
        request.setAttribute("prevPage", beveragePG.getNumber() - 1);
        request.setAttribute("nextPage", beveragePG.getNumber() + 1);

        return "/product/registerBeveragesForm";
    }

    @PostMapping("/beverage/register")
    // @RequestMapping(value = "/manager/beverage/register", method = {
    // RequestMethod.POST })
    public String registrationBeverages(ProductRequest.RegistrationBeverageDTO requestDTO) {

        productService.음료추가(requestDTO);
        return "redirect:/product/registerbeveragesform";
    }

}
