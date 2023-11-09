package com.example.pasteleria.services;

import com.example.pasteleria.Models.AdressUserModel;
import com.example.pasteleria.repositories.AdressUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AdressUserServices {
    @Autowired
    AdressUserRepository adressUserRepository;
    //obtener todas las direcciones de usuario
    public ArrayList<AdressUserModel> findAllAdressUsers() {
        return (ArrayList<AdressUserModel>) adressUserRepository.findAll();
    }

    //guardar una nueva direccion de usuario
    public AdressUserModel saveAdressUser(AdressUserModel adressUser){
        return adressUserRepository.save(adressUser);
    }
}
