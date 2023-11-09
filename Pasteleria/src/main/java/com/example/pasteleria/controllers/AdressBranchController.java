package com.example.pasteleria.controllers;

import com.example.pasteleria.Models.AdressBranchModel;
import com.example.pasteleria.services.AdressBranchServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/BranchAdress")
public class AdressBranchController {
    @Autowired
    AdressBranchServices adressBranchService;

    @GetMapping()
    public ArrayList<AdressBranchModel> findAllAdressBranches() {
        return adressBranchService.findAllAdressBranches();
    }
    @PostMapping()
    public AdressBranchModel saveAdressBranch(@RequestBody AdressBranchModel adressBranch) {
        return adressBranchService.saveAdressBranch(adressBranch);
    }
}
