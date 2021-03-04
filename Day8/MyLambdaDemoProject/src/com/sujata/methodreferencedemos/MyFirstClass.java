package com.sujata.methodreferencedemos;

import java.util.function.Consumer;

class Greet{
	public void wish(String name){
		System.out.println("Welcome "+name);
	}
}

public class MyFirstClass {

	public static void main(String args[]){
		Greet gOb=new Greet();
		
//		Consumer<String> cOb=(argument)->gOb.wish(argument);
		
		Consumer<String> cOb=gOb::wish;
		cOb.accept("Chaitra");
		
	}
}
