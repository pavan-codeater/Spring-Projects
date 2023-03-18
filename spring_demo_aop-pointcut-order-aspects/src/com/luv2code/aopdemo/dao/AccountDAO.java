package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Component
public class AccountDAO {

	private String name;
	private String serviceCode;
	
	
	
	public String getName() {
		System.out.println("Get name");
		return name;
	}


	public void setName(String name) {
		System.out.println("Set name");
		this.name = name;
	}


	public String getServiceCode() {
		System.out.println("get ServiceCode");
		return serviceCode;
	}


	public void setServiceCode(String serviceCode) {
		System.out.println("Set ServiceCode");
		this.serviceCode = serviceCode;
	}


	public void addAccount(Account theAccount, boolean vipFlag) {
		System.out.println(theAccount+" ");
	}
	
	
	public boolean doWork() {
		System.out.println("i am doing work AccountDAO");
		return true;
	}
	
}
