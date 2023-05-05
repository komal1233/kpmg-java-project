package com.demo.client;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hasMapObject = new HashMap<Integer, String>();
		
		TreeMap<Integer, String> treeMap= new TreeMap<>();
		
		hasMapObject.put(101, "Delhi");
		hasMapObject.put(103, "Bangalore");
		hasMapObject.put(104, "Haldwani");
		hasMapObject.put(105, "bhimtal");
		hasMapObject.put(106, "Nianital");
		
		treeMap.put(101, "Tomato");
		treeMap.put(103, "potato");
		treeMap.put(104, "ladyfingure");
		treeMap.put(105, "brinjal");
		treeMap.put(106, "onion");
		
		  for(Map.Entry m:hasMapObject.entrySet()){  
			   System.out.println(m.getKey()+" hashmap "+m.getValue());  
			  }  
		  
		  for(Map.Entry m:treeMap.entrySet()){  
			   System.out.println(m.getKey()+ " treeMap "+m.getValue());  
			  } 
		
		}

}
