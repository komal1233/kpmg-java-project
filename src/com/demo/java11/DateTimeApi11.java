package com.demo.java11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DateTimeApi11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayCurrentDateBefore8and11();
	}
	
	private static void displayCurrentDateBefore8and11() {
		Date localdate= new Date();
		LocalDate date= LocalDate.now();
		LocalTime time= LocalTime.now();
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("localdate"+localdate);
		
		
		System.out.println("after 8 date"+date);
		System.out.println("time"+time);
		System.out.println("date and time"+dateTime);
		
		
		System.out.println();
		
		
		
		
		
		
	}

}
