package shop.mtcoding.projectcoffeebackend.category;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.NoArgsConstructor;


@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class CategoryService {
    private final CategoryJPARepository categoryJPARepository;
    public List<CategoryResponse.FindAllListDTO> findAllListCategory() {
        List<Category> categoryPS = categoryJPARepository.findAll();
        return categoryPS.stream()
                .map(CategoryResponse.FindAllListDTO::new)
                .collect(Collectors.toList());
    }
}
