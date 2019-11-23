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

import com.FoodPlaza21297.dao.CustomerDaoImp;
import com.FoodPlaza21297.pojo.Customer;
import com.FoodPlaza21297.pojo.Food;

/**
 * Servlet implementation class CustomerServelet
 */
@WebServlet("/CustomerServelet")
public class CustomerServelet extends HttpServlet {
	
	Customer c=new Customer();
	CustomerDaoImp cimp=new CustomerDaoImp();
	private static final long serialVersionUID = 1L;
       
  
    public CustomerServelet() {
        super();
        
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
		HttpSession session=request.getSession();//getssesion method of HttpServletRequest return type httpSessioon
		String action=request.getParameter("action");
		System.out.println(action+" action is");
		if(action!=null && action.equals("Edit"))
		{
			int cusId=Integer.parseInt(request.getParameter("CusId"));
		
			Customer getById=cimp.selectById1(cusId);
			session.setAttribute("getById", getById);
			response.sendRedirect("UpdateCustomer.jsp");
			
		}else if(action!=null && action.equals("Delete"))
		{
			int cusId=Integer.parseInt(request.getParameter("CusId"));
			boolean id=cimp.deleteCustomer(cusId);
			
			response.sendRedirect("CustomerServelet");
			
		}else if(action!=null && action.equals("EditProfile"))
		{
			//.out.println("innside action"+action);
			String cusEmail=request.getParameter("userName");
			Customer c=cimp.selectByEmail(cusEmail);
			System.out.println(cusEmail+"          "+c);
			session.setAttribute("getById", c);
			response.sendRedirect("UpdateCustomer.jsp");
			
		}
		else
		{
		List<Customer> clist=cimp.selectAll();
		session.setAttribute("show", clist);
		response.sendRedirect("CustomerList.jsp");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession();//getssesion method of HttpServletRequest return type httpSessioon

		String cname=request.getParameter("CusName");
		
		String cContact=request.getParameter("CusContact");
		
		String cddress=request.getParameter("CusAddress");
	
		String CusEmail=request.getParameter("CusEmail");
	
		String password=request.getParameter("custPass");
	
		String action=request.getParameter("action");
		System.out.println(action);
		
		if(action!=null && action.equals("addCus"))
		{
			System.out.println(action+" "+"abcd");
			c.setCusName(cname);
			c.setCusContact(cContact);
			c.setCusAddr(cddress);
			c.setCusEmail(CusEmail);
			c.setCuspsw(password);
		boolean b=cimp.addCustomer(c);
		if(b)
		{
			session.setAttribute("CusMsg","succseefuly");
			RequestDispatcher r=request.getRequestDispatcher("Index.jsp");
			r.forward(request, response);
		}else
		{
			response.sendRedirect("Error.jsp");
		}
		}
		else if(action!=null && action.equals("updateCus"))
		{
			
			
			System.out.println(action+" action check");
			int cusId=Integer.parseInt(request.getParameter("CusId"));
			c.setCusId(cusId);
			c.setCusName(cname);
			c.setCusContact(cContact);
			c.setCusAddr(cddress);
			c.setCusEmail(CusEmail);
			c.setCuspsw(password);
		System.out.println(c);
			boolean b=cimp.updateCustomer(c);
			if(b)
			{
				response.sendRedirect("CustomerServelet");//after update the page will redirect.
			}else
			{
				response.sendRedirect("Error.jsp");
			}
			
		}
		
			
			
			
		}
		
	}

