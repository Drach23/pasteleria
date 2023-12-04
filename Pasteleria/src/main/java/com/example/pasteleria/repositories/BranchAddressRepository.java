package com.example.pasteleria.repositories;

import com.example.pasteleria.Models.BranchAddressModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BranchAddressRepository extends CrudRepository<BranchAddressModel,Long> {
}
