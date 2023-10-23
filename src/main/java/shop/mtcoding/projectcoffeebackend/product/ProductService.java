package shop.mtcoding.projectcoffeebackend.product;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import shop.mtcoding.projectcoffeebackend._core.errors.exception.Exception404;
import shop.mtcoding.projectcoffeebackend.product.ProductResponse.FindAllDTO;
import shop.mtcoding.projectcoffeebackend.product.ProductResponse.FindByProductIdDTO;

@Service
@Transactional(readOnly = true)
public class ProductService {

    @Autowired
    private ProductJPARepository productJPARepository;

    public List<FindAllDTO> findAllproduct() {

        System.out.println("테스트 : 서비스 소환");

        // List<Product> productPS = productRepository.findAll();
        List<Product> productLists = productJPARepository.findAll();

        System.out.println(productLists.get(0).getProductName());

        List<FindAllDTO> findAllDTOs = productLists.stream()
                .map(product -> new ProductResponse.FindAllDTO(product))
                .collect(Collectors.toList());

        System.out.println(findAllDTOs);

        return findAllDTOs;

    }

    public FindByProductIdDTO findByProductId(int id) {

        System.out.println(id);

        Product productPS = productJPARepository.findById(id)
                .orElseThrow(() -> new Exception404("해당 id의 상품을 찾을수 없습니다.: " + id));

        FindByProductIdDTO findByProductIdDTO = new FindByProductIdDTO(productPS);

        System.out.println(findByProductIdDTO);

        return findByProductIdDTO;
    }

}
