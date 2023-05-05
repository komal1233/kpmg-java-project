package com.kpmg.custom.Thread;

public class Printer {

void printTable(int n) {
		
		synchronized(this) {
		
		for(int i=1;i<=5; i++) {
			
			System.out.println(n*i);
		     try {
		    	 Thread.sleep(200);
		     }catch (Exception ex) {
				// TODO: handle exception
		    	 System.out.println(ex.getMessage());
			}
		}
		}
	}

}
