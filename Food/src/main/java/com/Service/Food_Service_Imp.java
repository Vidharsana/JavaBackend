package com.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.DAO.Food_DAO;
import com.Model.Food;

@Service
@Transactional
public class Food_Service_Imp implements Food_Service{

	@Autowired
	private Food_DAO fooddao;

	@Override
	public boolean saveFood(Food food) {
		return fooddao.saveFood(food);
	}

	@Override
	public List<Food> getFoods() {
		return fooddao.getFoods();
	}

	@Override
	public boolean deleteFood(Food food) {
		return fooddao.deleteFood(food);
	}

	@Override
	public List<Food> getFoodById(Food food) {
		return fooddao.getFoodByID(food);
	}

	@Override
	public boolean updateFood(Food food) {
		return fooddao.updateFood(food);
	}
	
	
}
