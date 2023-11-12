package shop.mtcoding.projectcoffeebackend.product.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import shop.mtcoding.projectcoffeebackend.product.Product;
import shop.mtcoding.projectcoffeebackend.product.ProductService;

import java.util.List;

@RequestMapping("/api/product")
@RestController
@RequiredArgsConstructor
public class ProductRestController {

    private final ProductService productService;

    @GetMapping("/{id}/productlist")
    public ProductRestResponse.FindAllProductDTO viewProductListByCategoryId(@PathVariable Integer id){
        ProductRestResponse.FindAllProductDTO product = productService.findAllAndCategoryId(id);
        return product;
    }

}
