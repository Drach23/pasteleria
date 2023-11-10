package com.example.pasteleria.controllers;

import com.example.pasteleria.Models.AccessoryProductModel;
import com.example.pasteleria.services.AccessoryProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/accesoryProduct")
public class AccessoryProductController {
    @Autowired
    AccessoryProductServices accessoryProductService;

    @GetMapping
    public ArrayList<AccessoryProductModel> findAllAccesoryProducts(){
        return accessoryProductService.findAllAccessoryProducts();
    }

    @PostMapping()
    public AccessoryProductModel saveAccesoryProduct(@RequestBody AccessoryProductModel accessoryProduct){
        return accessoryProductService.saveAccesoryProduct(accessoryProduct);
    }

}
