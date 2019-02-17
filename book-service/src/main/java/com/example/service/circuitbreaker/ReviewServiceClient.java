package com.example.service.circuitbreaker;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.bookservice.vo.ReviewVO;

@FeignClient(name = "review-service" , fallback=HystrixReviewsFallback.class)
public interface ReviewServiceClient {

	@RequestMapping(method= RequestMethod.GET, value="/api/v1/books/{isbn}/reviews")
	public  List<ReviewVO> getReviews(@PathVariable("isbn") String isbn);
}
