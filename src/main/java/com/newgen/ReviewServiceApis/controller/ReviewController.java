package com.newgen.ReviewServiceApis.controller;

import com.newgen.ReviewServiceApis.Model.Review;
import com.newgen.ReviewServiceApis.Model.ReviewDetails;
import com.newgen.ReviewServiceApis.dto.ReviewDto;
import com.newgen.ReviewServiceApis.service.IReviewService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/products")
public class ReviewController {

    private IReviewService reviewService;
    @Autowired
    public ReviewController(IReviewService reviewService) {
        this.reviewService = reviewService;

    }

    @GetMapping("/{productId}/reviews")
    public ResponseEntity<ReviewDetails> getAllReviewsByProductId(@PathVariable Long productId) {

        return new ResponseEntity<>(reviewService.getReviewByProductId(productId), HttpStatus.OK);

    }

    @PostMapping("/{productId}/reviews")
    public ResponseEntity<String> addReview(@PathVariable Long productId,@RequestBody ReviewDto reviewDto) {
        reviewDto.setProductId(productId);
        reviewService.addReview(reviewDto);
        return new ResponseEntity<>("Review added successfully", HttpStatus.CREATED);
    }

    @DeleteMapping("/{productId}/reviews/{reviewId}")
    public ResponseEntity<String> deleteReview(@PathVariable Long productId,Long reviewID) {
        reviewService.deleteReview(productId,reviewID);
        return new ResponseEntity<>("Review deleted successfully", HttpStatus.OK);
    }

}
