package com.batra.demo;

//import com.sujata.demo.MyFirstClass;
//import com.sujata.demo.MySecondClass;

import com.sujata.demo.*;
//import com.sujata.training.*;
//import (default package);
public class MyMain {

	public static void main(String[] args) {
		
		MyFirstClass myFirstClass=new MyFirstClass();
		myFirstClass.show();

//		com.sujata.demo.MySecondClass mySecondClass=new com.sujata.demo.MySecondClass();
		MySecondClass mySecondClass=new MySecondClass();
		mySecondClass.doSomething();
		mySecondClass.show();
		
		
		com.sujata.training.MyFirstClass fOb=new com.sujata.training.MyFirstClass();
		
//		we won't be able to access DummyClass here as DummyClass is at default scope and belongs to diff package so we don't have its visibility here 
//		DummyClass dOb=new DummyClass();
		
		
//		MyClass ob=new MyClass();
	}

}
