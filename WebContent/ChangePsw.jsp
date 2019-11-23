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
<div id="templatemo_container">
<jsp:include page="Header.jsp"></jsp:include>
<form action="LoginServlet" method="post" >
<input type="hidden" name="action" value="changepsw">
<table cellpadding="6" cellspacing="6" border="3" align="center">

	<tr>
		<td>User Type:</td>
		<td><select name="type">
			<option value="Select" >Select</option>
			<option value="Admin">Admin</option>
			<option value="Customer" >Customer</option>
			</select>  
		</td>
	</tr>
	
	<tr>
		<td>User Name:</td>
		<td>
			<input type="text" name="userName">
		
		</td>
	
	
	<tr>
		<td>old password:</td>
		<td>
			<input type="password" name="userPsw">
		
		</td>
	</tr>
	<tr>
		<td>new password:</td>
		<td>
			<input type="password" name="newUserPsw">
		
		</td>
	</tr>
	<tr>
		<td>confirm password:</td>
		<td>
			<input type="password" name="cnfUserPsw">
		
		</td>
	</tr>
	<tr>
		
		<td>
			<input type="submit" name="changePsw" value="changePsw">
		
		</td>
	</tr>



</table>
</form>

<jsp:include page="Footer.jsp"></jsp:include>

</div>
</body>
</html>