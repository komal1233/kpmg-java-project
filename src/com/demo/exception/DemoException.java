package com.demo.exception;

public class DemoException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {	
		int a=20, b =0;
		int c=a/b;
		System.out.println("output"+c);
	}
	catch (ArithmeticException e) {//better practtice for performace
		// TODO: handle exception
		System.out.println("Exception raisedthmetic exception"+e.getMessage());
	}
	finally {
		System.out.println("finally block will  be executed");
	}
	}

}
