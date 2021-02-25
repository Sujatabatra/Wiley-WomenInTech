package com.sujata.training;

public class CarShowroom {

	private Car cars[];
	private int totalNoOfCars;
	
	public CarShowroom(int totalNoOfCars) {
		this.totalNoOfCars=totalNoOfCars;
		cars=new Car[totalNoOfCars];
	}
	
	public void addCar(Car car,int index){
		cars[index]=car;
	}

	public Car[] getCars() {
		return cars;
	}
	
	
}
