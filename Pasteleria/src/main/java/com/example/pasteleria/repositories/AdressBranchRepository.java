package com.example.pasteleria.repositories;

import com.example.pasteleria.Models.AdressBranchModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdressBranchRepository extends CrudRepository<AdressBranchModel,Long> {
}
