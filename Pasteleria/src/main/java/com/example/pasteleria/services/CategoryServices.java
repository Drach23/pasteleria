package com.example.pasteleria.services;

import com.example.pasteleria.Models.CategoryModel;
import com.example.pasteleria.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CategoryServices {
    @Autowired
    CategoryRepository categoryRepository;

    //obtener todas las categorias
    public ArrayList<CategoryModel> findAllCategories(){
        return (ArrayList<CategoryModel>) categoryRepository.findAll();
    }

    //set
    public CategoryModel SaveCategory(CategoryModel category){

        return categoryRepository.save(category);
    }
}
