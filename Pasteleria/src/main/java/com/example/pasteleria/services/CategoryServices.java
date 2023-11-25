package com.example.pasteleria.services;

import com.example.pasteleria.Models.CategoryModel;
import com.example.pasteleria.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

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
    //findById
    public Optional<CategoryModel> findById(Long id){
        return categoryRepository.findById(id);
    }
    //deleteById
    public boolean deleteCategory(Long id){
        try{
            categoryRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
