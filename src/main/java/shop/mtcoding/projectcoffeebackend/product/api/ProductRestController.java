package shop.mtcoding.projectcoffeebackend.product.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import shop.mtcoding.projectcoffeebackend.product.ProductService;

import java.util.List;

@RequestMapping("/api/product")
@RestController
@RequiredArgsConstructor
public class ProductRestController {

    private final ProductService productService;


    @GetMapping("/{id}/productlist") //카테고리아이디를 받아서 product 뿌림.
    public List<ProductRestResponse.ProductListDTO> viewProductListByCategoryId(@PathVariable Integer id) {


        List<ProductRestResponse.ProductListDTO> product = productService.findAllAndCategoryId(id);
        return product;
    }

    @GetMapping("/{id}/viewdetail")
    public ResponseEntity<?> viewProductDetail(@PathVariable Integer id) {

        List<ProductRestResponse.ProductDetailDTO> response = productService.findByProductId(id);

        return ResponseEntity.ok().body(response);
    }


}
