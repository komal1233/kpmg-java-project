package com.demo.java11;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

interface Addition{
	public int add(int a, int b);
	
}
//to use always add external jar from =------------->>>>>> http://www.java2s.com/Code/Jar/v/Downloadvalidationapi110finaljar.htm
public class LambdaEnhancement {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Addition add(a,b)>(a+b);
		beforejava11();
		afterJava11();
	}
	
	
	public static void beforejava11() {
		Addition add=(a,b)->(a+b);
		int sum =add.add(100, 100);
		System.out.println("before java 11 "+sum);
	}
	
	public static void afterJava11() {
		Addition add=(@Min (value=10) var a, @Max( value=20) var b )->(a+b);
		int sum = add.add(20, 20);
		System.out.println("after 11 "+sum);
	}

}
