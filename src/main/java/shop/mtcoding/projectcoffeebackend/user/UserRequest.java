package shop.mtcoding.projectcoffeebackend.user;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.Setter;
import shop.mtcoding.projectcoffeebackend.category.Category;

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
        private String foodPicUrl;
        private String foodName;
        private String foodEngName;
        private String foodDescription;
        private String foodTip;
        private Integer foodPrice;

        // public Product toEntity() {
        // return PRoduct
        // .builder()
        // .category(category)
        // .foodPicUrl(foodPicUrl)
        // .foodName(foodName)
        // .foodEngName(foodEngName)
        // .foodDescription(foodDescription)
        // .foodTip(foodTip)
        // .foodPrice(foodPrice)
        // .build();

        // }

    }
}
