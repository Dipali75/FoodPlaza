<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div id="templatemo_container">
<jsp:include page="Header.jsp"></jsp:include>
<form>

	<table align="center" border="1" cellpadding="6" cellspacing="6">
		<tr><td style="color: green;"> food added successfully </td></tr>
		<tr><td><a href="FoodServelet"></a>FoodList</td><td><a href="AddFood.jsp"></a>Add Food </td></tr>
		

	</table>
</form>
<jsp:include page="Footer.jsp"></jsp:include>

	</div>


</body>

</html>