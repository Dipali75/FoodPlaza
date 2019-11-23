package com.FoodPlaza21297.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.FoodPlaza21297.dbutility.DBConnection;
import com.FoodPlaza21297.pojo.Customer;


public class CustomerDaoImp implements CustomerDao{

	Connection con=DBConnection.getConnection();


	public boolean addCustomer(Customer cust) {
		try
		{
		
			PreparedStatement ps=con.prepareStatement("insert into  customer21297(cusName,cusAddr,cusEmail,cusContact,cusPsw) values(?,?,?,?,?)");
			ps.setString(1, cust.getCusName());
			ps.setString(2, cust.getCusAddr());
			ps.setString(3, cust.getCusEmail());
			ps.setString(4, cust.getCusContact());
			ps.setString(5, cust.getCuspsw());
			
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

	
	public boolean updateCustomer(Customer cust) {
		try
		{
			PreparedStatement ps=con.prepareStatement("update  customer21297 set cusName=?,cusAddr=?,cusEmail=?,cusContact=?,cusPsw=?where cusId=?");
			ps.setString(1, cust.getCusName());
			ps.setString(2, cust.getCusAddr());
			ps.setString(3, cust.getCusEmail());
			ps.setString(4, cust.getCusContact());
			ps.setString(5, cust.getCuspsw());
			ps.setInt(6, cust.getCusId());
		System.out.println(cust+"hello cust");
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

	
	public boolean deleteCustomer(int cusId) {
		try
		{
		PreparedStatement ps=con.prepareStatement("delete from customer21297  where cusId=? ");
		ps.setInt(1, cusId);
		
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


	public Customer selectById1(int cusId) {
		Customer f=new Customer();
		try{
			PreparedStatement ps=con.prepareStatement("select * from customer21297 where cusId=?");
			ps.setInt(1, cusId);
			ResultSet r=ps.executeQuery();
			while(r.next())
			{
				f.setCusId(r.getInt("cusId"));
				f.setCusName(r.getString("cusName"));
				f.setCusAddr(r.getString("cusAddr"));
				f.setCusEmail(r.getString("cusEmail"));
				f.setCusContact(r.getString("cusContact"));
				f.setCuspsw(r.getString("cusPsw"));
			}
			
			return f;
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		return null;
	}

	public List<Customer> selectAll() {
		List al=new ArrayList();
		
		try{
			PreparedStatement ps=con.prepareStatement("select * from customer21297 ");
			
			ResultSet r=ps.executeQuery();
			while(r.next())
				
			{ 
			Customer f=new Customer();
			f.setCusId(r.getInt("cusId"));
			f.setCusName(r.getString("cusName"));
			f.setCusAddr(r.getString("cusAddr"));
			f.setCusEmail(r.getString("cusEmail"));
			f.setCusContact(r.getString("cusContact"));
			f.setCuspsw(r.getString("cusPsw"));
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
	public Customer selectByEmail(String cusEmail) {
	
		
		Customer f=new Customer();
		try{
			PreparedStatement ps=con.prepareStatement("select * from customer21297 where cusEmail=?");
			ps.setString(1, cusEmail);
			ResultSet r=ps.executeQuery();
			while(r.next())
			{
				f.setCusId(r.getInt("cusId"));
				f.setCusName(r.getString("cusName"));
				f.setCusAddr(r.getString("cusAddr"));
				f.setCusEmail(r.getString("cusEmail"));
				f.setCusContact(r.getString("cusContact"));
				f.setCuspsw(r.getString("cusPsw"));
			}
			System.out.println(f);
			return f;
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return null;
	}

	

}
