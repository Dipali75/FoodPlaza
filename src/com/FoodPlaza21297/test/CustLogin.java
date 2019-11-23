package com.FoodPlaza21297.test;

import java.util.Scanner;

import com.FoodPlaza21297.dao.CustLoginDaoImp;
import com.FoodPlaza21297.pojo.Customer;

public class CustLogin {
	public static void main(String[] args) {
		
		String cusEmail;
		String cusPsw;
		String adName;
		String adpsw;
		Scanner sc=new Scanner(System.in);
		
		Customer c=new Customer();
		CustLoginDaoImp cl=new CustLoginDaoImp();
		System.out.println("availbale option");
		System.out.println("1 customer login");
		System.out.println("2 admin login");
		System.out.println("3 change customer password");
		System.out.println("4 change admin password");
		
		
			System.out.println("Enter choice");
			int choice=sc.nextInt();
		switch (choice) {
		case 1:
			
			System.out.println("enter customer your email id");
			cusEmail=sc.next();
			System.out.println("enter your password");
			cusPsw=sc.next();
			boolean b=cl.cusLogin(cusEmail, cusPsw);
			if(b){
				System.out.println("Login Successfull");
			}else {
				System.out.println("Error in Login");
			}
			break;

		case 2:
			System.out.println("enter Admin your UserName");
			adName=sc.next();
			System.out.println("enter your password");
			adpsw=sc.next();
			boolean b1=cl.adminLogin(adName, adpsw);
			if(b1){
				System.out.println("Login Successfull");
			}else {
				System.out.println("Error in Login");
			}
			break;
			
		case 3:	
			System.out.println("enter customer your new email id");
			cusEmail=sc.next();
			System.out.println("enter your new password");
			cusPsw=sc.next();
			boolean a=cl.changeCusPsw(cusEmail, cusPsw);
			if(a){
				System.out.println("Login Successfull");
			}else {
				System.out.println("Error in Login");
			}
			break;
		case 4:
			System.out.println("enter Admin your new UserName");
			adName=sc.next();
			System.out.println("enter your new password");
			adpsw=sc.next();
			boolean e=cl.changeCusPsw(adName, adpsw);
			if(e){
				System.out.println("Login Successfull");
			}else {
				System.out.println("Error in Login");
			}
			break;
			
		default:
			break;
		}
		
		
		
		
		
		
		
		
	}
	

}
