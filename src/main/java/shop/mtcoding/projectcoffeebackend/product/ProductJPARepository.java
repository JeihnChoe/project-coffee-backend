package shop.mtcoding.projectcoffeebackend.product;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import shop.mtcoding.projectcoffeebackend.product.ProductResponse.MyProductDTO;
import shop.mtcoding.projectcoffeebackend.product.option.Option;

public interface ProductJPARepository extends JpaRepository<Product, Integer> {

    // $는 내부클래스 참조하기 위한 접근자
    @Query(value = "SELECT new shop.mtcoding.projectcoffeebackend.product.ProductResponse$MyProductDTO(p.id, c.name, p.picUrl, p.name, p.engName, p.description, p.tip, p.isIced, o.price, s.size)\r\n"
            + "FROM Option o LEFT JOIN o.size s LEFT JOIN o.product p LEFT JOIN p.category c")
    List<MyProductDTO> findAllWithOptionAndSize();

}
