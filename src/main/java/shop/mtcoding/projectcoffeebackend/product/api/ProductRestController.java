package shop.mtcoding.projectcoffeebackend.product.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import shop.mtcoding.projectcoffeebackend.product.ProductService;

import java.util.List;

@RequestMapping("/api")
@RestController
@RequiredArgsConstructor
public class ProductRestController {

    private final ProductService productService;

    @GetMapping("/product/{id}")
    public ResponseEntity<?> findAllByCategoryId(@PathVariable Integer id){

        List<ProductResponse.prodcutListAndPriceDTO> responseDTO = productService.prodcutListAndPriceDTO(id);

        return ResponseEntity.ok().header(null).body(null);
    }


}
