package com.FoodPlaza21297.dao;

import java.util.List;

import com.FoodPlaza21297.pojo.Customer;


public interface CustomerDao {
	
	boolean addCustomer(Customer cust);
	boolean updateCustomer(Customer cust);
	boolean deleteCustomer(int cusId);
	Customer selectById1(int cusId);
	Customer selectByEmail(String cusEmail);
	List<Customer> selectAll();

}
