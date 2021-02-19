package com.sujata.demo;

public class PopCornMart {

	private PopCorn popCorn;

	public void setPopCorn(PopCorn popCorn) {
		this.popCorn = popCorn;
	}
	
	public void buy(){
		System.out.print("Please take your order ");
		popCorn.pop();
	}
}
