package com.sujata.demo;

public class Square {

	private int side,area;

	public Square(int side) {
		super();
		this.side = side;
	}

	public int getArea() {
		Shapes shapes=new Shapes();
		area=shapes.area(side);
		return area;
	}
	
	
}
