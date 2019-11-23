package com.FoodPlaza21297.test;

import java.util.List;
import java.util.Scanner;

import com.FoodPlaza21297.dao.CustomerDaoImp;
import com.FoodPlaza21297.pojo.Customer;



public class CustomerTest {
	public static void main(String[] args) {
		int cusId;
		String cusName;
		String cusAddr;
		String cusEmail;
		String cusContact;
		String cuspsw;
		
		int choice;
		
		 
		Customer f=new Customer();
		CustomerDaoImp cdao=new CustomerDaoImp();
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
		case 1: System.out.println("enter cusName,cusAddr,cusEmail,cusContact,cuspsw");
				
				cusName=sc.next();
				cusAddr=sc.next();
				cusEmail=sc.next();
				cusContact=sc.next();
				cuspsw=sc.next();
				
			f.setCusName(cusName);
			f.setCusAddr(cusAddr);
			f.setCusEmail(cusEmail);
			f.setCusContact(cusContact);
			f.setCuspsw(cuspsw);
				
				boolean b=cdao.addCustomer(f);
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
			System.out.println("enter customerId for update");
			cusId=sc.nextInt();
			f.setCusId(cusId);
			System.out.println("enter cusName,cusAddr,cusEmail,cusContact,cuspsw");
			
			cusName=sc.next();
			cusAddr=sc.next();
			cusEmail=sc.next();
			cusContact=sc.next();
			cuspsw=sc.next();
			
		f.setCusName(cusName);
		f.setCusAddr(cusAddr);
		f.setCusEmail(cusEmail);
		f.setCusContact(cusContact);
		f.setCuspsw(cuspsw);
			
			boolean bd=cdao.updateCustomer(f);
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
			System.out.println("enter customerId for delete");
			cusId=sc.nextInt();
			boolean b1=cdao.deleteCustomer(cusId);
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
			System.out.println("enter customerid for display");
			cusId=sc.nextInt();
			
			Customer r1=cdao.selectById1(cusId);
			System.out.println(r1);
			
		break;	
		
		case 5:
			List<Customer> a=cdao.selectAll();
		
			for(Customer r:a)
			{
				System.out.println(r);
			}


		break;
		
		
		default:System.out.println("check value");
			}
		
	}

}
