package shop.mtcoding.projectcoffeebackend.cart.api;

import lombok.Getter;
import lombok.Setter;

public class CartRestResponse {

    @Getter
    @Setter
    public static class ViewCartListDTO {
        String productName;
        String productEngName;
        String productPicUrl;
        int price;
        int isIced; // 아이스,핫
        int size; // 컵사이즈(Short, Tall, Grande, Venti)
        int cup; // (매장컵, 개인컵, 일회용컵)
    }
}
