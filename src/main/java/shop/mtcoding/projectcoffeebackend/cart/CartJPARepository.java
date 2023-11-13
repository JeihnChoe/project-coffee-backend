package shop.mtcoding.projectcoffeebackend.cart;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface CartJPARepository extends JpaRepository<Cart, Integer> {

    @Query(value = "select c from Cart c left join fetch c.option co left join fetch co.size cos where c.user.id = :userId")
    List<Cart> findByUserId(@Param("userId") Integer userId);

    @Transactional
    @Modifying
    @Query(value = "DELETE Cart c where c.user.id = :userId")
    void deleteAllByUserId(@Param("userId") int userId);

    // @Query("select r from Notice r left join fetch r.techNotice rt left join
    // fetch r.user ru where r.id = :id")

    // void findByUserIdAndOptionId();

    // String name;
    // String engName;
    // String picUrl;
    // int price;
    // int quantity;
    // int isIced; // 아이스,핫
    // int size; // 컵사이즈(Short, Tall, Grande, Venti)
    // int cupType; // (매장컵, 개인컵, 일회용컵)
    // int totalPrice;
}
