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
    @GetMapping() // http://localhost:8080/userAdress
    public ArrayList<UserAddressModel> findAllAdressUser(){
        return adressUserService.findAllAdressUsers();
    }
    //guardar una direccion de usuario
    @PostMapping() //  http://localhost:8080/userAdress
    public UserAddressModel saveAdressUser(@RequestBody UserAddressModel adressUser) {
        return adressUserService.saveAdressUser(adressUser);
    }
    //editar una direccion de usuario
    @PutMapping() //  http://localhost:8080/userAdress
    public UserAddressModel updateAdressUser(@RequestBody UserAddressModel adressUser) {
        return adressUserService.saveAdressUser(adressUser);
    }

    @GetMapping(path = "/findById") // http://localhost:8080/userAdress/findById?id=1
    public Optional<UserAddressModel> findById(@RequestParam("id")Long id){
        return this.adressUserService.findById(id);
    }
    @DeleteMapping(path = "deleteById") //  http://localhost:8080/userAdress/deleteById?id=1
    public boolean deleteById(@RequestParam("id")Long id){
        return this.adressUserService.deleteById(id);
    }
}
