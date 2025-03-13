package com.newgen.ReviewServiceApis.service;

import com.newgen.ReviewServiceApis.Model.Review;
import com.newgen.ReviewServiceApis.dto.ReviewDto;
import com.newgen.ReviewServiceApis.mapper.ReviewMapper;
import com.newgen.ReviewServiceApis.repository.ReviewRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReviewService implements IReviewService {

    private final ReviewRepository reviewRepository;
    private final ReviewMapper reviewMapper;


    public ReviewService(ReviewRepository reviewRepository, ReviewMapper reviewMapper) {
        this.reviewRepository = reviewRepository;
        this.reviewMapper = reviewMapper;

    }


    @Override
    public List<ReviewDto> getReviewByProductId(Long productID) {

        List<Review> reviews = reviewRepository.findAllByProductId(productID);

        return reviews.stream().map(reviewMapper::toDto).collect(Collectors.toList());
    }

//    private ReviewDto mapToDto(Review review) {
//        ReviewDto reviewDto= new ReviewDto();
//
//        reviewDto.setReviewId(review.getReviewId());
//        reviewDto.setDescription(review.getDescription());
//        reviewDto.setCreatedAt(review.getCreatedAt());
//        reviewDto.setUserId(review.getUserId());
//        reviewDto.setProductId(review.getProductId());
//        reviewDto.setTitle(review.getTitle());
//        reviewDto.setRatings(review.getRatings());
//        return reviewDto;
//
//
//    }

    @Override
    public void addReview(ReviewDto reviewDto) {
       Review review =  reviewMapper.toEntity(reviewDto);
        reviewRepository.save(review);

    }

//    private Review mapToReview(ReviewDto reviewDto) {
//        Review review = new Review();
//        review.setProductId(reviewDto.getProductId());
//        review.setUserId(reviewDto.getUserId());
//        review.setDescription(reviewDto.getDescription());
//        review.setTitle(reviewDto.getTitle());
//        review.setRatings(reviewDto.getRatings());
//        review.setCreatedBy("Romil");
//        review.setUpdatedBy("Romil");
//        review.setCreatedAt(LocalDateTime.now());
//        review.setUpdatedAt(LocalDateTime.now());
//        return review;
//
//    }

    @Override
   @Transactional
    public void deleteReview(Long productId,Long reviewId) {

        reviewRepository.deleteByProductIdAndReviewId(productId,reviewId);

    }
}
