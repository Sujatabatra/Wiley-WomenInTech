package com.sujata.methodreferencedemos;

import java.util.function.BiFunction;

public class MySecondClass {

	public static void main(String args[]){
	
//		BiFunction<String, String, Integer> bOb=(str1,str2)->str1.compareTo(str2);
		
		BiFunction<String, String, Integer> bOb=String::compareTo;
	
		System.out.println(bOb.apply( "Batra","Batra"));
		
	}

}
