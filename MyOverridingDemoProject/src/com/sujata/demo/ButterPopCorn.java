package com.sujata.demo;

public class ButterPopCorn extends PopCorn {
	
	/*
	 * Over Riding Rules
	 * 1. Over riding can happen only in base and derived class
	 * 2. method name need to be same along with method signature
	 * 3. we can broader the scope of over ridden method or can keep the scope as as that of parents class
	 *  but we can't narrow down the scope of an over ridden method in dervived class
	 */
	public void pop(){
		//print() : after printing keeps the cursor on same line
		//println() : after printing moves cursor to different line
		System.out.print("Yummy Butterly ");
		super.pop();
	}
	
	public void butterQuantity(int quantity){
		System.out.println("adding "+quantity+" ounces of butter");
	}

}
