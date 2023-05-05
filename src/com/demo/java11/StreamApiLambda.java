package com.demo.java11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamApiLambda {
	
	static List<Integer> inList= Arrays.asList(1,2,3,4,5,67,8,9);
	
	public static void beforejava8() {
		
		List<Integer> event = new ArrayList<>();
		for(int i:inList) {
			if(i%2==0) {
				event.add(i);
			}
			//SYSTEM.OUT.PRINTLN(EVENT);
		}
		System.out.println(event);
		
	}
	
	public static void afterJava8(){
		System.out.println("Event in the list are" +inList.stream().filter(i -> i%2==0).collect(Collectors.toList()));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		beforejava8();
		afterJava8();
	}

}
