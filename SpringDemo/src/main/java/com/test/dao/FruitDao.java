package com.test.dao;

import java.util.List;
import java.util.Optional;

import com.test.entity.Fruit;

public interface FruitDao {

	public Fruit createFruit(Fruit frt);
	public List<Fruit> listAllFruit();
	public Optional<Fruit> getByFruitId(int id);
	public Fruit updateFruit(Fruit frt);
	public List<Fruit> deleteFruitById(int id);
}
