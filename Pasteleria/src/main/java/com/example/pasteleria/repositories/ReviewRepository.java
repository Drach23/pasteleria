package com.example.pasteleria.repositories;

import com.example.pasteleria.Models.ReviewController;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ReviewRepository extends CrudRepository<ReviewController, ReviewController.ReviewModelId> {
    Optional<ReviewController> findById(ReviewController.ReviewModelId reviewModelId);

}
