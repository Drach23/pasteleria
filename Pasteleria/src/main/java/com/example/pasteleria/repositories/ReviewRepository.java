package com.example.pasteleria.repositories;

import com.example.pasteleria.Models.AccesoryProductModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ReviewRepository extends CrudRepository<AccesoryProductModel, AccesoryProductModel.ReviewModelId> {
    Optional<AccesoryProductModel> findById(AccesoryProductModel.ReviewModelId reviewModelId);

}
