package shop.mtcoding.projectcoffeebackend.category;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface CategoryJPARepository extends JpaRepository<Category, Integer> {

}
