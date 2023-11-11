package shop.mtcoding.projectcoffeebackend.product.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import shop.mtcoding.projectcoffeebackend.product.Product;
import shop.mtcoding.projectcoffeebackend.product.ProductService;

import java.util.List;

@RequestMapping("/api")
@RestController
@RequiredArgsConstructor
public class ProductRestController {

    public void hello(){}


    private final ProductService productService;
    @GetMapping("/category/{id}/productList")
    public ProductRestResponse.FindAllProductDTO ProductList(@PathVariable Integer id){
        ProductRestResponse.FindAllProductDTO product = productService.findAllAndCategoryId(id);
        return product;
    }
 
}
