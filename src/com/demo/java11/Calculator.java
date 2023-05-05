package com.demo.java11;

public interface Calculator {
	
	default public int add(int a, int b) {
		return a+b;
		
	}
	public int sub(int a, int b);
	public int multi(int a , int b);

}
