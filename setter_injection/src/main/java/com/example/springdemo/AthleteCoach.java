package com.example.springdemo;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class AthleteCoach implements Coach{

	
	public AthleteCoach() {
		System.out.println("Get class name  "+getClass().getSimpleName());
	}

	

	@Override
	public String getDailyWorkouts() {
		
		return "Daily 50kms marathon from on------";
	}

}
