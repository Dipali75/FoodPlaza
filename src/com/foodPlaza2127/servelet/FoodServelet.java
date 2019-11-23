package com.foodPlaza2127.servelet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.FoodPlaza21297.dao.FoodDaoImp;
import com.FoodPlaza21297.pojo.Food;


@WebServlet("/FoodServelet")
public class FoodServelet extends HttpServlet {
	Food f=new Food();
	FoodDaoImp fimp=new FoodDaoImp();
	private static final long serialVersionUID = 1L;
  
    public FoodServelet() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		HttpSession session=request.getSession();//getssesion method of HttpServletRequest return type httpSessioon
		String action=request.getParameter("action");
		
		if(action!=null && action.equals("Edit"))
		{
			int a=Integer.parseInt(request.getParameter("foodId"));
			Food getById=fimp.selectById(a);
			session.setAttribute("getById", getById);
			response.sendRedirect("UpdateFood.jsp");
			
		}else if(action!=null && action.equals("Delete"))
		{
			int foodId=Integer.parseInt(request.getParameter("foodId"));
			boolean b=fimp.deleteFood(foodId);
			
			response.sendRedirect("FoodServelet");
			
		}
		else
		{
			List<Food> flist=fimp.selectAll();
			session.setAttribute("show", flist);
			response.sendRedirect("FoodList.jsp");
		}
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
		String action=request.getParameter("action");
		HttpSession session=request.getSession();
		System.out.println("action"+action);

		if(action!=null && action.equals("addFood"))
		{
			String fname=request.getParameter("FoodName");
			
			Double fPrice=Double.parseDouble(request.getParameter("FoodPrice"));
			
			String fcategory=request.getParameter("FoodCategory");
		
		f.setFoodCatagory(fcategory);
		f.setFoodName(fname);
		f.setFoodPrise(fPrice);
		boolean b=fimp.addFood(f);
		if(b)
		{
			response.sendRedirect("sucsess.jsp");
		}else
		{
			response.sendRedirect("Error.jsp");
		}
		}
		else if(action!=null && action.equals("updateFood")){
			
			String fname=request.getParameter("FoodName");
			
			Double fPrice=Double.parseDouble(request.getParameter("FoodPrice"));
			
			String fcategory=request.getParameter("FoodCategory");
			System.out.println(action+" action check");
			int foodId=Integer.parseInt(request.getParameter("FoodId"));
			f.setFoodId(foodId);
			f.setFoodCatagory(fcategory);
			f.setFoodName(fname);
			f.setFoodPrise(fPrice);
			boolean b=fimp.updateFood(f);
			if(b)
			{
				response.sendRedirect("sucsess.jsp");
			}else
			{
				response.sendRedirect("Error.jsp");
			}
		}
		else if(action!=null && action.equals("search"))
		{
			String foodName=request.getParameter("searchfood");
			List l=fimp.searchFood(foodName);
			session.setAttribute("show", l);
			response.sendRedirect("FoodList.jsp");
		}
		
		
	}

	

}
