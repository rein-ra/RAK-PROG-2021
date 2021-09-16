package ee.hw1_final.hw1_final.Controller;

import ee.hw1_final.hw1_final.model.Category;
import ee.hw1_final.hw1_final.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @GetMapping("itemcategories")
    public List<Category> getCategories() {
        return categoryService.getCategories();
    }

    @PostMapping("itemcategories")
    public String postCategory(@RequestBody Category category) {
        categoryService.saveCategory(category);
        return "Kategooria lisatud edukalt!" + category.getName() +"  "+ category.getCategory();
    }
}
