<%@page import="com.FoodPlaza21297.pojo.FeedBack"%>
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
<div id="templatemo_container">

<jsp:include page="Header.jsp"></jsp:include>

<% List<FeedBack> flist=(List<FeedBack>)session.getAttribute("showfeedback"); %>
<table cellpadding="6" cellspacing="6" border="3" align="center">
	<tr>
		<th>customer Id</th>
		<th>customer Name</th>
		<th>customer Email</th>
		<th>feedback</th>
	</tr>
	
	
<% for(int i=0;i<flist.size();i++)
	{
	FeedBack f=flist.get(i);	
	

%>

<tr>
	<td><%=f.getFeedId()%> </td>
	<td><%=f.getCusName() %> </td>
	<td><%= f.getCusEmail()%> </td>
	<td><%=f.getMessage() %> </td>
	
	
	
	
	
<%} %>
</tr>



</table>
<jsp:include page="Footer.jsp"></jsp:include>
</div>


</body>
</html>