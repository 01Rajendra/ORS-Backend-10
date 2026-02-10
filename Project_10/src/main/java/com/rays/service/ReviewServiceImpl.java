package com.rays.service;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.ReviewDAOInt;
import com.rays.dto.ReviewDTO;

@Service
public class ReviewServiceImpl extends BaseServiceImpl<ReviewDTO, ReviewDAOInt> implements ReviewServiceInt {
}
