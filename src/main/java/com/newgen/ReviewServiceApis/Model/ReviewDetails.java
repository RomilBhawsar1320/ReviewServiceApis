package com.newgen.ReviewServiceApis.Model;

import com.newgen.ReviewServiceApis.dto.ReviewDto;
import lombok.Data;

import java.util.List;

@Data
public class ReviewDetails {
    private int totalOneStarRating;
    private int totalTwoStarRating;
    private int totalThreeStarRating;
    private int totalFourStarRating;
    private int totalFiveStarRating;
    private int totalRatings;
    private double averageRating;
    private List<ReviewDto> reviews;
}
