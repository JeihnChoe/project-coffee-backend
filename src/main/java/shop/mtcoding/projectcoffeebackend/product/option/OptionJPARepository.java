package shop.mtcoding.projectcoffeebackend.product.option;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import shop.mtcoding.projectcoffeebackend.product.ProductResponse.MyProductDTO;
import shop.mtcoding.projectcoffeebackend.product.ProductResponse.MySizeAndOptionDTO;

public interface OptionJPARepository extends JpaRepository<Option, Integer> {

    // $는 내부클래스 참조하기 위한 접근자
    @Query(value = "SELECT new shop.mtcoding.projectcoffeebackend.product.ProductResponse$MySizeAndOptionDTO(o.id, p.id, o.price, s.size)\r\n"
            + "FROM Option o LEFT JOIN o.size s LEFT JOIN o.product p")
    List<MySizeAndOptionDTO> findAllWithSizeAndOption();

    @Query("select count(*) from Option o left join o.product p group by p.id")
    List<Integer> countProductId();

    // @Query("select o, o.product from Option o")
    // List<MyOptionDTO> findByProductId();

    // select o.product_id from option_tb o group by o.product_id;

}
