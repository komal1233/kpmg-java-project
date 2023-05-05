package com.kpmg.custom.Thread;

public class Thread2 extends Thread {
	
    Printer t;
	
	public Thread2(Printer t) {
		// TODO Auto-generated constructor stub
	 this.t=t;
	}
	
	public void run() {
		
		t.printTable(100);
	}
	


}
