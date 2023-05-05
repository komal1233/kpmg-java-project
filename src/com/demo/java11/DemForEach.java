package com.demo.java11;

import java.util.Arrays;
import java.util.List;

public class DemForEach {

	public static void main(String[] args) {
		withForEach();
		withoutForEach();
		
	}
	
	private static void withoutForEach() {
		List<Integer> list= Arrays.asList(1,2,3,4,5,7,8,9);
		for(int i=0;i<list.size();i++) {
			System.out.println("with"+list.get(i));
		}
	}
	
	private static void withForEach() {
		List<Integer> list= Arrays.asList(1,2,3,4,5,7,8,9);
		System.out.println("without ");
		list.forEach(System.out::println);
		
	}
}
