package shop.mtcoding.projectcoffeebackend.cart.api;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class CartRestRequest {

    @Getter
    @Setter
    @ToString
    public static class AddCartListDTO {
        private int optionId;
        private int quantity;
        private String cupType;
    }

}
