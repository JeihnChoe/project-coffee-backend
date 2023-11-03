package shop.mtcoding.projectcoffeebackend.user;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import shop.mtcoding.projectcoffeebackend.beverage.Beverage;
import shop.mtcoding.projectcoffeebackend.beverage.option.Option;
import shop.mtcoding.projectcoffeebackend.beverage.option.size.Size;
import shop.mtcoding.projectcoffeebackend.category.Category;
import shop.mtcoding.projectcoffeebackend.food.Food;

public class UserRequest {
    @Getter
    @Setter
    public static class RegistrationBeverageDTO {

        private String categoryName; // 카테고리 이름 나와야됨
        private String beveragePicUrl;
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
        private String foodPicUrl;
        private String foodName;
        private String foodEngName;
        private String foodDescription;
        private String foodTip;
        private Integer foodPrice;

        public Food toEntity() {
            return Food
                    .builder()
                    .category(category)
                    .foodPicUrl(foodPicUrl)
                    .foodName(foodName)
                    .foodEngName(foodEngName)
                    .foodDescription(foodDescription)
                    .foodTip(foodTip)
                    .foodPrice(foodPrice)
                    .build();

        }

    }
}
