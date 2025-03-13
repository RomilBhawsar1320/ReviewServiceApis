package com.newgen.ReviewServiceApis.service;

import com.newgen.ReviewServiceApis.Model.Review;
import com.newgen.ReviewServiceApis.dto.ReviewDto;

import java.util.List;

public interface IReviewService {

    List<ReviewDto> getReviewByProductId(Long ProductID);
    void addReview(ReviewDto review);
    void deleteReview(Long productId,Long reviewId);



}
