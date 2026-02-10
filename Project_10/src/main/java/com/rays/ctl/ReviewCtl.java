package com.rays.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.ReviewDTO;
import com.rays.form.ReviewForm;
import com.rays.service.ReviewServiceInt;

@RestController
@RequestMapping("/Review")
public class ReviewCtl extends BaseCtl<ReviewForm, ReviewDTO, ReviewServiceInt> {
	
	

	@GetMapping("/preload")
	public ORSResponse preload() {
		System.out.println("inside preload Rahul");
		ORSResponse res = new ORSResponse(true);
		return res;
	}
}
