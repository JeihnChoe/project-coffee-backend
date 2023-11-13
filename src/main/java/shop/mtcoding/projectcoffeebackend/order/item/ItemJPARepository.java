package shop.mtcoding.projectcoffeebackend.order.item;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ItemJPARepository extends JpaRepository<Item, Integer> {

    @Query(value = "select i from Item i left join i.order ior left join i.option iop left join iop.size iops left join iop.product iopp left join ior.user ioru where ioru.id = :userId")
    List<Item> findAllOrderById(Integer userId);
}
