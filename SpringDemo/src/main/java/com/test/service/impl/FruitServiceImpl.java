package com.test.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.dao.FruitDao;
import com.test.entity.Fruit;
import com.test.service.FruitService;

public class FruitServiceImpl implements FruitService{

	@Autowired
	private FruitDao fruitDao;
	@Override
	public Fruit createFruit(Fruit frt) {
		
		return createFruit(frt);
	}

	@Override
	public List<Fruit> listAllFruit() {
		
		return fruitDao.listAllFruit();
	}

	@Override
	public Optional<Fruit> getByFruitId(int id) {
		
		return fruitDao.getByFruitId(id);
	}

	@Override
	public Fruit updateFruit(Fruit frt) {
		
		return fruitDao.updateFruit(frt);
	}

	@Override
	public List<Fruit> deleteFruitById(int id) {
		
		return fruitDao.deleteFruitById(id);
	}

}
