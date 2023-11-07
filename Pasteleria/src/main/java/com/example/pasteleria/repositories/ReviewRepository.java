package com.example.pasteleria.repositories;

import com.example.pasteleria.Models.ReviewModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends CrudRepository<ReviewModel,Long> {

}

