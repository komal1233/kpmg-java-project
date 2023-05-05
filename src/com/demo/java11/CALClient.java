package com.demo.java11;

public class CALClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IndianCal cal1= new IndianCal();
		System.out.println("additon"+cal1.add(4, 5));
		System.out.println("substraction"+cal1.sub(1, 1));
		System.out.println("multiply"+cal1.multi(2, 2));
	
	
	ChineseCal cal2= new ChineseCal();
	System.out.println("chin add"+cal2.add(4, 5));
	System.out.println("sub"+cal2.sub(3, 7));
	
	
	

}
}