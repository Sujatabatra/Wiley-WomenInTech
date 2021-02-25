package com.sujata.training;

public class Suzuki extends Car {

	public Suzuki(String model, String color) {
		super(model, color);
	}
	
	public void engine(){
		System.out.println("Suzuki "+getModel()+getColor()+" color car engine goes SOOOM!");
	}

}
