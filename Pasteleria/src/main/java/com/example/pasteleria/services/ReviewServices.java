package com.example.pasteleria.services;

import com.example.pasteleria.Models.AccesoryProductModel;
import com.example.pasteleria.repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ReviewServices {
    @Autowired
    ReviewRepository reviewRepository;
    //Obtener todas las reviews
    public ArrayList<AccesoryProductModel> findAllReviews(){
        return (ArrayList<AccesoryProductModel>)reviewRepository.findAll();
    }

    //Guardar una nueva review
    public AccesoryProductModel saveReview(AccesoryProductModel review){
        return reviewRepository.save(review);
    }
    public Optional<AccesoryProductModel> findReviewById(AccesoryProductModel.ReviewModelId reviewModelId) {
        return this.reviewRepository.findById(reviewModelId);
    }
    //Eliminar una Review mediante el id
    public boolean deleteById(AccesoryProductModel.ReviewModelId reviewModelId) {
        Optional<AccesoryProductModel> optionalReview = reviewRepository.findById(reviewModelId);
        if (optionalReview.isPresent()) {
            reviewRepository.delete(optionalReview.get());
            return true;
        }
        return false;
    }
}

