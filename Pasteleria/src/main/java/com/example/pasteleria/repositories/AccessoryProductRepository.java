package com.example.pasteleria.repositories;

import com.example.pasteleria.Models.AccessoryProductModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccessoryProductRepository extends CrudRepository<AccessoryProductModel,AccessoryProductModel.AccessoryProductModelId> {
    Optional<AccessoryProductModel> findById(AccessoryProductModel.AccessoryProductModelId accessoryProductModelId);
}

