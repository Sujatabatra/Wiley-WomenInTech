package com.sujata.training;

public class Dish {

	private String dishName;
	private boolean vegetarian;
	private int calorie;
	private int price;
	
	public Dish() {
	
	}

	public Dish(String dishName, boolean vegetarian, int calorie, int price) {
		super();
		this.dishName = dishName;
		this.vegetarian = vegetarian;
		this.calorie = calorie;
		this.price = price;
	}

	public String getDishName() {
		return dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}

	public int getCalorie() {
		return calorie;
	}

	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Dish [dishName=" + dishName + ", vegetarian=" + vegetarian + ", calorie=" + calorie + ", price=" + price
				+ "]";
	}
	
	
}
