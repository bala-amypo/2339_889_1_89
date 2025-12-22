// package com.example.demo.controller;
// import java.util.List;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.*;
// import io.swagger.v3.oas.annotations.tags.Tag;
// import com.example.demo.model.Category;
// import com.example.demo.service.CategoryService;
// import org.springframework.web.bind.annotation.PathVariable;


// @RestController
// @RequestMapping("/api/categories")
// @Tag(name = "Categories Endpoints")
// public class CategoryController {

//     @Autowired
//     CategoryService categoryService;

//     @PostMapping
//     public Category createCategory(@RequestBody Category category){
//         return categoryService.createCategory(category);
//     }
//     @GetMapping
//     public List<Category> getAllCategories(){
//         return categoryService.getAllCategories();
//     }

//     @GetMapping("/{id}")
//     public Category getCategory(@PathVariable Long id){
//         return categoryService.getCategory(id);
//     }
// }
