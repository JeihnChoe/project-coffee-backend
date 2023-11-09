package shop.mtcoding.projectcoffeebackend.product;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.Setter;

public class ProductRequest {
    @Getter
    @Setter
    public static class RegisterFoodDTO {
        private Integer categoryId;
        private MultipartFile picUrl;
        private String name;
        private String engName;
        private String description;
        private String tip;

    }
}
