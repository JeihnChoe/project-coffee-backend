package shop.mtcoding.projectcoffeebackend.product.option;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface OptionJPARepository extends JpaRepository<Option, Integer> {

    @Query("select count(*) from Option o where o.id = :id")
    Integer findByProductId(@Param("id") int i);

    @Query("select o from Option o left join o.product p left join o.size s where o.id = :optionId and p.isIced = :isIced and s.id = :sizeId")
    Optional<Option> findByOptionId(int optionId, int isIced, int sizeId);
}
