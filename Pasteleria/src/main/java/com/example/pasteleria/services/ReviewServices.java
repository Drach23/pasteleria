package com.example.pasteleria.services;

import com.example.pasteleria.Models.ReviewModel;
import com.example.pasteleria.repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ReviewServices {
    @Autowired
    ReviewRepository reviewRepository;
    //Obtener todas las reviews
    public ArrayList<ReviewModel> findAllReviews(){
        return (ArrayList<ReviewModel>)reviewRepository.findAll();
    }

    //Guardar una nueva review
    public ReviewModel saveReview(ReviewModel review){
        return reviewRepository.save(review);
    }
}
