package com.example.pasteleria.services;

import com.example.pasteleria.Models.ProductModel;
import com.example.pasteleria.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

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


}
