package shop.mtcoding.projectcoffeebackend.product.option;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface OptionJPARepository extends JpaRepository<Option, Integer> {

    @Query("select count(*) from Option o where o.id = :id")
    Integer findByProductId(@Param("id") int i);

}
