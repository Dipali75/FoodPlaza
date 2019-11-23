package com.foodPlaza2127.servelet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.FoodPlaza21297.dao.CartDaoImp;
import com.FoodPlaza21297.dao.OrderDaoImp;
import com.FoodPlaza21297.pojo.Cart;
import com.FoodPlaza21297.pojo.Customer;

/**
 * Servlet implementation class CartServlet
 */
@WebServlet("/CartServlet")
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public CartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	CartDaoImp c=new CartDaoImp();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession();//getssesion method of HttpServletRequest return type httpSessioon
		String action=request.getParameter("action");
		
		
		String cusEmail=(String)session.getAttribute("CusUserName");
		//System.out.println(action+" "+cusEmail+" Email and Action check");
		
		
		if(action!=null && action.equals("addToCart"))
		{
			int foodId=Integer.parseInt(request.getParameter("foodId"));
			
			boolean b=c.addCart(foodId, cusEmail);
			
			if(b)
			{
				session.setAttribute("CartMsg","Cart added succseefuly");
				RequestDispatcher r=request.getRequestDispatcher("Index.jsp");
				r.forward(request, response);
			}
			
		}else if(action!=null && action.equals("delete"))
		{
			//System.out.println("cart delete");
			int cartId=Integer.parseInt(request.getParameter("CartId"));
			boolean id=c.deleteCart(cartId);
			response.sendRedirect("CartServlet");
		}
		else
		{
			
			List<Cart> clist=c.selectAll(cusEmail);
			session.setAttribute("showCart", clist);
			System.out.println(clist);
			
			response.sendRedirect("CartList.jsp");
			
		}
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double totalBill=0;
		OrderDaoImp a=new OrderDaoImp();
		CartDaoImp c=new CartDaoImp();
		HttpSession session=request.getSession();
		
		String foodPrice[]=request.getParameterValues("foodPrise");
		String quanity[]=request.getParameterValues("quantity");
		
		String cusEmail=(String) session.getAttribute("CusUserName");
		
		
		
		for(int i=0;i<foodPrice.length;i++)
		{
			totalBill=totalBill+(Double.parseDouble(foodPrice[i]))*(Integer.parseInt(quanity[i]));
			
		}
		
		
		System.out.println(totalBill);
		
		boolean b=a.placeorder1(cusEmail,totalBill);
		if(b)
		{
			boolean cl=c.clearCart(cusEmail);
			if(cl)
			{
			session.setAttribute("placeOrder","Place Order Success fully "+totalBill );
			RequestDispatcher rd= request.getRequestDispatcher("Index.jsp");
			rd.forward(request, response);
			}
		}
		
		
	}

}
