package com.example.pasteleria.controllers;

import com.example.pasteleria.Models.AdressUserModel;
import com.example.pasteleria.services.AdressUserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/userAdress")
public class AdressUserController {
    @Autowired
    AdressUserServices adressUserService;

    @GetMapping()
    public ArrayList<AdressUserModel> findAllAdressUser(){
        return adressUserService.findAllAdressUsers();
    }
    @PostMapping()
    public AdressUserModel saveAdressUser(@RequestBody AdressUserModel adressUser) {
        return adressUserService.saveAdressUser(adressUser);
    }
}
