package com.FoodPlaza21297.dao;

public interface CustLoginDao {

	boolean cusLogin(String cusEmail,String cusPsw);
	boolean adminLogin(String adminName,String adminPsw);
	boolean changeCusPsw(String cusEmail,String ncusPsw);
	boolean changeAdminPsw(String adminName,String nadminPsw);
	
}
