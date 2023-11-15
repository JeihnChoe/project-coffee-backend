package shop.mtcoding.projectcoffeebackend.order.item;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ItemJPARepository extends JpaRepository<Item, Integer> {

    @Query(value = "select i from Item i left join i.order ior left join i.option iop left join iop.size iops left join iop.product iopp left join ior.user ioru where ioru.id = :userId")
    List<Item> findAllOrderById(Integer userId);
//
//
//    @Query(value = "select sum(i.totalAmount) from Item i")
//    int findTotalSales();
//
//
//    @Query(value = "select i, SUM(i.totalAmount) from Item i left join i.option o left join o.product p group by p.id order by SUM(i.totalAmount) desc")
//    Item findBestSaleMenu();
}
