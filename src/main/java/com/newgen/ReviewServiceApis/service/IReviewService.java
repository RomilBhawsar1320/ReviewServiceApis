package com.newgen.ReviewServiceApis.service;

import com.newgen.ReviewServiceApis.Model.Review;

import java.util.List;

public interface IReviewService {

    List<Review> getReviewByProductId(Long ProductID);
    void addReview(Review review);
    void deleteReview(Long productId,Long reviewId);



}
