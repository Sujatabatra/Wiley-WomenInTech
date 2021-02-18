package com.sujata.demo;

public class Rectangle {

	/*instance variable*/
	private int length,breadth,area;

	public Rectangle(int length, int breadth/*local variable*/) {
		//length=length =>  local variable length=local variable length
		//current instance variable length=local variable length
		//whenever there is a naming ambiguity between instance and local variable then to refer to instance variable use 'this' , this.instance variable
		this.length = length;
		this.breadth = breadth;
	}

	public int getArea() {
		Shapes shape=new Shapes();
		area=shape.area(length, breadth);
		return area;
	}
	
	
	
	
}
