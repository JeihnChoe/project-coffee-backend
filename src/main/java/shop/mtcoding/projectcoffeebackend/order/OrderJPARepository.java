package shop.mtcoding.projectcoffeebackend.order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface OrderJPARepository extends JpaRepository<Order, Integer> {

}
