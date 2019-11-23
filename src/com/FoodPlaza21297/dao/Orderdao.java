package com.FoodPlaza21297.dao;

import java.util.List;

import com.FoodPlaza21297.pojo.Order;

public interface Orderdao {
	
	boolean placeOrder(String cusEmail);
	List<Order> selectAll();
	boolean placeorder1(String cusEmail,double totalBill);

}
