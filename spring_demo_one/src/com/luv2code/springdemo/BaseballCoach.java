package com.luv2code.springdemo;

public class BaseballCoach implements Coach {

	private FortuneService fortuneService;
	
	BaseballCoach(FortuneService fortuneService){
		this.fortuneService=fortuneService;
	}
	
	
	
	@Override
	public String getDailyWorkout(){
		return "Spend 30 minutes on batting practice";
	}



	@Override
	public String getFortune() {
		
		return fortuneService.getFortune();
	}

     

	
	
}
