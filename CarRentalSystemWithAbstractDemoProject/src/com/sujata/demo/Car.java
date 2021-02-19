package com.sujata.demo;
/*
 * Abstract is the way of sharing contract with child classes
 * 1. if a class have even one abtract method then its mandatory for us to mark class also as abstract
 * 2. we can't instantiate(create objects) abtract class, we can create reference variable and can inherit abstract class
 * 3. we can have multiple abstract method in a class, means we can have multiple contract which child class needs to fulfil
 */

abstract public class Car {

	private String model,color;

	public Car(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}
	//Contract with child to give implementation of the following method
	abstract public void engine();
	
	abstract public void dummy();
}
