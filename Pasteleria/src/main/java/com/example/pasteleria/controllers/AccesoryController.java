package com.example.pasteleria.controllers;

import com.example.pasteleria.Models.AccessoryModel;
import com.example.pasteleria.services.AccessoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/accessory")
public class AccesoryController {
    @Autowired
    AccessoryServices accesoryService;

    @GetMapping()
    public ArrayList<AccessoryModel> findAllAccesorys(){
        return accesoryService.findAllAccesorys();
    }

    @PostMapping()
    public AccessoryModel saveAcessory(@RequestBody AccessoryModel accessory){
        return accesoryService.saveAccessory(accessory);
    }
}

