package shop.mtcoding.projectcoffeebackend.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import shop.mtcoding.projectcoffeebackend._core.utils.ApiUtils;
import shop.mtcoding.projectcoffeebackend.product.ProductResponse.FindAllDTO;
import shop.mtcoding.projectcoffeebackend.product.ProductResponse.FindByProductIdDTO;

import lombok.ToString;

@RestController
public class ProductRestController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<?> findAllProduct() {

        List<FindAllDTO> responseDTO = productService.findAllproduct();

        return ResponseEntity.ok().body(ApiUtils.success(responseDTO));

    }

    @GetMapping("/products/{id}")
    public ResponseEntity<?> findById(@PathVariable int id) {

        System.out.println(id);

        FindByProductIdDTO responseDTO = productService.findByProductId(id);

        System.out.println();

        System.out.println("테스트 : 컨트롤러 최종");
        return ResponseEntity.ok().body(ApiUtils.success(responseDTO));

    }

}
