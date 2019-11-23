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
<jsp:include page="Header.jsp"></jsp:include>
	<form action="FeedbackServlet" method="post">
		<table cellpadding="6" cellspacing="6" border="1" align="center">
		<tr><td>Enter Customer Name</td><td> <input type="text" name="cusName"></td></tr>
		<tr><td>Enter Customer Email</td><td> <input type="text" name="cusEmail"></td></tr>
		<tr> <td>Feedback Message:</td><td><textarea rows="5" cols="20" name="message"></textarea></td>   </tr>
		<tr><td> <input type="submit" name="fsubmit" value="submit"></td></tr>
		
		</table>
	</form>
<jsp:include page="Footer.jsp"></jsp:include>	
</body>
</html>