package com.sujata.training;

public class BMW extends Car {

	public BMW(String model, String color) {
		super(model, color);
	}
	
	public void engine(){
		System.out.println("BMW "+getModel()+getColor()+" color car color car engine goes BOOOM!");
	}

}
