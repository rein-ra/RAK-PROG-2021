package ee.hw1_final.hw1_final.service;

import ee.hw1_final.hw1_final.Repository.CategoryRepository;
import ee.hw1_final.hw1_final.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> getCategories(){
        return categoryRepository.findAll();
    }

    public void saveCategory(Category category) {
        categoryRepository.save(category);
    }
}
