package com.example.springdemo;




public class SwimCoach implements Coach{

	public SwimCoach() {
		System.out.println("Constructor SwimCoach");
	}

	@Override
	public String getDailyWorkouts() {
		
		return "Daily Swim";
	}

}
