package com.example.pasteleria.repositories;

import com.example.pasteleria.Models.AccessoryModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccesoryRepository extends CrudRepository<AccessoryModel,Long> {
}
