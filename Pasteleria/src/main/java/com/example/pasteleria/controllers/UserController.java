package com.example.pasteleria.controllers;

import com.example.pasteleria.Models.UserModel;
import com.example.pasteleria.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserServices userService;

    //get
    @GetMapping()
    public ArrayList<UserModel> findAllUsers(){

        return userService.findAllUsers();
    }

    //post
    @PostMapping()//  http://localhost:8080/user
    public UserModel saveUser(@RequestBody UserModel user){

        return userService.saveUser(user);
    }
    //edit
    @PutMapping() //  http://localhost:8080/user
    public UserModel updateUser(@RequestBody UserModel user){
        return userService.saveUser(user);
    }
    //getById
    @GetMapping (path = "/findById") //  http://localhost:8080/user/findById?id=1
    public Optional<UserModel> findUserById(@RequestParam("id")Long id){
        return this.userService.findUserById(id);
    }
    //deleteById
    @DeleteMapping(path = "/deleteById") //  http://localhost:8080/user/deleteById?id=1
    public boolean deleteUser(@RequestParam("id")Long id){
        return this.userService.deleteUser(id);
    }
}
