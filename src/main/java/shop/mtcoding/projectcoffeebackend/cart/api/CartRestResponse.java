package shop.mtcoding.projectcoffeebackend.cart.api;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import shop.mtcoding.projectcoffeebackend.cart.Cart;
import shop.mtcoding.projectcoffeebackend.cart.api.CartRestResponse.ViewCartListDTO;
import shop.mtcoding.projectcoffeebackend.product.Product;
import shop.mtcoding.projectcoffeebackend.product.option.Option;
import shop.mtcoding.projectcoffeebackend.product.option.size.Size;

public class CartRestResponse {

    @Getter
    @Setter
    public static class ViewCartListDTO {

        private String name;
        private String engName;
        private String picUrl;
        private int price;
        private int quantity;
        private String cupType; // (매장컵, 개인컵, 일회용컵)
        private int totalPrice;

        @Builder
        public ViewCartListDTO(Product product, Option option, Cart cart) {

            // this.carts = cartPS.stream().map(cartPS -> new
            // ViewCartListDTO(cartPS)).collect(Collectors.toList());

            this.name = product.getName();
            this.engName = product.getEngName();
            this.picUrl = product.getPicUrl();
            this.price = option.getPrice();
            this.quantity = cart.getQuantity();
            this.cupType = cart.getCupType();
            this.totalPrice = cart.getTotalPrice();
        }
    }
}
