package shop.mtcoding.projectcoffeebackend.cart.api;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import lombok.*;
import shop.mtcoding.projectcoffeebackend.cart.Cart;
import shop.mtcoding.projectcoffeebackend.cart.api.CartRestResponse.ViewCartListDTO;
import shop.mtcoding.projectcoffeebackend.product.Product;
import shop.mtcoding.projectcoffeebackend.product.option.Option;
import shop.mtcoding.projectcoffeebackend.product.option.size.Size;

public class CartRestResponse {

    @Getter
    @Setter
    @ToString
    //카트리스트를 찾아왔다
    public static class ViewCartListDTO {
        private int totalPrice;
        private List<ProductDTO> productList;


        public ViewCartListDTO(List<Cart> cartList) {
            this.totalPrice = cartList.stream().mapToInt(cart -> cart.getTotalPrice()).sum();
            this.productList = cartList.stream()
                    .map(cart -> cart.getOption().getProduct()).distinct()
                    .map(product -> new ProductDTO(product, cartList))
                    .collect(Collectors.toList());
        }

        @Getter
        @Setter
        @ToString
        class ProductDTO{
                    private String name;
                    private String engName;
                    private String picUrl;
                    private boolean isIced;
                    private List<CartDTO> carts;

            public ProductDTO(Product product, List<Cart> cartList) {
                this.name = product.getName();
                this.engName = product.getEngName();
                this.picUrl = product.getPicUrl();
                this.isIced = product.getIsIced();
                this.carts = cartList.stream()
                        .filter(cart -> cart.getOption().getProduct().getId()==product.getId())
                        .map(cart -> new CartDTO(cart))
                        .collect(Collectors.toList());

            }
            @Getter
            @Setter
            @ToString
            private class CartDTO {
                private String cupType;
                private int quantity;
                private int price;
                private String size;
                private int sumPrice;

                public CartDTO(Cart cart) {
                    this.cupType = cart.getCupType();
                    this.quantity = cart.getQuantity();
                    this.price = cart.getOption().getPrice();
                    this.size = cart.getOption().getSize().getSize();
                    this.sumPrice = this.price*this.quantity;
                }
            }
        }
    }
}

            //        private int quantity; Cart
            //        private String cupType; Cart // (매장컵, 개인컵, 일회용컵)
            //        private int totalPrice; Cart


            //        private String name; Product
            //        private String engName; Product
            //        private String picUrl; Product
            //        private boolean isIced; Product
//        private int price; Option
//        private String size ; Size

