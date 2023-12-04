package com.example.pasteleria.services;

import com.example.pasteleria.Models.ReviewController;
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
    public ArrayList<ReviewController> findAllReviews(){
        return (ArrayList<ReviewController>)reviewRepository.findAll();
    }

    //Guardar una nueva review
    public ReviewController saveReview(ReviewController review){
        return reviewRepository.save(review);
    }
    public Optional<ReviewController> findReviewById(ReviewController.ReviewModelId reviewModelId) {
        return this.reviewRepository.findById(reviewModelId);
    }
    //Eliminar una Review mediante el id
    public boolean deleteById(ReviewController.ReviewModelId reviewModelId) {
        Optional<ReviewController> optionalReview = reviewRepository.findById(reviewModelId);
        if (optionalReview.isPresent()) {
            reviewRepository.delete(optionalReview.get());
            return true;
        }
        return false;
    }
}

