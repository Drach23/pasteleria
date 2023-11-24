package com.example.pasteleria.controllers;

import com.example.pasteleria.Models.ProductModel;
import com.example.pasteleria.Models.UserModel;
import com.example.pasteleria.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

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
    @GetMapping (path = "/findById")
    public Optional<ProductModel> findProductById(@RequestParam("id")Long id){
        return this.productServices.findProductById(id);
    }
    @DeleteMapping(path = "/deleteById")
    public boolean deleteProduct(@RequestParam("id")Long id){
        return this.productServices.deleteProduct(id);
    }


}
