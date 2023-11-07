package shop.mtcoding.projectcoffeebackend.cart;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import shop.mtcoding.projectcoffeebackend.cart.api.CartRestResponse.ViewCartListDTO;

public interface CartJPARepository extends JpaRepository<Cart, Integer> {

    @Query("select new shop.mtcoding.projectcoffeebackend.cart.api.CartRestResponse$ViewCartListDTO(c.id, p.name, p.engName, p.picUrl, o.price, o.isIced, s.size, c.cupType, c.totalPrice) FROM Cart c LEFT JOIN c.option o LEFT JOIN o.product p)")
    List<ViewCartListDTO> findByUserIdAndOptionId(int userId);

    // String productName;
    // String productEngName;
    // String productPicUrl;
    // int price;
    // int isIced; // 아이스,핫
    // int size; // 컵사이즈(Short, Tall, Grande, Venti)
    // int cup; // (매장컵, 개인컵, 일회용컵)

}
