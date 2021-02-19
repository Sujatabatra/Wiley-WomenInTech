package com.sujata.demo;

public class Driver {

	private String name;
	//reference variable of Base
	private Car car;
	
	public Driver(String name) {
		super();
		this.name = name;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	
	public void drive(){
		System.out.print(name+" is driving "+car.getColor()+" "+car.getModel()+" ");
		car.engine();
	}
	
}
