package com.example.demo.controller;

import com.example.pojo.Rating;
import com.example.serviceipl.RatingServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/rate")
public class RatingController {
	
	
	@Autowired
	RatingServiceImp rateImp;
	
	@PostMapping(value = "/addrating")
	public String addRatingDetails(@RequestBody Rating rate) {
		Rating r = rateImp.addRatingDetails(rate);
		
		if(r!=null) {
			return "inserted successfully";
		}
		else {
			return "not inserted";
		}
	}

}
