package com.example.pasteleria.services;

import com.example.pasteleria.Models.UserAddressModel;
import com.example.pasteleria.repositories.UserAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserAddressServices {
    @Autowired
    UserAddressRepository userAddressRepository;
    //obtener todas las direcciones de usuario
    public ArrayList<UserAddressModel> findAllAdressUsers() {
        return (ArrayList<UserAddressModel>) userAddressRepository.findAll();
    }

    //guardar una nueva direccion de usuario
    public UserAddressModel saveAdressUser(UserAddressModel adressUser){
        return userAddressRepository.save(adressUser);
    }
    public Optional<UserAddressModel> findById(Long id){
        return userAddressRepository.findById(id);
    }
    public boolean deleteById(Long id){
        try{
            userAddressRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
