package com.sujata.training;

public class Toyota extends Car {

	public Toyota(String model, String color) {
		super(model, color);
	}
	
	public void engine(){
		System.out.println("Toyota "+getModel()+getColor()+" color car engine goes TOOOM!");
	}

}
