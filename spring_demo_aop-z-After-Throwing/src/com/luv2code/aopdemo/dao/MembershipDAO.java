package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

	public void addAccount() {
		System.out.println("Membership DAO");
	}
	
	public boolean doSleep() {
		System.out.println("sleeping");
		return true;
	}
}
