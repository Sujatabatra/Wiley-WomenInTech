package com.sujata.training;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DishDao {

	static private List<Dish> dishes=new ArrayList<>();
		
	static{
		dishes.add(new Dish("Paneer Masala", true, 350, 450));
		dishes.add(new Dish("Chicken Tikka", false, 480, 650));
		dishes.add(new Dish("Fish Fry", false, 800, 850));
		dishes.add(new Dish("Dal Fry", true, 250, 350));
		dishes.add(new Dish("Matar Mushroom", true, 430, 475));
	}
	
	public List<Dish> getAllDishes(){
		return dishes;
	}
}
