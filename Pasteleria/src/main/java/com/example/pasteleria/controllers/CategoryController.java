package com.example.pasteleria.controllers;

import com.example.pasteleria.Models.CategoryModel;
import com.example.pasteleria.services.CategoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

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
}
