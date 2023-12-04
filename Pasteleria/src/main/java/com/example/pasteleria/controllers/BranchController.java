package com.example.pasteleria.controllers;

import com.example.pasteleria.Models.BranchModel;
import com.example.pasteleria.services.BranchServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/branches")

public class BranchController {
    @Autowired
    BranchServices branchServices;

    //get
    @GetMapping() // http://localhost:8080/branches
    public ArrayList<BranchModel> findAllBranches(){
        return branchServices.findAllBranches();
    }
    //post
    @PostMapping()// http://localhost:8080/branches
    public BranchModel saveBranch(@RequestBody BranchModel branch){
        return branchServices.saveBranch(branch);
    }
    @PutMapping() // http://localhost:8080/branches
    public BranchModel updateBranch(@RequestBody BranchModel branch){
        return branchServices.saveBranch(branch);
    }

    @GetMapping(path = "/findById") // http://localhost:8080/branches/findById?id=1
    public Optional<BranchModel> findById(@RequestParam("id")Long id){
        return this.branchServices.findById(id);
    }
    @DeleteMapping(path = "/deleteById") //http://localhost:8080/branches/deleteById?id=1
    public boolean deleteBranch(@RequestParam("id")Long id){
        return this.branchServices.deleteById(id);
    }
}
