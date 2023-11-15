package shop.mtcoding.projectcoffeebackend.order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import shop.mtcoding.projectcoffeebackend.order.item.Item;

public interface OrderJPARepository extends JpaRepository<Order, Integer> {

//    @Query(value = "select count(o) from Order o left join o.items i where DATE(i.paymentTime) = CURDATE()")
//    int findTotalOrders();
}
