package com.FoodPlaza21297.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.FoodPlaza21297.dbutility.DBConnection;
import com.FoodPlaza21297.pojo.Food;
import com.FoodPlaza21297.pojo.Order;

import java.sql.*;

public class OrderDaoImp implements Orderdao {
	
	Connection con=DBConnection.getConnection();

	
	public boolean placeOrder(String cusEmail) {
		
		try
		{
			PreparedStatement ps=con.prepareStatement("select sum(f.foodPrise*c.quantity) as totalBill, f.foodPrise,c.quantity ,f.foodName from food21297 f inner join cart21297 c on c.foodId=f.foodId where cusEmail=?");
			ps.setString(1, cusEmail);
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				double totalBill=rs.getDouble("totalBill");
				String oStatus="processing";
				PreparedStatement ps1=con.prepareStatement("insert into order21297(oStatus,totalBill,cusEmail) values(?,?,?)");
				ps1.setString(1, oStatus);
				ps1.setDouble(2, totalBill);
				ps1.setString(3, cusEmail);
				
				int i=ps1.executeUpdate();
				if(i>0)
				{
					return true;
				}
				
						
			}
			
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	
		return false;
	}

	
	public List<Order> selectAll() {
		
		List al=new ArrayList();
		
		try{
			PreparedStatement ps=con.prepareStatement("select * from order21297 ");
			
			ResultSet r=ps.executeQuery();
			while(r.next())
			{ 
				Order o=new Order();
				o.setOrderId(r.getInt("orderId"));
				o.setoStatus(r.getString("oStatus"));
				o.setTotalBill(r.getDouble("totalBill"));
				o.setCusEmail(r.getString("cusEmail"));
				al.add(o);
				
			}
			
			return al;
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	return al;
		
		
		
		
	}


	@Override
	public boolean placeorder1(String cusEmail, double totalBill) {

		
			try
			{
				String status="complete";
			
				PreparedStatement ps=con.prepareStatement("insert into  order21297(cusEmail,totalBill,oStatus) values(?,?,?)");
				ps.setString(1, cusEmail);
				ps.setDouble(2, totalBill);
				ps.setString(3, status);
				
				
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
}
