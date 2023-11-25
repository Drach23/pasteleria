package com.example.pasteleria.services;

import com.example.pasteleria.Models.AdressBranchModel;
import com.example.pasteleria.repositories.AdressBranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class AdressBranchServices {
    @Autowired
    AdressBranchRepository adressBranchRepository;

    //obtiene todas las direcciones de sucursales
     public ArrayList<AdressBranchModel> findAllAdressBranches(){
         return (ArrayList<AdressBranchModel>) adressBranchRepository.findAll();
     }
     //registra una nueva direccion de sucursales
     public AdressBranchModel saveAdressBranch(AdressBranchModel adressBranch){
         return adressBranchRepository.save(adressBranch);
     }
     public Optional<AdressBranchModel> findById(Long id){
         return adressBranchRepository.findById(id);
     }
     public boolean deleteById(Long id){
         try {
             adressBranchRepository.deleteById(id);
             return true;
         }catch(Exception e){
             return false;
         }
     }
}
