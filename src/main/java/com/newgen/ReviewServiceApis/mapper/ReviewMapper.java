package com.newgen.ReviewServiceApis.mapper;

import com.newgen.ReviewServiceApis.Model.Review;
import com.newgen.ReviewServiceApis.dto.ReviewDto;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ReviewMapper {
    public ReviewDto toDto(Review review) {
        ReviewDto reviewDto = new ReviewDto();

        reviewDto.setDescription(review.getDescription());
        reviewDto.setUserId(review.getUserId());
        reviewDto.setProductId(review.getProductId());
        reviewDto.setTitle(review.getTitle());
        reviewDto.setRatings(review.getRatings());
        return reviewDto;
    }

    public Review toEntity(ReviewDto reviewDto) {
        Review review = new Review();
        review.setProductId(reviewDto.getProductId());
        review.setUserId(reviewDto.getUserId());
        review.setDescription(reviewDto.getDescription());
        review.setTitle(reviewDto.getTitle());
        review.setRatings(reviewDto.getRatings());
        review.setCreatedBy("Romil");
        review.setUpdatedBy("Romil");
        review.setCreatedAt(LocalDateTime.now());
        review.setUpdatedAt(LocalDateTime.now());
        return review;

    }
}
