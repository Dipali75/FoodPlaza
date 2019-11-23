package com.FoodPlaza21297.dao;

import java.util.List;

import com.FoodPlaza21297.pojo.Cart;
import com.FoodPlaza21297.pojo.Customer;

public interface CartDao {
	boolean addCart(int foodId,String cusEmail);
	boolean deleteCart(int cartId);
	List selectAll(String cusEmail);
	boolean clearCart(String cusEmail);
	
}
