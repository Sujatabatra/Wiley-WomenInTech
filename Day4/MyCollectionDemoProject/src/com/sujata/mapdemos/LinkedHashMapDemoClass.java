package com.sujata.mapdemos;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemoClass {

	public static void main(String[] args) {
		//Ordered collection of key value pair, where keys are unique and value can be duplicate n Ordering wrt key
		Map<String, Integer> months=new LinkedHashMap<>();
		
		months.put("Jan", 31);
		months.put("Feb", 28);
		months.put("Mar", 31);
		months.put("Apr", 30);
		months.put("May", 31);
		
		System.out.println(months);
		System.out.println("Size of months collection : "+months.size());
		months.put("Jun", 30);
		months.put("Feb", 29); // duplicate key, that will update the value of existing key with new value
		
		System.out.println(months);
		System.out.println("Size of months collection : "+months.size());
		
		Set<String> keys=months.keySet();
		for(String key:keys){
			System.out.println(key+" month has "+months.get(key)+" days");
		}
		Integer value1=months.get("Jun"); // fetching value associated with key Jun
		
		Integer value2=months.remove("Mar"); //Fetching value associate with key Mar and also deleting the same key value pair as well from collection
		
		System.out.println(months);
		System.out.println("Size of months collection : "+months.size());
		

	}

}
