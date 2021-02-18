package com.sujata.training;

import com.sujata.demo.Circle;
import com.sujata.demo.Rectangle;

public class ShapesMain {

	public static void main(String[] args) {
		Rectangle rectangle=new Rectangle(5, 8);
		System.out.println("Area of Rectangle : "+rectangle.getArea());
		
		Circle circle=new Circle();
		circle.setRadius(5.6);
		System.out.println("Area of Circle : "+circle.getArea());

	}

}
