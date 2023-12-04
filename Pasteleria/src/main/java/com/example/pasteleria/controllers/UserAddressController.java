package com.example.pasteleria.controllers;

import com.example.pasteleria.Models.UserAddressModel;
import com.example.pasteleria.services.UserAddressServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/userAdress")
public class UserAddressController {
    @Autowired
    UserAddressServices adressUserService;
    //encontrar todos las direcciones de los usuarios
    @GetMapping()
    public ArrayList<UserAddressModel> findAllAdressUser(){
        return adressUserService.findAllAdressUsers();
    }
    //guardar una direccion de usuario
    @PostMapping()
    public UserAddressModel saveAdressUser(@RequestBody UserAddressModel adressUser) {
        return adressUserService.saveAdressUser(adressUser);
    }
    //editar una direccion de usuario
    @PutMapping
    public UserAddressModel updateAdressUser(@RequestBody UserAddressModel adressUser) {
        return adressUserService.saveAdressUser(adressUser);
    }

    @GetMapping(path = "/findById")
    public Optional<UserAddressModel> findById(@RequestParam("id")Long id){
        return this.adressUserService.findById(id);
    }
    @DeleteMapping(path = "deleteById")
    public boolean deleteById(@RequestParam("id")Long id){
        return this.adressUserService.deleteById(id);
    }
}
