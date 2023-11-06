package shop.mtcoding.projectcoffeebackend.product;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductJPARepository extends JpaRepository<Product, Integer> {

    @Query(value = "SELECT new shop.mtcoding.projectcoffeebackend.product.MyProductDTO(p.id, c.name, p.picUrl, p.name, p.engName, p.description, p.tip, p.isIced, o.price, s.size) \r\n"
            + //
            "FROM Product p\r\n" + //
            "LEFT JOIN p.category c\r\n" + //
            "LEFT JOIN p.options o\r\n" + //
            "LEFT JOIN o.size s")
    List<MyProductDTO> findAllWithOptionAndSize();
    // select p.id, c.name, p.pic_url, p.name, p.eng_name, p.description, p.tip,
    // p.is_iced, o.price, s.size from product_tb p left join category_tb c on
    // p.category_id= c.id left join option_tb o on p.id= o.product_id left join
    // size_tb s on o.size_id=s.id

}
