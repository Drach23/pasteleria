package com.example.pasteleria.controllers;

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
    public ArrayList<com.example.pasteleria.Models.ReviewController> findAllReviews(){
        return reviewService.findAllReviews();
    }
    //post
    @PostMapping()
    public com.example.pasteleria.Models.ReviewController saveReview(@RequestBody com.example.pasteleria.Models.ReviewController review){
        return reviewService.saveReview(review);
    }
    //edit
    @PutMapping()
    public com.example.pasteleria.Models.ReviewController updateReview(@RequestBody com.example.pasteleria.Models.ReviewController review){
        return reviewService.saveReview(review);
    }

    //findById
    @GetMapping(path = "/findById")
    public Optional<com.example.pasteleria.Models.ReviewController> findReviewById(
            @RequestParam("userId") Long userId,
            @RequestParam("productId") Long productId
    ) {
        com.example.pasteleria.Models.ReviewController.ReviewModelId reviewModelId = new com.example.pasteleria.Models.ReviewController.ReviewModelId();
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
        com.example.pasteleria.Models.ReviewController.ReviewModelId reviewModelId = new com.example.pasteleria.Models.ReviewController.ReviewModelId();
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


