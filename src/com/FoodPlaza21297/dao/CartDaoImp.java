package com.FoodPlaza21297.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.FoodPlaza21297.dbutility.DBConnection;
import com.FoodPlaza21297.pojo.Cart;
import com.FoodPlaza21297.pojo.Food;

public class CartDaoImp implements CartDao {

	Connection con=DBConnection.getConnection();
	

	public boolean addCart(int foodId, String CusEmail) {
		try
		{
		
			PreparedStatement ps=con.prepareStatement("insert into  cart21297(foodId,cusEmail) values(?,?)");
			ps.setInt(1, foodId);
			
			ps.setString(2, CusEmail);
			
			int a=ps.executeUpdate();
			if(a>0)
			{
				return true;
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();;
		}
		
		return false;
	}


	public boolean deleteCart(int cartId) {
		try
		{
		PreparedStatement ps=con.prepareStatement("delete from cart21297  where cartId=? ");
		ps.setInt(1, cartId);
		
		int p1=ps.executeUpdate();
		
		if(p1>0)
		{
			return true;
		}
		
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return false;
		
	}

	
	public List selectAll(String cusEmail) {
		
		List al=new ArrayList();
		
		try{
			PreparedStatement ps=con.prepareStatement("select c.cartId,f.foodName,f.foodPrise,c.foodId,c.cusEmail from food21297 f inner join cart21297 c on f.foodId=c.foodId where c.cusEmail=?;");
			
			ps.setString(1, cusEmail);
			ResultSet r=ps.executeQuery();
			while(r.next())
			{ 
				Cart c=new Cart();
				c.setCartId(r.getInt("cartId"));
				c.setFoodId(r.getInt("foodId"));
				c.setFoodName(r.getString("foodName"));
				c.setFoodPrise(r.getInt("foodPrise"));
				
				c.setCusEmail(r.getString("cusEmail"));
				
				al.add(c);
			}
			
			return al;
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	return al;
		
	
	}


	@Override
	public boolean clearCart(String cusEmail) {
		
		try
		{
			PreparedStatement ps=con.prepareStatement("delete from cart21297  where cusEmail=? ");
			ps.setString(1, cusEmail);
			int a=ps.executeUpdate();
			if(a>0)
			{
				return true;
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		

		return false;
	}
}
