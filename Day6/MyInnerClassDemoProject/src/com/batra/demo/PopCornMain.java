package com.batra.demo;

class ButterPopCorn extends PopCorn{
	public void pop(){
		System.out.println("Butterly Deliciously PopCorn Popping");
	}
}
public class PopCornMain {

	public static void main(String[] args) {
		PopCorn pOb1=new PopCorn();
		pOb1.pop();
		
		pOb1=new ButterPopCorn();
		pOb1.pop();
		
		//What is the class name ? nothing (Anonymous class)
		pOb1=new PopCorn(){
			//Overriding
			public void pop(){
				System.out.println("Yummy Caramel PopCorn is popping");
			}
		};
		
		pOb1.pop();

	}

}
