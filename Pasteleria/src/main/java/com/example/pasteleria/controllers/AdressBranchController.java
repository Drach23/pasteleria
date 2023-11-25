package com.example.pasteleria.controllers;

import com.example.pasteleria.Models.AdressBranchModel;
import com.example.pasteleria.services.AdressBranchServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/direccionSucursal")
public class AdressBranchController {
    @Autowired
    AdressBranchServices adressBranchService;

    //obtiene todos los establecimientos
    @GetMapping()
    public ArrayList<AdressBranchModel> findAllAdressBranches() {
        return adressBranchService.findAllAdressBranches();
    }
    //Registra un nuevo establecimiento
    @PostMapping()
    public AdressBranchModel saveAdressBranch(@RequestBody AdressBranchModel adressBranch) {
        return adressBranchService.saveAdressBranch(adressBranch);
    }
    //edita un establecimiento
    @PutMapping()
    public AdressBranchModel updateAdressBranch(@RequestBody AdressBranchModel adressBranch) {
        return adressBranchService.saveAdressBranch(adressBranch);
    }
    //encuentra un establecimiento segun su id
    @GetMapping(path = "/findById")
    public Optional<AdressBranchModel> findById(@RequestParam("id")Long id){
        return this.adressBranchService.findById(id);
    }
    //elimina un establecimiento segun su id
    @DeleteMapping(path = "deleteById")
    public boolean deleteById(@RequestParam("id")Long id){
        return this.adressBranchService.deleteById(id);
    }

}
