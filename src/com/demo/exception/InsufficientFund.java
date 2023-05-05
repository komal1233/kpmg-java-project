package com.demo.exception;

public class InsufficientFund extends Exception {
	
	private double amount;
	
	public InsufficientFund(double amount) {
		this.amount= amount;
	}
	
	public double getAmount() {
		return amount;
	}
}
