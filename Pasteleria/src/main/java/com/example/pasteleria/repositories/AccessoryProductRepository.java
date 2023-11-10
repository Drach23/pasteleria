package com.example.pasteleria.repositories;

import com.example.pasteleria.Models.AccessoryProductModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccessoryProductRepository extends CrudRepository<AccessoryProductModel,Long> {
}

