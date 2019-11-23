package com.FoodPlaza21297.dao;

import com.FoodPlaza21297.dbutility.DBConnection;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class CustLoginDaoImp implements CustLoginDao {
	
	
	Connection con=DBConnection.getConnection();

	@Override
	public boolean cusLogin(String cusEmail, String cusPsw) {
		
		try{
			
			PreparedStatement ps= con.prepareStatement("select cusEmail,cusPsw from customer21297 where cusEmail=? and cusPsw=?");
			ps.setString(1, cusEmail);
			ps.setString(2, cusPsw);
			
			ResultSet a=ps.executeQuery();
			System.out.println("helloooooo");
			while(a.next())
			{
				System.out.println("check login");
				return true;
			}
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		return false;
	}

	public boolean adminLogin(String adminName,String adminPsw){
		
try{
			
			PreparedStatement ps= con.prepareStatement("select adminName,adminPsw from admin21297 where adminName=? and adminPsw=?");
			ps.setString(1, adminName);
			ps.setString(2, adminPsw);
			
			ResultSet a=ps.executeQuery();
			while(a.next())
			{
				return true;
			}
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean changeCusPsw(String cusEmail, String ncusPsw) {
		
		try
		{
			PreparedStatement ps= con.prepareStatement("update customer21297 set cusPsw=? where cusEmail=?");
			ps.setString(1, ncusPsw);
			ps.setString(2, cusEmail);

			int i=ps.executeUpdate();
			if(i>0)
			{
				return true;
			}
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		return false;
	}

	@Override
	public boolean changeAdminPsw(String adminName, String adminPsw) {
		
		try
		{
			PreparedStatement ps= con.prepareStatement("update admin21297 set adminPsw=? where adminName=?");
			ps.setString(1, adminPsw);
			ps.setString(2, adminName);
			
			int i=ps.executeUpdate();
			if(i>0)
			{
				return true;
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		return false;
	}

	
}




