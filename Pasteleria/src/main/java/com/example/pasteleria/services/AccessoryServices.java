package com.example.pasteleria.services;

import com.example.pasteleria.Models.AccessoryModel;
import com.example.pasteleria.repositories.AccessoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class AccessoryServices {
    @Autowired
    AccessoryRepository accessoryRepository;

    public ArrayList<AccessoryModel> findAllAccesorys(){
        return (ArrayList<AccessoryModel>) accessoryRepository.findAll();
    }

    public AccessoryModel saveAccessory(AccessoryModel accessory){
        return accessoryRepository.save(accessory);
    }

    //findById
    public Optional<AccessoryModel> findById(Long id){
        return accessoryRepository.findById(id);
    }
    public boolean deleteById(Long id){
        try{
            accessoryRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
