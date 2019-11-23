<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
<title>AddFood</title>
<script type="text/javascript">
function valid()
{
	
	
	var fName=document.getElementById("fName").value;
	var fPrice=document.getElementById("fPrice").value;
	var fCategory=document.getElementById("fCatogory").value;
	
	 if(fName=="")
		{
			document.getElementById("fnError").innerHTML="enter food name";
			return false;
		}
	if(!isNaN(fName))
	{
		document.getElementById("fnError").innerHTML="enter food name in charcter";
		return false;
	} 
 
	if(fPrice=="")
		{
			document.getElementById("fpError").innerHTML="enter food price";
			return false;
		}
	if(isNaN(fPrice))
	{
		document.getElementById("fpError").innerHTML="enter food price in number";
		return false;
	}
	
	 if(fCategory=="")
		{
			document.getElementById("fcError").innerHTML="enter food catogory";
			return false;
		}
	if(!isNaN(fCategory))
	{
		document.getElementById("fcError").innerHTML="enter food catogory in charcter";
		return false;
	}
	
	
	return false;
}

</script>
</head>
<body >
<div id="templatemo_container">

<jsp:include page="Header.jsp"></jsp:include>
	<div>
	<form action="FoodServelet" method="post" >
			<div >
				<table cellpadding="6" cellspacing="6" border="1" align="center" >	
				<input type="hidden" name="action" value="addFood">
					<tr><td>Food Name: <input type="text" name="FoodName" id="fName"><span id="fnError" style="color: red"></span></td></tr>
					<tr><td>Food Price:	<input type="text" name="FoodPrice"  id="fPrice"><span id="fpError" style="color: red"></span></td></tr>
					<tr><td>Food Category: <input type="text" name="FoodCategory"  id="fCatogory"><span id="fcError" style="color: red"></span></td></tr>
					<tr><td><input type="submit"  value="Submit" ><input type="reset" name="Reset" value="Reset"></td></tr>
				</table>
			</div>
		</form>
	</div>
	<jsp:include page="Footer.jsp"></jsp:include>
	</div>
</body>
</html>