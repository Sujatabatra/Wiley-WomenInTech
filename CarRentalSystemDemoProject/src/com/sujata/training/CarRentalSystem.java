package com.sujata.training;

import com.sujata.demo.Audi;
import com.sujata.demo.BMW;
import com.sujata.demo.Car;
import com.sujata.demo.Driver;
import com.sujata.demo.Suzuki;
import com.sujata.demo.Toyota;

public class CarRentalSystem {

	public static void main(String[] args) {
		Driver sonu=new Driver("Sonu");
		Driver ramesh=new Driver("Ramesh");
		
		Car car1=new Audi("A8", "Red");
		Car car2=new BMW("Q5", "Blue");
		Car car3=new Toyota("Altis", "Golden");
		Car car4=new Suzuki("Ciaz", "Silver");
		
		sonu.setCar(car2);
		sonu.drive();

		
	}

}
