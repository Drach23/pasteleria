package com.example.pasteleria.services;

import com.example.pasteleria.Models.AccessoryProductModel;
import com.example.pasteleria.repositories.AccessoryProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AccessoryProductServices {
    @Autowired
    AccessoryProductRepository accessoryProduct;

    public ArrayList<AccessoryProductModel> findAllAccessoryProducts(){
        return (ArrayList<AccessoryProductModel>) accessoryProduct.findAll();
    }

    public AccessoryProductModel saveAccesoryProduct(AccessoryProductModel accesory){
        return accessoryProduct.save(accesory);
    }
}
