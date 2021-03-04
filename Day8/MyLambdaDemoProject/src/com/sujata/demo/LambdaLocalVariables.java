package com.sujata.demo;

import java.util.function.Consumer;

public class LambdaLocalVariables {

	static int i=10;
	public static void main(String[] args) {

		int x=10;
		i=i+20;
		
//		x=x+5;
		
		Consumer<Integer> cOb=number->System.out.println("x: "+x+" y: "+number+" i : "+i);
		
		cOb.accept(20);
		
		
	}

}
