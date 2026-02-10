 package com.rays.form;

import java.time.LocalDateTime;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.ReviewDTO;

public class ReviewForm extends BaseForm {

    @NotEmpty(message = "Reviewer Name is required")
    private String reviewerName;

    @NotNull(message = "Rating is required")
    @Min(value = 1, message = "Rating must be >= 1")
    @Max(value = 5, message = "Rating must be <= 5")
    private Integer rating;

    @NotEmpty(message = "Review Text is required")
    private String reviewText;

    private LocalDateTime reviewDate;

    // getters & setters
    public String getReviewerName() {
        return reviewerName;
    }
    public void setReviewerName(String reviewerName) {
        this.reviewerName = reviewerName;
    }

    public Integer getRating() {
        return rating;
    }
    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getReviewText() {
        return reviewText;
    }
    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public LocalDateTime getReviewDate() {
        return reviewDate;
    }
    public void setReviewDate(LocalDateTime reviewDate) {
        this.reviewDate = reviewDate;
    }

    @Override
    public BaseDTO getDto() {
        ReviewDTO dto = new ReviewDTO();
        dto = initDTO(dto);
        dto.setReviewerName(reviewerName);
        dto.setRating(rating);
        dto.setReviewText(reviewText);

        // agar date na aaye to current date set
        dto.setReviewDate(
            reviewDate != null ? reviewDate : LocalDateTime.now()
        );

        return dto;
    }
}
