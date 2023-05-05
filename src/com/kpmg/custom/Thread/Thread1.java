package com.kpmg.custom.Thread;

public class Thread1 extends Thread {

Printer t;
	
	public Thread1(Printer t) {
		// TODO Auto-generated constructor stub
	 this.t=t;
	}
	
	public void run() {
		
		t.printTable(5);
	}

	
}
