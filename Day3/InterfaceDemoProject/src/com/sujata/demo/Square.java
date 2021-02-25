package com.sujata.demo;

public class Square extends InputValue implements Shape, NonRoundedShape {

	public Square(int value) {
		super(value);
	}

	private int area,perimeter;
	
	@Override
	public void perimeter() {
		perimeter=4*getValue();

	}

	@Override
	public void area() {
		area=getValue()*getValue();

	}

	@Override
	public void show() {
		System.out.println("Area of Square : "+area);
		System.out.println("Perimeter of Square : "+perimeter);

	}

}
