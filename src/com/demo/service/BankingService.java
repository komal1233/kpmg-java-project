package com.demo.service;

import com.demo.exception.InsufficientFund;

public class BankingService {
	
	private double balance;
	private int number;
	
	public BankingService(int number) {
		this.number=number;
		
	}
	
	public void deposit(double amount) {
		balance+=amount;
	}
	
	public void withdrwal(double amount) throws InsufficientFund {
		if(amount>=balance) {
			balance= amount;
		}
		else {
			double needs=amount-balance;
			throw new InsufficientFund(needs);
		}
	}

}
