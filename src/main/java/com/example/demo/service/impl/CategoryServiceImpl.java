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
    public CategoryServiceImpl(CategoryRepository categoryRepository){
        this.categoryRepository=categoryRepository;
    @Override
    public Category createCategory(Category category){
        return categoryRepository.save(category);
    }

    @Override
    public Category getCategory(Long id){
        return categoryRepository.findById(id).orElse(null);
    }

    @Override
    public List<Category> getAllCategories(){
        return categoryRepository.findAll();
    }
}