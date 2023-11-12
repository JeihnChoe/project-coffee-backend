package shop.mtcoding.projectcoffeebackend.product.api;

import java.util.List;
import java.util.stream.Collectors;

import lombok.Getter;
import lombok.Setter;
import shop.mtcoding.projectcoffeebackend.product.Product;

public class ProductRestResponse {
    @Getter
    @Setter
    public static class ProductListDTO {
        private int productId;
        private String name;
        private String engName;
        private String picUrl;
        private int optionId;
        private int price;

        public ProductListDTO(Product product) {
            this.productId = product.getId();
            this.name = product.getName();
            this.engName = product.getEngName();
            this.picUrl = product.getPicUrl();
            this.optionId = product.getOptions().get(0).getId();
            this.price = product.getOptions().get(0).getPrice();
        }

    }

}
