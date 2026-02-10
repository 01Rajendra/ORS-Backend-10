package com.rays.dto;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_REVIEW")
public class ReviewDTO extends BaseDTO {

	@Column(name = "REVIEWER_NAME", length = 100)
	private String reviewerName;

	@Column(name = "RATING")
	private Integer rating;

	@Column(name = "REVIEW_TEXT", length = 500)
	private String reviewText;

	@Column(name = "REVIEW_DATE")
	private LocalDateTime reviewDate;

	// ===== getters & setters =====
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

	// ===== BaseDTO mandatory methods =====
	@Override
	public String getUniqueKey() {
		return "reviewerName";
	}

	@Override
	public String getUniqueValue() {
		return reviewerName;
	}

	@Override
	public String getLabel() {
		return "Review";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		map.put("reviewDate", "desc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<>();
		map.put("reviewerName", reviewerName);
		return map;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}
}
