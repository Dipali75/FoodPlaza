<%@page import="com.FoodPlaza21297.pojo.Customer"%>
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
	<% List<Customer> clist=(List<Customer>)session.getAttribute("show");     %>
	
		<table cellpadding="6" cellspacing="6" border="3" align="center">
				<tr>
					<th>Customer Id</th>
					<th> customer name</th>
					<th> customer Address</th>
					<th> customer Email</th>
					<th> customer contact</th>
					<th> customer password</th>
					<th> Edit</th>
					<th> Delete</th>
				</tr>
				<% for(int i=0;i<clist.size();i++)
					{								//open for
					Customer c=clist.get(i);	
				%>
				
				<tr>
					<td><%=c.getCusId() %> </td>
					<td><%=c.getCusName() %> </td>
					<td><%=c.getCusAddr() %> </td>
					<td><%=c.getCusEmail() %> </td>
					<td><%=c.getCusContact() %> </td>
					<td><%=c.getCuspsw() %> </td>
					<td> <a href="CustomerServelet?action=Edit&CusId=<%=c.getCusId()%>"> Edit</a></td>
					<td> <a href="CustomerServelet?action=Delete&CusId=<%=c.getCusId()%>"> delete</a></td>
					<%
					} 								//close for
					%>
				</tr>
			
		
	
	</table>
	


<jsp:include page="Footer.jsp"></jsp:include>
</div>
</body>
</html>