package shop.mtcoding.projectcoffeebackend.product.api;

import lombok.Getter;
import lombok.Setter;
import shop.mtcoding.projectcoffeebackend.category.Category;
import shop.mtcoding.projectcoffeebackend.product.Product;
import shop.mtcoding.projectcoffeebackend.product.ProductResponse;
import shop.mtcoding.projectcoffeebackend.product.option.Option;

import java.util.List;
import java.util.stream.Collectors;

public class ProductRestResponse {

    @Getter
    @Setter
    public static class FindAllProductDTO {
        private List<ProductListDTO> productList;

        public FindAllProductDTO(List<Product> products) {
            this.productList = products.stream()
                    .distinct()
                    .map(product -> new ProductListDTO(product))

                    .collect(Collectors.toList());

        }

        @Getter
        @Setter
        class ProductListDTO {
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
            // @Getter
            // @Setter
            // class OptionDTO {
            // private int id;
            // private int price;
            //
            // public OptionDTO(Option option) {
            // this.id = option.getId();
            // this.price = option.getPrice();
            // }
            // }
        }

    }

}
