package com.foodPlaza2127.servelet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.FoodPlaza21297.dao.FeedBackDaoImp;
import com.FoodPlaza21297.pojo.FeedBack;
import com.FoodPlaza21297.pojo.Food;

/**
 * Servlet implementation class FeedbackServlet
 */
@WebServlet("/FeedbackServlet")
public class FeedbackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public FeedbackServlet() {
        super();
       
    }
	FeedBack f=new FeedBack();
	FeedBackDaoImp fd=new FeedBackDaoImp();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession();
		List<FeedBack> flist=fd.selectAll();
		session.setAttribute("showfeedback", flist);
		response.sendRedirect("FeedBackList.jsp");
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String cusName=request.getParameter("cusName");
		String cusEmail=request.getParameter("cusEmail");
		String message=request.getParameter("message");
		
		
		FeedBack f=new FeedBack();
		f.setCusName(cusName);
		f.setCusEmail(cusEmail);
		f.setMessage(message);
		
		boolean a=fd.insertFeedback(f);
		if(a)
		{
			response.sendRedirect("sucsess.jsp");
		}
		else {
			response.sendRedirect("Error.jsp");
		}
		
		
		
	}

}
