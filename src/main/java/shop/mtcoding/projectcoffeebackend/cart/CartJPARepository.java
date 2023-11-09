package shop.mtcoding.projectcoffeebackend.cart;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import shop.mtcoding.projectcoffeebackend.cart.api.CartRestResponse.ViewCartListDTO;
import shop.mtcoding.projectcoffeebackend.product.Product;

public interface CartJPARepository extends JpaRepository<Cart, Integer> {

    @Query(value = "select c from Cart c left join fetch c.option co left join fetch co.size cos where c.user.id = :userId")
    List<Cart> findByUserId(@Param("userId") Integer userId);

    @Query(value = "select c from Cart c where c.user.id = :userId")
    void deleteAllByUserId(@Param("userId") int userId);

    // @Query("select r from Notice r left join fetch r.techNotice rt left join
    // fetch r.user ru where r.id = :id")

    // void findByUserIdAndOptionId();

    // String name;
    // String engName;
    // String picUrl;
    // int price;
    // int quantity;
    // boolean isIced; // 아이스,핫
    // int size; // 컵사이즈(Short, Tall, Grande, Venti)
    // String cupType; // (매장컵, 개인컵, 일회용컵)
    // int totalPrice;
}
