package com.example.demo.service.impl;
import java.util.List;
import org.springfraework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Category;
import com.example.demo.entity.repository.CategoryRepository;
import com.example.demo.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private CategoryRepository categoryRepository;

    @override
    public Category createCategory(Category category){
        return categoryRepository.save(category);
    }

    @override
    public Category getCategory(Long id){
        return categoryRepository.findById(id).orElse(null);
    }

    @override
    public List<Category> getAllCategories(){
        return CategoryRepository.findAll();
    }
}