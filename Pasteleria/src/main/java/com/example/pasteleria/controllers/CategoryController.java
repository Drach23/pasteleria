package com.example.pasteleria.controllers;

import com.example.pasteleria.Models.CategoryModel;
import com.example.pasteleria.services.CategoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/categorias")
public class CategoryController {
    @Autowired
    CategoryServices categoryServices;

    //get
    @GetMapping()
    public ArrayList<CategoryModel> findAllCategories(){
        return categoryServices.findAllCategories();
    }

    //set
    @PostMapping()
    public CategoryModel saveCategory(@RequestBody CategoryModel category){
        return categoryServices.SaveCategory(category);
    }
    //edit
    @PutMapping()
    public CategoryModel updateCategory(@RequestBody CategoryModel category){
        return categoryServices.SaveCategory(category);
    }
    //findById
    @GetMapping(path = "/findById")
    public Optional<CategoryModel> findById(@RequestParam("id")Long id){
        return this.categoryServices.findById(id);
    }
    //deleteById
    @DeleteMapping(path = "/deleteById")
    public boolean deleteCategory(@RequestParam("id")Long id){
        return this.categoryServices.deleteCategory(id);
    }
}
