package com.example.pasteleria.controllers;

import com.example.pasteleria.Models.BranchModel;
import com.example.pasteleria.services.BranchServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/branches")

public class BranchController {
    @Autowired
    BranchServices branchServices;

    //get
    @GetMapping()
    public ArrayList<BranchModel> findAllBranches(){
        return branchServices.findAllBranches();
    }
    //post
    @PostMapping()
    public BranchModel saveBranch(@RequestBody BranchModel branch){
        return branchServices.saveBranch(branch);
    }


}
