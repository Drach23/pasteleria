package com.example.pasteleria.controllers;

import com.example.pasteleria.Models.AccessoryProductModel;
import com.example.pasteleria.services.AccessoryProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/accessoryProduct")
public class AccessoryProductController {
    @Autowired
    AccessoryProductServices accessoryProductService;
    //encuentra todos
    @GetMapping()// http://localhost:8080/accessoryProduct
    public ArrayList<AccessoryProductModel> findAllAccesoryProducts(){
        return accessoryProductService.findAllAccessoryProducts();
    }
    //guarda uno
    @PostMapping()//http://localhost:8080/accessoryProduct
    public AccessoryProductModel saveAccesoryProduct(@RequestBody AccessoryProductModel accessoryProduct){
        return accessoryProductService.saveAccesoryProduct(accessoryProduct);
    }
    //edita
    @PutMapping() // http://localhost:8080/accessoryProduct
    public AccessoryProductModel updateAccesoryProduct(@RequestBody AccessoryProductModel accessoryProduct){
        return accessoryProductService.saveAccesoryProduct(accessoryProduct);
    }
    //findById
    @GetMapping(path = "/findById") // http://localhost:8080/accessoryProduct/findById?orderId=1&productId=1&AccesoryId=1
    public Optional<AccessoryProductModel> findById(
            @RequestParam("orderId") Long orderId,
            @RequestParam("productId") Long productId,
            @RequestParam("AccesoryId") Long AccesoryId
    ) {
        AccessoryProductModel.AccessoryProductModelId accessoryProductModelId = new AccessoryProductModel.AccessoryProductModelId();
        accessoryProductModelId.setOrderId(orderId);
        accessoryProductModelId.setProductId(productId);
        accessoryProductModelId.setAccesoryId(AccesoryId);

        return this.accessoryProductService.findById(accessoryProductModelId);
    }
    //deleteById
    @DeleteMapping(path = "/deleteById") //http://localhost:8080/accessoryProduct/deleteById?orderId=1&productId=1&AccesoryId=1
    public String deleteById(
            @RequestParam("orderId") Long orderId,
            @RequestParam("productId") Long productId,
            @RequestParam("AccesoryId") Long AccesoryId
    ) {
        AccessoryProductModel.AccessoryProductModelId accessoryProductModelId = new AccessoryProductModel.AccessoryProductModelId();
        accessoryProductModelId.setOrderId(orderId);
        accessoryProductModelId.setProductId(productId);
        accessoryProductModelId.setAccesoryId(AccesoryId);

        boolean deleted = accessoryProductService.deleteById(accessoryProductModelId);

        if (deleted) {
            return "Review with orderId: " + orderId  + ", productId: " + productId +"AccesoryId" + AccesoryId + " deleted successfully";
        } else {
            return "Review with orderId: " + orderId  + ", productId: " + productId +"AccesoryId" + AccesoryId +  "not found or couldn't be deleted";
        }
    }
}
