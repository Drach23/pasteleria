package com.example.pasteleria.controllers;

import com.example.pasteleria.Models.ReviewModel;
import com.example.pasteleria.services.ReviewServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/reviews")
public class ReviewController {
    @Autowired
    ReviewServices reviewService;
    //get
    @GetMapping()
    public ArrayList<ReviewModel> findAllReviews(){
        return reviewService.findAllReviews();
    }
    //post
    @PostMapping()
    public ReviewModel saveReview(@RequestBody ReviewModel review){
        return reviewService.saveReview(review);
    }
}


