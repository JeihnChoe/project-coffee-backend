package shop.mtcoding.projectcoffeebackend.product.api;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import shop.mtcoding.projectcoffeebackend.product.Product;

public class ProductRestResponse {


    @Getter
    @Setter
    public static class ProductListDTO {

        private int categoryId;
        private int productId;
        private String name;
        private String engName;
        private String picUrl;
        private int optionId;
        private int price;

        public ProductListDTO(Product product) {
            this.categoryId = product.getCategory().getId();
            this.productId = product.getId();
            this.name = product.getName();
            this.engName = product.getEngName();
            this.picUrl = product.getPicUrl();
            this.optionId = product.getOptions().size() == 4 ? product.getOptions().get(1).getId() : product.getOptions().get(0).getId();
            this.price = product.getOptions().size() == 4 ? product.getOptions().get(1).getPrice() : product.getOptions().get(0).getPrice();
        }

    }


    @Data
    public static class ProductDetailDTO {
        Integer productId;
        String picUrl;
        String productName;
        String productEngName;
        Integer optionId;
        Integer optionPrice;
        Integer isIced;
        String tip;
        String description;
        Integer sizeType;

        public ProductDetailDTO(Product product) {
            this.productId = product.getId();
            this.picUrl = product.getPicUrl();
            this.productName = product.getName();
            this.productEngName = product.getEngName();
            this.optionId = product.getOptions().get(0).getId();
            this.optionPrice = product.getOptions().get(0).getPrice();
            this.isIced = product.getIsIced();
            this.tip = product.getTip();
            this.description = product.getDescription();
            this.sizeType = product.getOptions().get(0).getSize() != null ? product.getOptions().get(0).getSize().getSizeType() : 4;
        }
    }
}
