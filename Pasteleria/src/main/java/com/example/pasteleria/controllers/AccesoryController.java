package com.example.pasteleria.controllers;

import com.example.pasteleria.Models.AccessoryModel;
import com.example.pasteleria.services.AccessoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/accessory")
public class AccesoryController {
    @Autowired
    AccessoryServices accesoryService;

    @GetMapping()// http://localhost:8080/accessory
    public ArrayList<AccessoryModel> findAllAccesorys(){
        return accesoryService.findAllAccesorys();
    }

    @PostMapping()//http://localhost:8080/accessory
    public AccessoryModel saveAcessory(@RequestBody AccessoryModel accessory){
        return accesoryService.saveAccessory(accessory);
    }
    @PutMapping()//http://localhost:8080/accessory
    public AccessoryModel updateAcessory(@RequestBody AccessoryModel accessory){
        return accesoryService.saveAccessory(accessory);
    }

    @GetMapping(path = "/findById")//http://localhost:8080/accessory/findById?id=1
    public Optional<AccessoryModel> findById(@RequestParam("id")Long id){
        return this.accesoryService.findById(id);
    }
    @DeleteMapping(path = "/deleteById")//http://localhost:8080/accessory/deleteById?id=1
    public boolean deleteById(@RequestParam("id")Long id){
        return this.accesoryService.deleteById(id);
    }
}

