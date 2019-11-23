package com.FoodPlaza21297.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.FoodPlaza21297.dbutility.DBConnection;
import com.FoodPlaza21297.pojo.Customer;
import com.FoodPlaza21297.pojo.FeedBack;

public class FeedBackDaoImp implements FeedBackDao {

	Connection con=DBConnection.getConnection();
	
	public boolean insertFeedback(FeedBack f) {
		try
		{
		
			PreparedStatement ps=con.prepareStatement("insert into  FeedBack21297(cusName,cusEmail,message) values(?,?,?)");
			ps.setString(1, f.getCusName());
			ps.setString(2, f.getCusEmail());
			ps.setString(3, f.getMessage());
			
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

	@Override
	public List<FeedBack> selectAll() {
			List al=new ArrayList();
		
		try{
			
			PreparedStatement ps=con.prepareStatement("select * from FeedBack21297 ");
			
			ResultSet r=ps.executeQuery();
			while(r.next())
				
			{ 
				FeedBack f=new FeedBack();
				f.setFeedId(r.getInt("feedId"));
				f.setCusName(r.getString("cusName"));
				f.setCusEmail(r.getString("cusEmail"));
				f.setMessage(r.getString("message"));
				al.add(f);
			}
			
			return al;
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return null;
	}
	
	

}
