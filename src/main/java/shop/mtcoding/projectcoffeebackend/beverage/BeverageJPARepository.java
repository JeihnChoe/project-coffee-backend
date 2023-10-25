package shop.mtcoding.projectcoffeebackend.beverage;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BeverageJPARepository extends JpaRepository<Beverage, Integer> {

}
