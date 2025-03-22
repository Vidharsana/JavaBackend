package com.DAO;

import java.util.List;

import com.Model.Food;

public interface Food_DAO {

	public boolean saveFood(Food food);
	public List<Food> getFoods();
	public boolean deleteFood(Food food);
	public List<Food> getFoodByID(Food food);
	public boolean updateFood(Food food);
}
