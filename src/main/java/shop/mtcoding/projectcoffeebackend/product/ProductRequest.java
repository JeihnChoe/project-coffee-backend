package shop.mtcoding.projectcoffeebackend.product;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.Setter;
import shop.mtcoding.projectcoffeebackend.category.Category;

public class ProductRequest {
    @Getter
    @Setter
    public static class RegisterFoodDTO {
        private Category category;
        private MultipartFile picUrl;
        private String name;
        private String engName;
        private String description;
        private String tip;

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
