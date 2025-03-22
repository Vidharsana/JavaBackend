package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.Fruit;
import com.test.service.FruitService;

@RestController
@RequestMapping("/fruit/v1")
public class FruitController {

	@Autowired
	private FruitService service;
	
	@PostMapping("/create")
	public Fruit createCustomer(@RequestBody Fruit frt) {
		return service.createFruit(frt);
	}
	@GetMapping("/listAll")
	public List<Fruit> listAllFruit(){
		return service.listAllFruit();
	}
	@PutMapping("/update/{id}")
	public Fruit updateFruit(@RequestBody Fruit frt, @PathVariable("id")int id){
		frt.setId(id);
		return service.updateFruit(frt);
	}
	@DeleteMapping("/delete/{id}")
	public List<Fruit> deleteFruit(@RequestBody Fruit frt, @PathVariable("id")int id){
		return service.deleteFruitById(id);
	}
}
