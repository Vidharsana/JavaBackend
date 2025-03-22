package com.Service;

import java.util.List;

import com.Model.Food;

public interface Food_Service {

	public boolean saveFood(Food food);
	public List<Food> getFoods();
	public boolean deleteFood(Food food);
	public List<Food> getFoodById(Food food);
	public boolean updateFood(Food food);
}
