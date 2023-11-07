package com.example.pasteleria.repositories;

import com.example.pasteleria.Models.BranchModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BranchRepository extends CrudRepository<BranchModel,Long> {

}
