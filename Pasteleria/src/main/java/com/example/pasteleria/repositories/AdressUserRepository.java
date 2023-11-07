package com.example.pasteleria.repositories;

import com.example.pasteleria.Models.AdressUserModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdressUserRepository extends CrudRepository<AdressUserModel,Long> {

}
