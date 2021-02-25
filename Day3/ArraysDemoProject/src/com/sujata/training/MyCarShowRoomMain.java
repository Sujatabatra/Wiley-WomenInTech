package com.sujata.training;

import java.util.Scanner;

public class MyCarShowRoomMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter total no of cars in a showroom : ");
		int total=scanner.nextInt();
		
		CarShowroom showRoom=new CarShowroom(total);
		
		for(int i=0;i<total;i++){
			System.out.println("Select Type of car ");
			System.out.println("1. Audi ");
			System.out.println("2. BMW");
			System.out.println("3. Toyota");
			System.out.println("4. Suzuki");
			int choice=scanner.nextInt();
			
			System.out.println("Enter Model : ");
			String model=scanner.next();
			System.out.println("Enter Color : ");
			String color=scanner.next();
			
			switch(choice){
			case 1:
				showRoom.addCar(new Audi(model, color), i);
				break;
			case 2:
				showRoom.addCar(new BMW(model, color), i);
				break;
			case 3:
				showRoom.addCar(new Toyota(model, color), i);
				break;
			case 4:
				showRoom.addCar(new Suzuki(model, color), i);
				break;
			}
			
		}
		
		System.out.println("List of all the cars in a showroom ");
		
		for(Car car:showRoom.getCars()){
			car.engine();
		}

	}

}
