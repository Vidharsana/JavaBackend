package com.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Model.Food;

@Repository
public class Food_DAO_Imp implements Food_DAO{

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean saveFood(Food food) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().save(food);
			status=true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<Food> getFoods() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Food> query = currentSession.createQuery("from Food", Food.class);
		List<Food> list = query.getResultList();
		return list;
	}

	@Override
	public boolean deleteFood(Food food) {
		boolean status = false;
		try {
			sessionFactory.getCurrentSession().delete(food);
			status=true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<Food> getFoodByID(Food food) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Food> query = currentSession.createQuery("from Food where food_id=:food_id", Food.class);
		query.setParameter("food_id", food.getFood_id());
		List<Food> list = query.getResultList();
		return list;
	}

	@Override
	public boolean updateFood(Food food) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().update(food);
			status=true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}
}
