package com.example.pasteleria.controllers;

import com.example.pasteleria.Models.ReviewModel;
import com.example.pasteleria.services.ReviewServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

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
    //edit
    @PutMapping()
    public ReviewModel updateReview(@RequestBody ReviewModel review){
        return reviewService.saveReview(review);
    }

    //findById
    @GetMapping(path = "/findById")
    public Optional<ReviewModel> findReviewById(
            @RequestParam("userId") Long userId,
            @RequestParam("productId") Long productId
    ) {
        ReviewModel.ReviewModelId reviewModelId = new ReviewModel.ReviewModelId();
        reviewModelId.setUserId(userId);
        reviewModelId.setProductId(productId);

        return this.reviewService.findReviewById(reviewModelId);
    }
    //deleteById
    @DeleteMapping(path = "/deleteById")
    public String deleteById(
            @RequestParam("userId") Long userId,
            @RequestParam("productId") Long productId
    ) {
        ReviewModel.ReviewModelId reviewModelId = new ReviewModel.ReviewModelId();
        reviewModelId.setUserId(userId);
        reviewModelId.setProductId(productId);

        boolean deleted = reviewService.deleteById(reviewModelId);

        if (deleted) {
            return "Review with userId: " + userId + " and productId: " + productId + " deleted successfully";
        } else {
            return "Review with userId: " + userId + " and productId: " + productId + " not found or couldn't be deleted";
        }
    }

}


