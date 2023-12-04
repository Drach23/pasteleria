package com.example.pasteleria.services;

import com.example.pasteleria.Models.BranchModel;
import com.example.pasteleria.repositories.BranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class BranchServices {
    @Autowired
    BranchRepository branchRepository;

    //Obtener todos las sucursales
    public ArrayList<BranchModel> findAllBranches(){
        return (ArrayList<BranchModel>) branchRepository.findAll();
    }

    //Guardar una sucursal
    public BranchModel saveBranch(BranchModel branch){
        return branchRepository.save(branch);
    }

    //encontrar por id
    public Optional<BranchModel> findById(Long id){
        return branchRepository.findById(id);
    }
    public boolean deleteById(Long id){
        try{
            branchRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
