package com.newgen.ReviewServiceApis.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class ReviewDto {

    private Long productId;
    private int userId;
    private short ratings;
    private String title;
    private String description;


    public ReviewDto() {

    }
}
