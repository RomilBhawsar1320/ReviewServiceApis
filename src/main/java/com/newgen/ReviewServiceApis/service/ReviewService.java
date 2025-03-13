package com.newgen.ReviewServiceApis.service;

import com.newgen.ReviewServiceApis.Model.Review;
import com.newgen.ReviewServiceApis.repository.ReviewRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ReviewService implements IReviewService {

    private final ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }


    @Override
    public List<Review> getReviewByProductId(Long productID) {
        return reviewRepository.findAllByProductId(productID);
    }

    @Override
    public void addReview(Review review) {

        review.setCreatedBy("Romil");
        review.setUpdatedBy("Romil");
        review.setCreatedAt(LocalDateTime.now());
        review.setUpdatedAt(LocalDateTime.now());

        reviewRepository.save(review);

    }

    @Override
   @Transactional
    public void deleteReview(Long productId,Long reviewId) {

        reviewRepository.deleteByProductIdAndReviewId(productId,reviewId);

    }
}
