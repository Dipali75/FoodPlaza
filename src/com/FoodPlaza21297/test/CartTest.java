package com.FoodPlaza21297.test;


import java.util.List;
import java.util.Scanner;

import com.FoodPlaza21297.dao.CartDaoImp;
import com.FoodPlaza21297.pojo.Cart;
import com.FoodPlaza21297.pojo.Customer;



public class CartTest {
	public static void main(String[] args) {
		int cartId;
		int foodId;
		String cusEmail;
		int quantity;
		double foodPrise;
		int choice;
		
		Cart f=new Cart();
		CartDaoImp ccdao=new CartDaoImp();
		Scanner sc=new Scanner(System.in);
		System.out.println("1 insert");
		
		System.out.println("2 delete");
		
		System.out.println("3 display all");
		System.out.println("enter your choice");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1: System.out.println("eneter foodId,quantity,cusEmail");
				foodId=sc.nextInt();
				//quantity=sc.nextInt();
				cusEmail=sc.next();
				
				
				

				boolean b=ccdao.addCart(foodId,cusEmail);
				if(b)
				{
				System.out.println("succsses");
				}
				else
				{
					System.out.println("not success");
				}
			break;	
		case 2:
			System.out.println("enter cart id for delete");
			cartId=sc.nextInt();
			boolean b1=ccdao.deleteCart(cartId);
			if(b1)
			{
			System.out.println("succsses");
			}
			else
			{
				System.out.println("not success");
			}
			
			break;
		case 3:
				System.out.println("enter customer email Id");
				cusEmail=sc.next();
				
				List<Cart> a=ccdao.selectAll(cusEmail);
				
				for(Cart r:a)
				{
					System.out.println(r);
				}
				
		break;		
				
		default:System.out.println("check value");
		}
		
	}
	

	
}
