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
    @GetMapping()//http://localhost:8080/categorias
    public ArrayList<CategoryModel> findAllCategories(){
        return categoryServices.findAllCategories();
    }

    //set
    @PostMapping() //http://localhost:8080/categorias
    public CategoryModel saveCategory(@RequestBody CategoryModel category){
        return categoryServices.SaveCategory(category);
    }
    //edit
    @PutMapping() // http://localhost:8080/categorias
    public CategoryModel updateCategory(@RequestBody CategoryModel category){
        return categoryServices.SaveCategory(category);
    }
    //findById
    @GetMapping(path = "/findById") //http://localhost:8080/categorias/findById?id=1
    public Optional<CategoryModel> findById(@RequestParam("id")Long id){
        return this.categoryServices.findById(id);
    }
    //deleteById
    @DeleteMapping(path = "/deleteById") //http://localhost:8080/categorias/deleteById?id=1
    public boolean deleteCategory(@RequestParam("id")Long id){
        return this.categoryServices.deleteCategory(id);
    }
}
