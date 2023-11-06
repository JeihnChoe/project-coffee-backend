package shop.mtcoding.projectcoffeebackend.user;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.Setter;
import shop.mtcoding.projectcoffeebackend.category.Category;
import shop.mtcoding.projectcoffeebackend.product.Product;

public class UserRequest {
    @Getter
    @Setter
    public static class RegistrationBeverageDTO {

        private int categoryId; // value를 categoryId로 바로 받음

        private MultipartFile picUrl;
        private String name;
        private String engName;
        private String description;
        private String tip;
        private String hot; // 0
        private String iced; // 1
        private Integer size1;
        private Integer size2;
        private Integer size3;
        private Integer price1;
        private Integer price2;
        private Integer price3;

    }

    @Getter
    @Setter
    public static class ResgisterFoodDTO {
        private Category category;
        private String picUrl;
        private String name;
        private String engName;
        private String description;
        private String tip;
        private Integer price;

        public Product toEntity() {
            return Product
                    .builder()
                    .category(category)
                    .picUrl(picUrl)
                    .name(name)
                    .engName(engName)
                    .description(description)
                    .tip(tip)
                    .build();

        }

    }
}
