package com.sujata.training;

public class Audi extends Car {

	public Audi(String model, String color) {
		super(model, color);
	}
	
	public void engine(){
		System.out.println("Audi "+getModel()+getColor()+" color car engine goes AOOOM!");
	}

}
