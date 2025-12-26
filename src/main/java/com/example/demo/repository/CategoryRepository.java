package com.example.demo.repository;

import com.example.demo.model.Category;
import java.util.Optional;

public interface CategoryRepository {
    Category save(Category category);
    Optional<Category> findById(Long id);
}