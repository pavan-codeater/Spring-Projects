package com.example.springdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.springdemo.Coach;
import com.example.springdemo.SwimCoach;
import com.example.springdemo.TennisCoach;

@Configuration
public class SportsConfig {

	public SportsConfig() {
		
	}
	
	@Bean
	public Coach swimCoach() {
		return new SwimCoach();
	}
	
	
	

}
