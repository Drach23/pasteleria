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

    //obtener todos los productos
    @GetMapping()
    public ArrayList<ProductModel> findAllProducts(){
        return productServices.findAllProducts();
    }
    // guardar un producto
    @PostMapping()
    public ProductModel saveProduct(@RequestBody  ProductModel product){
        return productServices.saveProduct(product);
    }
    //obtener un producto mediante su ID
    @GetMapping (path = "/findById")
    public Optional<ProductModel> findProductById(@RequestParam("id")Long id){
        return this.productServices.findProductById(id);
    }
    @PutMapping ()
    public ProductModel updateProduct(@RequestBody  ProductModel product){
        return productServices.saveProduct(product);
    }
    //Eliminar un producto mediante su ID
    @DeleteMapping(path = "/deleteById")
    public boolean deleteProduct(@RequestParam("id")Long id){
        return this.productServices.deleteProduct(id);
    }


}
