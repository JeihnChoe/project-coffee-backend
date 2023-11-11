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
    public static class FindAllListDTO { // See All의 카테고리DTO List
        private int id;
        private String name;
        private String engName;
        private int code;
        private String picUrl;
        public FindAllListDTO(Category category) {
            this.id = category.getId();
            this.name = category.getName();
            this.engName = category.getEngName();
            this.code = category.getCode();
            this.picUrl = category.getPicUrl();
        }
    }
}


