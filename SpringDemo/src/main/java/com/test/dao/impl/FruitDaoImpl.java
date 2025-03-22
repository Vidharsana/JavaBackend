package com.test.dao.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.dao.FruitDao;
import com.test.entity.Fruit;
import com.test.repository.FruitRepository;

@Repository
public class FruitDaoImpl implements FruitDao{

	@Autowired
	private FruitRepository repository;

	@Override
	public Fruit createFruit(Fruit frt) {
		
		return repository.save(frt);
	}

	@Override
	public List<Fruit> listAllFruit() {
		
		return repository.findAll();
	}

	@Override
	public Optional<Fruit> getByFruitId(int id) {

		return repository.findById(id);
	}

	@Override
	public Fruit updateFruit(Fruit frt) {
		
		return repository.save(frt);
	}

	@Override
	public List<Fruit> deleteFruitById(int id) {
		
		return repository.findAll();
	}
	
}
