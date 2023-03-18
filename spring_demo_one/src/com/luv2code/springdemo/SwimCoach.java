package com.luv2code.springdemo;

public class SwimCoach implements Coach{

	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}
	
	
	@Override
	public String getDailyWorkout() {
	
		return "Daily Swim fastly";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
