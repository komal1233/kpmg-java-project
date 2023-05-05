package com.demo.client;

import com.demo.exception.InsufficientFund;
import com.demo.service.BankingService;

public class BankClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankingService service = new BankingService(10);
		System.out.println("deposit the 500$");
		service.deposit(500);
		try{
			System.out.println("withdrawl 100$");
			service.withdrwal(100.00);
			
			System.out.println("withdrawl 600$");
			service.withdrwal(600.00);

	}catch (InsufficientFund e) {
		// TODO: handle exception
		System.out.println("sorry less money"+e.getAmount());
	}

}
}
