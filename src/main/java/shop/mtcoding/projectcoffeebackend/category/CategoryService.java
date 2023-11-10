package shop.mtcoding.projectcoffeebackend.category;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.NoArgsConstructor;
import shop.mtcoding.projectcoffeebackend.category.api.CategoryResponse;

import java.util.List;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class CategoryService {
    private final CategoryJPARepository categoryJPARepository;
    public CategoryResponse.CategoryListDTO 카테고리리스트() {
        List<Category> categoryList = categoryJPARepository.findAll();
        return new CategoryResponse.CategoryListDTO(categoryList);
    }
}
