package com.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.test.entity.Fruit;

@Repository
public interface FruitService {

	public Fruit createFruit(Fruit frt);
	public List<Fruit> listAllFruit();
	public Optional<Fruit> getByFruitId(int id);
	public Fruit updateFruit(Fruit frt);
	public List<Fruit> deleteFruitById(int id);
}
