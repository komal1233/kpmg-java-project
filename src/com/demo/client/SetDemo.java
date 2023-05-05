package com.demo.client;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count[]= {001,200,3,4,5,2,200,2};
		 Set set = new HashSet<>();
		 try {
			 for(int i=0;i<5;i++) {
				 set.add(count[i]);
				 
			 }
			 System.out.println(set);
			 
			 TreeSet<Integer> ordering = new TreeSet<>(set);
			 System.out.println("sorted set"+ordering);
			 
			 System.out.println("firstelement "+ ordering.first());
			 System.out.println("last element "+ordering.last());
		 }
		 catch(Exception ex) {
			 
		 }

	}

}
