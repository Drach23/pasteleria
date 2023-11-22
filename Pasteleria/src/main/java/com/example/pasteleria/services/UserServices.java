package com.example.pasteleria.services;

import com.example.pasteleria.Models.UserModel;
import com.example.pasteleria.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

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
    //Editar un usuario mediante su codigo
    public Optional<UserModel> findUserById(Long id){
        return userRepository.findById(id);
    }
    //Eliminar un usuario con su Id
    public boolean deleteUser(Long id){
        try{
            userRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }

}
