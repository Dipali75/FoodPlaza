package com.FoodPlaza21297.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



import com.FoodPlaza21297.dao.FoodDaoImp;
import com.FoodPlaza21297.pojo.Food;



public class FoodTest {
	public static void main(String[] args) {
		int foodId;
		String foodName;
		double foodPrise;
		String foodCatagory;
		
		
		int choice;
		
		 
		Food f=new Food();
		FoodDaoImp fdao=new FoodDaoImp();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1 insert");
		System.out.println("2 update");
		System.out.println("3 delete");
		System.out.println("4 display id");
		System.out.println("5 display all");
		System.out.println("enter your choice");
		choice=sc.nextInt();
		
		switch(choice)
		{
		case 1: System.out.println("enter foodname,foodPrise,foodCatogory");
				
				foodName=sc.next();
				foodPrise=sc.nextDouble();
				foodCatagory=sc.next();
				
				
				f.setFoodName(foodName);
				f.setFoodPrise(foodPrise);
				f.setFoodCatagory(foodCatagory);
				
				boolean b=fdao.addFood(f);
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
			System.out.println("enter foodId for update");
			foodId=sc.nextInt();
			System.out.println("Enter foodname,foodPrise,foodCatogory");
			foodName=sc.next();
			foodPrise=sc.nextDouble();
			foodCatagory=sc.next();
			
			f.setFoodId(foodId);
			f.setFoodName(foodName);
			f.setFoodPrise(foodPrise);
			f.setFoodCatagory(foodCatagory);
			
			
			boolean bd=fdao.updateFood(f);
			if(bd)
			{
			System.out.println("succsses");
			}
			else
			{
				System.out.println("not success");
			}
			
			break;
			
		case 3:
			System.out.println("enter foodId for delete");
			foodId=sc.nextInt();
			boolean b1=fdao.deleteFood(foodId);
			if(b1)
			{
			System.out.println("succsses");
			}
			else
			{
				System.out.println("not success");
			}
			
			break;
			
		case 4:
			System.out.println("enter Foodid for display");
			foodId=sc.nextInt();
			
			Food r1=fdao.selectById(foodId);
			System.out.println(r1);
			
		break;	
		
		case 5:
			List<Food> a=fdao.selectAll();
		
			for(Food r:a)
			{
				System.out.println(r);
			}


		break;
		
		
		default:System.out.println("check value");
			}
		
	}

}
