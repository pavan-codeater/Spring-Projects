package com.example.springdemo;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TennisCoach implements Coach{

	public TennisCoach() {
		System.out.println("Get class name  "+getClass().getSimpleName());
	}

	@Override
	public String getDailyWorkouts() {
		
		return "Play Daily Tennis";
	}

	
	
	
	
}
