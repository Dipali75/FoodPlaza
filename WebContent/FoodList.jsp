

<%@page import="com.FoodPlaza21297.pojo.Food"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
<% String userName=(String)session.getAttribute("CusUserName");
		String adminName=(String)session.getAttribute("AdminUserName");
	  %>
	  <% List<Food> flist=(List<Food>)session.getAttribute("show");     %>
<div id="templatemo_container">

<jsp:include page="Header.jsp"></jsp:include>


<table cellpadding="6" cellspacing="6" border="3" align="center">
	<tr>
		
		<th>Food Id</th>
		<th>foodName</th>
		<th>foodPrise</th>
		<th>foodCatagory</th>
		<%if(adminName!=null) {%>
	
			<th>Edit</th>
			<th>delete</th>
		
			<%} %>
			
			
		
		<%if(userName!=null) {%>	
			<th>add to cart</th>
		<%} %>
		
	</tr>
	
	
<% for(int i=0;i<flist.size();i++)
	{
	Food f=flist.get(i);	
	

%>

<tr>
	<td><%=f.getFoodId() %> </td>

	<td><%=f.getFoodName() %> </td>
	<td><%=f.getFoodPrise() %> </td>
	<td><%=f.getFoodCatagory()%> </td>
	<%if(adminName!=null) {%>
		<td> <a href="FoodServelet?action=Edit&foodId=<%=f.getFoodId() %>"> Edit</a></td>
		<td> <a href="FoodServelet?action=Delete&foodId=<%=f.getFoodId() %>"> Delete</a></td>
	<%} %>
	
	<%if(userName!=null) {%>
		<td> <a href="CartServlet?action=addToCart&foodId=<%=f.getFoodId() %>"> add to cart</a></td>
	<%} %>
	
	
	
<%} %>
</tr>foodId 





</table>
<jsp:include page="Footer.jsp"></jsp:include>
</div>
</body>
</html>