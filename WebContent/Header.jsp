<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<% String userName=(String)session.getAttribute("CusUserName");
		String adminName=(String)session.getAttribute("AdminUserName");
	  %>
<div id="templatemo_container">
	<div id="templatemo_header">
    	<div id="site_title"></div>
    </div> <!-- end of header -->
    
    <div id="templatemo_menu">
        <ul>
        	<li class="current"><a href="Index.jsp"><b>Home</b></a></li>
            <li><a href="FoodServelet"><b>Food menu</b></a></li>
            <li><a href="Search.jsp"><b>Search</b></a></li>
            <%if(userName==null && adminName==null)
            	{
            	%>
            <li><a href="Customer.jsp"><b>Register</b></a></li>
            <li><a href="Login.jsp"><b>Login</b></a></li>
            <li ><a href="Contact.jsp"><b>Contact Us</b></a></li>
            <%} %>
            
            
            <%if(adminName!=null){ %>
            <li ><a href="CustomerServelet"><b>Show Customer</b></a></li>
            <li ><a href="AddFood.jsp"><b>Add Food</b></a></li>
            <li ><a href="OrderServelet"><b>Order</b></a></li>
            <li ><a href="FeedBackServelet"><b>Show Feedback</b></a></li>
            <%} %>
            
            
            
            <% if(userName!=null){ %>
            <li ><a href="CustomerServelet?action=EditProfile&userName=<%=userName%>"><b>Edit Profile</b></a></li>
            <li ><a href="CartServelet"><b>Show Cart</b></a></li>
            <li ><a href="FeedBack.jsp"><b>FeedBack</b></a></li>
            <li ><a href="#"><b>Show Order</b></a></li> 
            <%} %>
            
               
              <%if(userName!=null || adminName!=null) {%>
               
            <li ><a href="LoginServlet"><b>Log Out</b></a></li>
              <%} %>
        </ul>
    </div>
</body>
</html>