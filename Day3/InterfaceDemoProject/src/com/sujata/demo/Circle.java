package com.sujata.demo;

public class Circle implements RoundedShape {

	private double radius;
	private double area,circumference;
	
	@Override
	public void area() {	
		area=PI*radius*radius;
	}
	@Override
	public void show() {
		System.out.println("Area of circle : "+area);
		System.out.println("Circumference of Circle : "+circumference);

	}
	@Override
	public void circumference() {
		circumference=2*PI*radius;

	}
	public double getArea() {
		return area;
	}
	public double getCircumference() {
		return circumference;
	}
	@Override
	public void wish(String name) {
		System.out.println("Welcome to the world of interfaces "+name);
		
	}
	

}
