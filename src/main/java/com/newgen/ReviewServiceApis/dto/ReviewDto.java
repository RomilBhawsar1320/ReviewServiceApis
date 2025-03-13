package com.newgen.ReviewServiceApis.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Data
public class ReviewDto {
    private Long reviewId;
    private Long productId;
    private int userId;
    private short ratings;
    private String title;
    private String description;
    private LocalDateTime createdAt;

}
