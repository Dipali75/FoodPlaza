<%@page import="com.FoodPlaza21297.pojo.Customer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Update customer</title>
</head>
<body>
<div id="templatemo_container">

<jsp:include page="Header.jsp"></jsp:include>
<%Customer cus=(Customer)session.getAttribute("getById"); %>
<div>

<form action="CustomerServelet" method="post">
<div >
<table cellpadding="6" cellspacing="6" border="3" align="center">
<input type="hidden" name="action" value="updateCus">
<tr><td>Customer Id: <input type="text" name="CusId" value="<%=cus.getCusId()%>"></td></tr>
<tr><td>Customer Name: <input type="text" name="CusName" value="<%=cus.getCusName()%>"></td></tr>
<tr><td>Customer Address:	<input type="text" name="CusAddress" value="<%=cus.getCusAddr()%>"></td></tr>
<tr><td>Customer Contact:	<input type="text" name="CusContact" value="<%=cus.getCusContact()%>"></td></tr>
<tr><td>Customer Email: <input type="text" name="CusEmail" value="<%=cus.getCusEmail()%>"></td></tr>
<tr><td>Customer Password: <input type="password" name="custPass" value="<%=cus.getCuspsw()%>"></td></tr>
<tr><td><input type="submit" name="Update" value="Update" ></td></tr>



</table>
</div>
</form>
</div>



<jsp:include page="Footer.jsp"></jsp:include>
</div>
</body>
</html>