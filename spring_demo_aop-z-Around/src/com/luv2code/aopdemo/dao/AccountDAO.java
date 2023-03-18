package com.luv2code.aopdemo.dao;

import java.util.*;
import java.util.List;

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
	
	
	public List<Account> findAccounts(boolean trip) {
		
		if(trip==true) {
			throw new RuntimeException("Eat Burger");
		}
		
		List<Account> myAccount=new ArrayList();
		
		Account a1=new Account("John","silver");
				Account a2=new Account("Tom","Gold");
		Account a3=new Account("Messi","Bronze");
		
		myAccount.add(a1);
		myAccount.add(a2);
		myAccount.add(a3);
		
		System.out.println("Returning from FindAccounts");
		return myAccount;
		
		
		 
	}
	
}
