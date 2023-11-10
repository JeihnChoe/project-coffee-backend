package shop.mtcoding.projectcoffeebackend.product;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import shop.mtcoding.projectcoffeebackend.product.ProductResponse.MyProductDTO;
public interface ProductJPARepository extends JpaRepository<Product, Integer> {

    // $는 내부클래스 참조하기 위한 접근자
    @Query(value = "SELECT new shop.mtcoding.projectcoffeebackend.product.ProductResponse$MyProductDTO(o.id, c.name , p.picUrl, p.name , p.engName, p.description, p.tip, p.isIced, o.price, s.size)\r\n"
            + "FROM Option o LEFT JOIN o.size s LEFT JOIN o.product p LEFT JOIN p.category c ")
    Page<MyProductDTO> findAllWithOptionAndSize(Pageable Page);

}
