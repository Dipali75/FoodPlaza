package com.FoodPlaza21297.dbutility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	public static Connection getConnection()
	{
		Connection con=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/FoodPlaza21297","root","dipa516");
		}catch(Exception e)
		{
			
		}
		return con;
	}


}
