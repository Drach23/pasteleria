package com.example.pasteleria.repositories;

import com.example.pasteleria.Models.UserAddressModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAddressRepository extends CrudRepository<UserAddressModel,Long> {

}
