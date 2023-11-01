package shop.mtcoding.projectcoffeebackend.user;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;
import shop.mtcoding.projectcoffeebackend.beverage.Beverage;
import shop.mtcoding.projectcoffeebackend.beverage.option.size.Size;
import shop.mtcoding.projectcoffeebackend.category.Category;

public class ManagerRequest {
    @Getter
    @Setter
    public static class RegistrationBeverageDTO {

        private String beverageName;
        private String beverageEngName;
        private String beverageDescription;
        private String beverageTip;
        private String hotIce;
        private String beveragePicUrl;
        private Category category; // 카테고리 이름 나와야됨

        private int optionPrice;

        private Beverage beverage;
        private Size size;

        private String liquid_amount;
        private String size_pic_url;

    }
}
