package com.FoodPlaza21297.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;




import com.FoodPlaza21297.dbutility.*;
import com.FoodPlaza21297.pojo.Food;

public class FoodDaoImp implements foodDao {
	
	Connection con=DBConnection.getConnection();

	
	public boolean addFood(Food food)
	{
		try
		{
		
			PreparedStatement ps=con.prepareStatement("insert into  food21297(foodName,foodPrise,foodCatagory) values(?,?,?)");
			ps.setString(1, food.getFoodName());
			ps.setDouble(2, food.getFoodPrise());
			ps.setString(3, food.getFoodCatagory());
			
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


	public boolean updateFood(Food food) {
		
		try
		{
		
		PreparedStatement ps=con.prepareStatement("update food21297 set foodName=?,foodPrise=?,foodCatagory=? where foodId=? ");
		ps.setString(1, food.getFoodName());
		ps.setDouble(2, food.getFoodPrise());
		ps.setString(3, food.getFoodCatagory());
		ps.setInt(4, food.getFoodId());
		
		int p=ps.executeUpdate();
		if(p>0)
		{
			return true;
		}
	
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		return false;
	}


	public boolean deleteFood(int foodId) {
		try
		{
		PreparedStatement ps=con.prepareStatement("delete from food21297  where foodId=? ");
		ps.setInt(1, foodId);
		
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
	
	

	public Food selectById(int foodId) {
		
		Food f=new Food();
		try{
			PreparedStatement ps=con.prepareStatement("select * from food21297 where foodId=?");
			ps.setInt(1, foodId);
			ResultSet r=ps.executeQuery();
			while(r.next())
			{
				f.setFoodId(r.getInt("foodId"));
				f.setFoodName(r.getString("foodName"));
				f.setFoodPrise(r.getDouble("foodPrise"));
				f.setFoodCatagory(r.getString("foodCatagory"));
			}
			
			
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
		return f;
	}
	
	
	public List<Food> selectAll() {

		
			List al=new ArrayList();
			
			try{
				PreparedStatement ps=con.prepareStatement("select * from food21297 ");
				
				ResultSet r=ps.executeQuery();
				while(r.next())
				{ Food f=new Food();
					f.setFoodId(r.getInt("foodId"));
					f.setFoodName(r.getString("foodName"));
					f.setFoodPrise(r.getDouble("foodPrise"));
					f.setFoodCatagory(r.getString("foodCatagory"));
					al.add(f);
				}
				
				return al;
				
			}catch(Exception e)
			{
				System.out.println(e);
			}
		return al;
	}


	@Override
	public List<Food> searchFood(String foodName) {
	
		List al=new ArrayList();
		
		try{
			PreparedStatement ps=con.prepareStatement("select * from food21297 where  foodName like?");
			ps.setString(1,"%"+foodName+"%" );
			ResultSet r=ps.executeQuery();
			while(r.next())
			{
				Food f=new Food();
				f.setFoodId(r.getInt("foodId"));
				f.setFoodName(r.getString("foodName"));
				f.setFoodPrise(r.getDouble("foodPrise"));
				f.setFoodCatagory(r.getString("foodCatagory"));
				al.add(f);
			}
			
			return al;
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	return null;
	}

	
public static void main(String[] args) {
	
	FoodDaoImp a=new FoodDaoImp();
	
	List b=a.searchFood("p%");
	System.out.println(b);
}	

}


