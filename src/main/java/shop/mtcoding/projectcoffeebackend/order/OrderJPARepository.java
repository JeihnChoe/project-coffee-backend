package shop.mtcoding.projectcoffeebackend.order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderJPARepository extends JpaRepository<Order, Integer> {

}
