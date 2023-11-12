package shop.mtcoding.projectcoffeebackend.category.api;

import lombok.Getter;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import shop.mtcoding.projectcoffeebackend._core.utils.ApiUtils;
import shop.mtcoding.projectcoffeebackend.category.Category;
import shop.mtcoding.projectcoffeebackend.category.CategoryService;

import java.util.List;

@RequestMapping("/api/category")
@RestController
@RequiredArgsConstructor
public class CategoryRestController {
    private final CategoryService categoryService;
    @GetMapping("/viewlist")
    public List<CategoryResponse.FindAllListDTO> category(){
        List<CategoryResponse.FindAllListDTO> findCategoryList = categoryService.findAllListCategory();
        return findCategoryList;
    }
}
