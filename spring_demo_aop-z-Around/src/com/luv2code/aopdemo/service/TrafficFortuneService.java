package com.luv2code.aopdemo.service;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;


@Component
public class TrafficFortuneService {

	public String getFortune()  {
		
		
		try {
		TimeUnit.SECONDS.sleep(5);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
		return "Except heavy Traffic today";
		
	}
	
	
}
