package com.example.pasteleria.services;

import com.example.pasteleria.Models.BranchAddressModel;
import com.example.pasteleria.repositories.BranchAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class BranchAddressServices {
    @Autowired
    BranchAddressRepository branchAddressRepository;

    //obtiene todas las direcciones de sucursales
     public ArrayList<BranchAddressModel> findAllAdressBranches(){
         return (ArrayList<BranchAddressModel>) branchAddressRepository.findAll();
     }
     //registra una nueva direccion de sucursales
     public BranchAddressModel saveAdressBranch(BranchAddressModel adressBranch){
         return branchAddressRepository.save(adressBranch);
     }
     public Optional<BranchAddressModel> findById(Long id){
         return branchAddressRepository.findById(id);
     }
     public boolean deleteById(Long id){
         try {
             branchAddressRepository.deleteById(id);
             return true;
         }catch(Exception e){
             return false;
         }
     }
}
