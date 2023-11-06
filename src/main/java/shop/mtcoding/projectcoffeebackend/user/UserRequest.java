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

        private String categoryName; // 카테고리 이름 나와야됨

        private MultipartFile beveragePicUrl;
        private String beverageName;
        private String beverageEngName;
        private String beverageDescription;
        private String beverageTip;
        private String hot;
        private String iced;
        private String size1;
        private String size2;
        private String size3;
        private Integer optionPrice1;
        private Integer optionPrice2;
        private Integer optionPrice3;

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
