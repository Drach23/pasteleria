package com.example.pasteleria.controllers;

import com.example.pasteleria.Models.AdressUserModel;
import com.example.pasteleria.services.AdressUserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/userAdress")
public class AdressUserController {
    @Autowired
    AdressUserServices adressUserService;
    //encontrar todos las direcciones de los usuarios
    @GetMapping()
    public ArrayList<AdressUserModel> findAllAdressUser(){
        return adressUserService.findAllAdressUsers();
    }
    //guardar una direccion de usuario
    @PostMapping()
    public AdressUserModel saveAdressUser(@RequestBody AdressUserModel adressUser) {
        return adressUserService.saveAdressUser(adressUser);
    }
    //editar una direccion de usuario
    @PutMapping
    public AdressUserModel updateAdressUser(@RequestBody AdressUserModel adressUser) {
        return adressUserService.saveAdressUser(adressUser);
    }

    @GetMapping(path = "/findById")
    public Optional<AdressUserModel> findById(@RequestParam("id")Long id){
        return this.adressUserService.findById(id);
    }
    @DeleteMapping(path = "deleteById")
    public boolean deleteById(@RequestParam("id")Long id){
        return this.adressUserService.deleteById(id);
    }
}
