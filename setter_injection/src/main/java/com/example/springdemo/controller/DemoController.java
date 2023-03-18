package com.example.springdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdemo.Coach;

@RestController
public class DemoController {

	
	
	private Coach theCoach;
	
	@Autowired
	public void setData(@Qualifier("swimCoach") Coach theCoach) {
		this.theCoach=theCoach;
	}
	
	
	@GetMapping("/dailyWorkouts")
	public String getDailyWorkout() {
		return theCoach.getDailyWorkouts()
;	}
	

	public DemoController() {
		System.out.println("Get class name  "+getClass().getSimpleName());
	}
	

}
