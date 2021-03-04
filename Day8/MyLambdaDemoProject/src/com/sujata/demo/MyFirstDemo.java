package com.sujata.demo;

import java.util.function.Consumer;

//Functional Interface (interface with exactly one method)
@FunctionalInterface
interface Greet{
	public void wish(String name);
}

public class MyFirstDemo {

	public static void main(String[] args) {
		int x=10;
	
		boolean d=true;
		
		Greet gOb=new Greet() {
			@Override
			public void wish(String name) {
				System.out.println(name+" welcome");
			}
		};
		
		//Lambda Expression
//        Greet gVar= (name)->{
//        	System.out.println(name+" Welcome to the world of lambda's !");
//        };
//        
//        Greet gVar= (name)->System.out.println(name+" Welcome to the world of lambda's !");
        
        Greet gVar= name->System.out.println(name+" Welcome to the world of lambda's !");
        
        gVar.wish("Zohra");

        /*
         * interface Consumer<T>
         * {
         * public void accept(T value);
         * }
         */
        Consumer<String> cVar=name->System.out.println("welcome "+name);
        cVar.accept("Anjali");
	}

}
