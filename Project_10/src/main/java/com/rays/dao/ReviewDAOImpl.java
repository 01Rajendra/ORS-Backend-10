package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.ReviewDTO;

@Repository
public class ReviewDAOImpl extends BaseDAOImpl<ReviewDTO> implements ReviewDAOInt {

	@Override
	protected List<Predicate> getWhereClause(ReviewDTO dto, CriteriaBuilder builder, Root<ReviewDTO> qRoot) {

		List<Predicate> where = new ArrayList<>();

		if (dto.getReviewerName() != null && !dto.getReviewerName().isEmpty()) {
			where.add(builder.like(qRoot.get("reviewerName"), dto.getReviewerName() + "%"));
		}

		if (dto.getRating() != null) {
			where.add(builder.equal(qRoot.get("rating"), dto.getRating()));
		}

		return where;
	}

	@Override
	public Class<ReviewDTO> getDTOClass() {
		return ReviewDTO.class;
	}
}
