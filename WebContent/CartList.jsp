<%@page import="com.FoodPlaza21297.pojo.Cart"%>
<%@page import="com.FoodPlaza21297.dao.CartDaoImp"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="CartServlet" method="post">
<div id="templatemo_container">

<jsp:include page="Header.jsp"></jsp:include>
	<% List<Cart> clist=(List<Cart>)session.getAttribute("showCart");     %>
	
		<table cellpadding="6" cellspacing="6" border="3" align="center">
				<tr>
					<th>cart Id</th>
					<th>food name</th>
					<th>food price</th>
					<th>quantity</th>
					<th>Delete cart</th>
				</tr>
				<% for(int i=0;i<clist.size();i++)
					{								//open for
					Cart c=clist.get(i);	
				%>
				
				<tr>
					<td><%=c.getCartId() %> </td>
					<td><%=c.getFoodName() %> </td>
					<td><%=c.getFoodPrise() %> </td>
					<input type="hidden" name="foodPrise" value=<%=c.getFoodPrise() %> >
					<td> <input type="number"  value="1" name="quantity"></td>
					
					 
					<td> <a href="CartServlet?action=delete&CartId=<%=c.getCartId()%>">delete</a></td>
					
					
					
				</tr>
			
				<%
					} 	//close for
					%>
	<tr><td><input type="submit" name="submitOrder"></td></tr> 
	</table>
	


<jsp:include page="Footer.jsp"></jsp:include>
</div>

</form>
</body>
</html>