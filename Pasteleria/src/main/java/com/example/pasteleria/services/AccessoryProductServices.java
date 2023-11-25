package com.example.pasteleria.services;

import com.example.pasteleria.Models.AccessoryProductModel;
import com.example.pasteleria.repositories.AccessoryProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class AccessoryProductServices {
    @Autowired
    AccessoryProductRepository accessoryProductRepository;
    //toma todos
    public ArrayList<AccessoryProductModel> findAllAccessoryProducts(){
        return (ArrayList<AccessoryProductModel>) accessoryProductRepository.findAll();
    }
    //guarda uno nuevo
    public AccessoryProductModel saveAccesoryProduct(AccessoryProductModel accesory){
        return accessoryProductRepository.save(accesory);
    }
    //encontrar por id
    public Optional<AccessoryProductModel> findById(AccessoryProductModel.AccessoryProductModelId accessoryProductModelId){
        return accessoryProductRepository.findById(accessoryProductModelId);
    }
    //eliminar por id
    public boolean deleteById(AccessoryProductModel.AccessoryProductModelId accessoryProductModelId){
        Optional<AccessoryProductModel> optionalAccessoryProduct = accessoryProductRepository.findById(accessoryProductModelId);
        if (optionalAccessoryProduct.isPresent()){
            accessoryProductRepository.delete(optionalAccessoryProduct.get());
            return true;
        }
        return false;
    }
}
