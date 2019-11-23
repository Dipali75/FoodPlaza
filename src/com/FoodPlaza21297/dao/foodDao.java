package com.FoodPlaza21297.dao;

import java.util.List;

import com.FoodPlaza21297.pojo.Food;

public interface foodDao {
	
	boolean addFood(Food food);
	boolean updateFood(Food food);
	boolean deleteFood(int foodId);
	Food selectById(int foodId);
	List<Food> selectAll();
	List<Food> searchFood(String foodName);

}
