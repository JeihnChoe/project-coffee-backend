package shop.mtcoding.projectcoffeebackend.cart;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CartJPARepository extends JpaRepository<Cart, Integer> {

}
