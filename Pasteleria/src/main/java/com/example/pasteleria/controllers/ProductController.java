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
    @GetMapping() // http://localhost:8080/productos
    public ArrayList<ProductModel> findAllProducts(){
        return productServices.findAllProducts();
    }
    // guardar un producto
    @PostMapping()// http://localhost:8080/productos
    public ProductModel saveProduct(@RequestBody  ProductModel product){
        return productServices.saveProduct(product);
    }
    //obtener un producto mediante su ID
    @GetMapping (path = "/findById") // http://localhost:8080/productos/findById?id=1
    public Optional<ProductModel> findProductById(@RequestParam("id")Long id){
        return this.productServices.findProductById(id);
    }
    @PutMapping ()//http://localhost:8080/productos
    public ProductModel updateProduct(@RequestBody  ProductModel product){
        return productServices.saveProduct(product);
    }
    //Eliminar un producto mediante su ID
    @DeleteMapping(path = "/deleteById") // http://localhost:8080/productos/deleteById?id=1
    public boolean deleteProduct(@RequestParam("id")Long id){
        return this.productServices.deleteProduct(id);
    }


}
