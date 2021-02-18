package com.sujata.demo;

public class Circle {

	private double radius,area;

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		Shapes shapes=new Shapes();
		area=shapes.area(radius);
		return area;
	}
	
	
	
}
