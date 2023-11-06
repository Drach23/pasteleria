package com.example.pasteleria.controllers;

import com.example.pasteleria.Models.ProductModel;
import com.example.pasteleria.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/productos")
public class ProductController {
    @Autowired
    ProductServices productServices;

    @GetMapping()
    public ArrayList<ProductModel> findAllProducts(){
        return productServices.findAllProducts();
    }

    @PostMapping()
    public ProductModel saveUser(@RequestBody  ProductModel product){
        return productServices.saveProduct(product);
    }


}
