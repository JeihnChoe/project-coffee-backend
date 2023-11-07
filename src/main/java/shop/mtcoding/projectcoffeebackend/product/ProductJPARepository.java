package shop.mtcoding.projectcoffeebackend.product;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import shop.mtcoding.projectcoffeebackend.product.ProductResponse.MyProductDTO;
import shop.mtcoding.projectcoffeebackend.product.option.Option;

public interface ProductJPARepository extends JpaRepository<Product, Integer> {

}
