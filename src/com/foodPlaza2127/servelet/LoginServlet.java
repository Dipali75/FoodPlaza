package com.foodPlaza2127.servelet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.FoodPlaza21297.dao.CustLoginDaoImp;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public LoginServlet() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession();
		session.invalidate();
		response.sendRedirect("Index.jsp");
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		HttpSession session=request.getSession();
	
		
		String type=request.getParameter("type");
		String action=request.getParameter("action");
		String userName=request.getParameter("userName");
		String Password=request.getParameter("userPsw");
		CustLoginDaoImp a=new CustLoginDaoImp();
		
		
		//System.out.println(action+"hiiii");
		
		
		
		if(action!=null && action.equals("login"))
		{
		
				if(type!=null && type.equals("Customer"))
				{
					boolean b=a.cusLogin(userName, Password);
					session.setAttribute("CusUserName", userName);
					if(b)
					{
						response.sendRedirect("Index.jsp");
					}else
					{
						response.sendRedirect("Error.jsp");
					}
					
				}
				
				if(type!=null && type.equals("Admin"))
				{
					boolean b=a.adminLogin(userName, Password);
					session.setAttribute("AdminUserName", userName);
					
					if(b)
					{
						response.sendRedirect("Index.jsp");
					}else
					{
						response.sendRedirect("Error.jsp");
					}
					
				}
		}
		else if(action!=null && action.equals("changepsw")) {
			
			
		
			
			String newpsw=request.getParameter("newUserPsw");
			String cnfPsw=request.getParameter("cnfUserPsw");
		
			if(type!=null && type.equals("Customer"))
			{
		
				boolean b=a.cusLogin(userName, Password);
				if(b)
				{
					System.out.println("check  new and conf "+newpsw+" "+cnfPsw);
					if(newpsw.equals(cnfPsw))
					{
						System.out.println("hiiii");
						boolean c=a.changeCusPsw(userName, newpsw);
						System.out.println(c);
						if(c)
						{
							System.out.println("update psw succsessfully");
						}
						
					}
					else
					{
						System.out.println("new psw and cnfirm psw not match");
					}
				}
				
				
			}
			else if(type!=null && type.equals("Admin"))
			{
				
				boolean b=a.adminLogin(userName, Password);
				if(b)
				{
					if(newpsw.equals(cnfPsw))
					{
						boolean c=a.changeAdminPsw(userName, newpsw);
						if(c)
						{
							System.out.println("update psw succsessfully");
						}
						
					}
					else
					{
						System.out.println("new psw and cnfirm psw not match");
					}
				}
				
				
			}
			
			
			
			
			
		}
		
	}

}
