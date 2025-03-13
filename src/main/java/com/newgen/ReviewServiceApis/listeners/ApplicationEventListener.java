package com.newgen.ReviewServiceApis.listeners;

import com.newgen.ReviewServiceApis.dto.ReviewDto;
import com.newgen.ReviewServiceApis.service.IReviewService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ApplicationEventListener {

    private final IReviewService reviewService;
    public ApplicationEventListener(final IReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void handleEvent(ApplicationEvent event) {
        log.info("Application event received");
        initializeReviews();
    }
    private void initializeReviews() {
        reviewService.addReview(new ReviewDto(1L ,1,(short) 4,"Good Product","it is expensivethough"));
        reviewService.addReview(new ReviewDto(1L ,1,(short) 4,"Good Product","it is expensive though"));
        reviewService.addReview(new ReviewDto(2L ,1,(short) 5,"Excellent Quality","Really loved it, worth the price"));
        reviewService.addReview(new ReviewDto(3L ,1,(short) 3,"Average Product","Not bad, but expected better"));
        reviewService.addReview(new ReviewDto(4L ,2,(short) 2,"Disappointing","The product broke after one use"));
        reviewService.addReview(new ReviewDto(5L ,2,(short) 4,"Great Value","Good quality for the price"));
        reviewService.addReview(new ReviewDto(1L, 102, (short) 4, "Good Product", "It is expensive though"));
        reviewService.addReview(new ReviewDto(1L, 103, (short) 5, "Excellent Quality", "Really loved it, worth the price"));
        reviewService.addReview(new ReviewDto(1L, 104, (short) 3, "Average Product", "Not bad, but expected better"));
        reviewService.addReview(new ReviewDto(2L, 105, (short) 2, "Disappointing", "The product broke after one use"));
        reviewService.addReview(new ReviewDto(2L, 106, (short) 4, "Great Value", "Good quality for the price"));
        reviewService.addReview(new ReviewDto(2L, 107, (short) 1, "Terrible", "Doesn't work as described"));
        reviewService.addReview(new ReviewDto(2L, 108, (short) 5, "Perfect for me", "Exactly what I was looking for"));
        reviewService.addReview(new ReviewDto(3L, 109, (short) 3, "Okay", "Average experience, would consider alternatives"));
        reviewService.addReview(new ReviewDto(3L, 110, (short) 4, "Nice Product", "It serves its purpose well"));
        reviewService.addReview(new ReviewDto(3L, 111, (short) 5, "Highly Recommend", "I love this product! Very useful"));
        reviewService.addReview(new ReviewDto(3L, 112, (short) 2, "Not Worth It", "It didn’t live up to the hype"));
        reviewService.addReview(new ReviewDto(4L, 113, (short) 4, "Good, but a bit pricey", "Great quality but a little too expensive"));
        reviewService.addReview(new ReviewDto(4L, 114, (short) 3, "Okay, not amazing", "It works but nothing special"));
        reviewService.addReview(new ReviewDto(4L, 115, (short) 5, "Perfect", "Exactly as expected, no issues"));
        reviewService.addReview(new ReviewDto(4L, 116, (short) 2, "Poor Quality", "Very disappointed with the material quality"));
        reviewService.addReview(new ReviewDto(1L, 117, (short) 4, "Satisfactory", "Does its job, no major complaints"));
        reviewService.addReview(new ReviewDto(2L, 118, (short) 1, "Terrible Experience", "Stopped working after a few days"));
        reviewService.addReview(new ReviewDto(3L, 119, (short) 3, "Fair", "It’s okay, but there are better options out there"));
        reviewService.addReview(new ReviewDto(4L, 120, (short) 5, "Love It!", "Exactly what I needed, couldn’t be happier"));
        reviewService.addReview(new ReviewDto(1L, 121, (short) 4, "Solid product", "It’s good, but I wish it had more features"));
        reviewService.addReview(new ReviewDto(2L, 122, (short) 2, "Not recommended", "Doesn't meet expectations, poor functionality"));
        reviewService.addReview(new ReviewDto(3L, 123, (short) 5, "Absolutely Amazing", "Best purchase I’ve made in a while"));
        reviewService.addReview(new ReviewDto(4L, 124, (short) 3, "Decent", "Works well, but it's not great"));


    }
}
