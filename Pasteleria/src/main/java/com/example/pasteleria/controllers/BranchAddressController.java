package com.example.pasteleria.controllers;

import com.example.pasteleria.Models.BranchAddressModel;
import com.example.pasteleria.services.BranchAddressServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/direccionSucursal")
public class BranchAddressController {
    @Autowired
    BranchAddressServices adressBranchService;

    //obtiene todos los establecimientos
    @GetMapping()
    public ArrayList<BranchAddressModel> findAllAdressBranches() {
        return adressBranchService.findAllAdressBranches();
    }
    //Registra un nuevo establecimiento
    @PostMapping()
    public BranchAddressModel saveAdressBranch(@RequestBody BranchAddressModel adressBranch) {
        return adressBranchService.saveAdressBranch(adressBranch);
    }
    //edita un establecimiento
    @PutMapping()
    public BranchAddressModel updateAdressBranch(@RequestBody BranchAddressModel adressBranch) {
        return adressBranchService.saveAdressBranch(adressBranch);
    }
    //encuentra un establecimiento segun su id
    @GetMapping(path = "/findById")
    public Optional<BranchAddressModel> findById(@RequestParam("id")Long id){
        return this.adressBranchService.findById(id);
    }
    //elimina un establecimiento segun su id
    @DeleteMapping(path = "deleteById")
    public boolean deleteById(@RequestParam("id")Long id){
        return this.adressBranchService.deleteById(id);
    }

}
