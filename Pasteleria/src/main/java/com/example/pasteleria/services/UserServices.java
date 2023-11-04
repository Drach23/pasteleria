package com.example.pasteleria.services;

import com.example.pasteleria.Models.UserModel;
import com.example.pasteleria.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserServices {
    @Autowired
    UserRepository userRepository;
    //obtener todos los usuarios registrados
    public ArrayList<UserModel> findAllUsers(){
        return (ArrayList<UserModel>)userRepository.findAll();
    }
    //Guardar un usuario

    public UserModel  saveUser(UserModel user){
        return userRepository.save(user);
    }
}
