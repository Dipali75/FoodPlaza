<%@page import="com.FoodPlaza21297.pojo.Food"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
<title>update Food</title>
</head>
<body>
<div id="templatemo_container">u

<jsp:include page="Header.jsp"></jsp:include>
<%Food food=(Food)session.getAttribute("updateFood");%>
<div>

<form action="FoodServelet" method="post">
<div >
<table cellpadding="6" cellspacing="6" border="3" align="center">
<input type="hidden" name="action" value="updateFood">
<tr><td>Food Id: <input type="text" name="FoodId" value="<%=food.getFoodId() %>"></td></tr>
<tr><td>Food Name: <input type="text" name="FoodName" value="<%=food.getFoodName()%>"></td></tr>
<tr><td>Food Price:	<input type="text" name="FoodPrice" value="<%=food.getFoodPrise()%>"></td></tr>
<tr><td>Food Category: <input type="text" name="FoodCategory" value="<%=food.getFoodCatagory()%>"></td></tr>
<tr><td><input type="submit" name="update" value="Update" ></td></tr>



</table>
</div>
</form>
</div>
</div>
<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>