package shop.mtcoding.projectcoffeebackend.product;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductJPARepository extends JpaRepository<Product, Integer> {

    @Query(value = "select b.id, c.category_name, b.beverage_pic_url, b.beverage_name, b.beverage_eng_name, b.beverage_description, b.beverage_tip, b.hot_iced, o.option_price, s.size from beverage_tb b left join category_tb c on b.category_id = c.id left join option_tb o on b.id = o.beverage_id left join size_tb s on o.size_id = s.id", nativeQuery = true)
    List<Object[]> findAllWithOptionAndSize();

}
