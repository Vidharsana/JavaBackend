package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Model.Food;
import com.Service.Food_Service;

@RestController
@CrossOrigin(origins="https://localhost:4200")
@RequestMapping(value="/api")
public class Controller {

	@Autowired
	private Food_Service foodservice;
	
	@PostMapping("save-food")
	public boolean saveFood(@RequestBody Food food) {
		 return foodservice.saveFood(food);
		
	}
	
	@GetMapping("foods-list")
	public List<Food> allfoods() {
		 return foodservice.getFoods();
	}
	
	
	@DeleteMapping("delete-food/{food_id}")
	public boolean deleteFood(@PathVariable("food_id") int food_id,Food food) {
		food.setFood_id(food_id);
		return foodservice.deleteFood(food);
	}

	@GetMapping("food/{food_id}")
	public List<Food> allfoodByID(@PathVariable("food_id") int food_id,Food food) {
		 food.setFood_id(food_id);
		 return foodservice.getFoodById(food);
		
	}
	
	@PostMapping("update-food/{food_id}")
	public boolean updateFood(@RequestBody Food food,@PathVariable("food_id") int food_id) {
		food.setFood_id(food_id);
		return foodservice.updateFood(food);
	}
}
