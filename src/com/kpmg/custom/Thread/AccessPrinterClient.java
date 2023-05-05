package com.kpmg.custom.Thread;

public class AccessPrinterClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Printer obj= new Printer();
		Printer obj=new Printer();
		Thread1 t1=new Thread1(obj);
		Thread2 t2=new Thread2(obj);
		
		t1.start();
		t2.start();
				
	}

	

}
