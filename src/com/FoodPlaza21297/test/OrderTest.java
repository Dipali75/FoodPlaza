package com.FoodPlaza21297.test;

import java.util.List;
import java.util.Scanner;

import com.FoodPlaza21297.dao.OrderDaoImp;
import com.FoodPlaza21297.pojo.Food;
import com.FoodPlaza21297.pojo.Order;

public class OrderTest {
	public static void main(String[] args) {
		int orderId;
		String oStatus;
		double totalBill;
		String cusEmail;
		int ch;
		Order o=new Order();
		OrderDaoImp oimp=new OrderDaoImp();
		Scanner sc=new Scanner(System.in);
	
		
		
		do{
			
			System.out.println("1 insertBill");
			System.out.println("2 displaybill");
			
			ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.println("enter cusEmail");
				cusEmail=sc.next();
				o.setCusEmail(cusEmail);
				boolean a=oimp.placeOrder(cusEmail);
				if(a)
				{
					System.out.println("happy");
				}
				else
				{
					System.out.println("sad");
				}
				
			break;
			case 2:
				List<Order> b=oimp.selectAll();
				
				for(Order r:b)
				{
					System.out.println(r);
				}
			
			
			default:System.out.println("check value inserted");
			
			}
			
			
			
		}while(ch!=3);
		
		
		
	}

}
