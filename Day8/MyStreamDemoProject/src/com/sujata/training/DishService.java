package com.sujata.training;

import java.util.List;
import static java.util.stream.Collectors.*;

public class DishService {

	private DishDao dishDao=new DishDao();
	
	public List<String> getVegetarianDishNames(){
//		return dishDao.getAllDishes().stream()
//				.filter(dish->dish.isVegetarian())
//				.map(dish1->dish1.getDishName())
//				.collect(Collectors.toList());
//		
		return dishDao.getAllDishes().stream()
				.filter(Dish::isVegetarian)
				.map(Dish::getDishName)
				.limit(2)
//				.sorted((dishName1,dishName2)->dishName1.compareTo(dishName2))
				.sorted(String::compareTo)
				.collect(toList());
	}
	
	
}
