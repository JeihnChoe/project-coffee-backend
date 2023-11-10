package shop.mtcoding.projectcoffeebackend.category.api;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import shop.mtcoding.projectcoffeebackend.category.Category;
import shop.mtcoding.projectcoffeebackend.category.CategoryJPARepository;

import java.util.List;


public class CategoryResponse {

    @Getter
    @Setter
    public static class CategoryListDTO {
        List<Category> categoryList;

        public CategoryListDTO(List<Category> categoryList) {
            this.categoryList = categoryList;
        }
    }
}


