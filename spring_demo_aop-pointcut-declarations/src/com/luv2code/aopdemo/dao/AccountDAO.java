package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Component
public class AccountDAO {

	public void addAccount(Account theAccount, boolean vipFlag) {
		System.out.println(theAccount+" ");
	}
	
	
	public boolean doWork() {
		System.out.println("i am doing work AccountDAO");
		return true;
	}
	
}
