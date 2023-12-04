package com.example.pasteleria.repositories;

import com.example.pasteleria.Models.ReviewModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ReviewRepository extends CrudRepository<ReviewModel, ReviewModel.ReviewModelId> {
    Optional<ReviewModel> findById(ReviewModel.ReviewModelId reviewModelId);

}
