package shop.mtcoding.projectcoffeebackend.product;

import javax.servlet.http.HttpServletRequest;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.RequiredArgsConstructor;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ProductController {

    final private ProductService productService;

    // 음료 등록 페이지
    @GetMapping("/product/{id}/registerbeveragesform")
    public String viewBeverage(@RequestParam(defaultValue = "0") Integer page, HttpServletRequest request,
            @PathVariable Integer id) {
        System.out.println("id값 :" + id);
        // Page<MyProductDTO> beveragePG = productService.음료조회(page, id);

        ProductResponse.MyProductDTO response = productService.음료조회(page, id);
        // request.setAttribute("page", page);
        request.setAttribute("response", response);
        // request.setAttribute("prevPage", beveragePG.getNumber() - 1);
        // request.setAttribute("nextPage", beveragePG.getNumber() + 1);

        return "/product/registerBeveragesForm";
    }

    @PostMapping("/beverage/register")
    // @RequestMapping(value = "/manager/beverage/register", method = {
    // RequestMethod.POST })
    public String registrationBeverages(ProductRequest.RegistrationBeverageDTO requestDTO) {
        System.out.println("컨트롤러 isIced : " + requestDTO.getIsIced());
        productService.음료추가(requestDTO);
        return "redirect:/product/1/registerbeveragesform";
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
