package com.example.pasteleria.services;

import com.example.pasteleria.Models.ProductModel;
import com.example.pasteleria.Models.UserModel;
import com.example.pasteleria.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ProductServices {
    @Autowired
    ProductRepository productRepository;

    //obtener todos los productos registrados
    public ArrayList<ProductModel> findAllProducts(){
        return (ArrayList<ProductModel>)productRepository.findAll();
    }

    //Guardar un producto
    public ProductModel saveProduct(ProductModel product){
        return productRepository.save(product);
    }
    public Optional<ProductModel> findProductById(Long id){
        return productRepository.findById(id);
    }
    //Eliminar un usuario con su Id
    public boolean deleteProduct(Long id){
        try{
            productRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}

