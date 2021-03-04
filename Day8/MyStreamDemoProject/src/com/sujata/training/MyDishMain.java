package com.sujata.training;

import java.util.Arrays;
import java.util.List;

public class MyDishMain {

	public static void main(String[] args) {
		DishService dishService=new DishService();
		System.out.println(dishService.getVegetarianDishNames());

		List<String> myList=Arrays.asList("AAA","BBB","CCC","AAA","DDD","CCC");
		
		myList.stream()
		.distinct()
		.forEach(System.out::println);
	}

}
