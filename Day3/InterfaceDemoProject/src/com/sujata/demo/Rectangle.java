package com.sujata.demo;


public class Rectangle implements Shape,NonRoundedShape {

	private int length,breadth,area,perimeter;
	
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	@Override
	public void area() {
		area=length*breadth;

	}

	public int getArea() {
		return area;
	}

	@Override
	public void show() {
		System.out.println("Area of Rectangle : "+area);
		System.out.println("Perimeter of Rectangle : "+perimeter);
	}

	@Override
	public void perimeter() {
		
		perimeter=2*(length+breadth);
	}

}
