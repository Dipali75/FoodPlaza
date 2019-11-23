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
<div id="templatemo_menu">
<jsp:include page="Header.jsp"></jsp:include>
<form action="FoodServelet" method="post">
<input type="hidden" name="action" value="search">
<table cellpadding="6" cellspacing="6" border="3" align="center">

		<tr>
		<td>search food</td>
		<td><input type="text" name="searchfood">
		
		</td>
		</tr>
		<tr>
		
		<td><input type="submit" name="submit">
		
		</td>
		</tr>


</table>
</form>
<jsp:include page="Footer.jsp"></jsp:include>
</div>
</body>
</html>