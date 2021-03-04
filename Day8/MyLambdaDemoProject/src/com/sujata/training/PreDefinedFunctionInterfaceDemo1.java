package com.sujata.training;

import java.util.function.Function;

public class PreDefinedFunctionInterfaceDemo1 {

	public static void main(String[] args) {
//		Function<String, Integer> fVar=new Function<String, Integer>() {
//			
//			@Override
//			public Integer apply(String t) {
//				
//				return Integer.parseInt(t);
//			}
//		};
		
//		Function<String, Integer> fVar=argument-> Integer.parseInt(argument);
		
		Function<String, Integer> fVar=Integer::parseInt;
		
		Integer iOb=fVar.apply("10");
		System.out.println("iOb : "+iOb);

	}

}
