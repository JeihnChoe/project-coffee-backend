package shop.mtcoding.projectcoffeebackend.product;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductJPARepository extends JpaRepository<Product, Integer> {

    @Query(value = "SELECT p.id AS product_id,\r\n" + //
            "c.id AS category_id,\r\n" + //
            "o.id AS option_id,\r\n" + //
            "s.id AS size_id\r\n" + //
            " FROM PRODUCT_TB p left join category_tb c on p.category_id = c.id left join option_tb o on p.id = o.product_id left join size_tb s on o.size_id = s.id", nativeQuery = true)
    List<Object[]> findAllWithOptionAndSize();

}
