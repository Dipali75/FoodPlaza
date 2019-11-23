<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> customer</title>
</head>
	<script type="text/javascript">
	function valid() {

		var cusName=document.getElementById("cName").value;
		var cusCont=document.getElementById("cContact").value;
		var cusAddr=document.getElementById("cAddress").value;
		var cusEmail=document.getElementById("cEmail").value;
		var cusPsw=document.getElementById("cpsw").value;
		
		if(cusName=="")
			{
			document.getElementById("cnError").innerHTML="enter customer Name";
			return false;
			}
		if(!isNaN(cusName))
			{
			document.getElementById("cnError").innerHTML="enter customer Name in Character";
			return false;
			}
		if(cusAddr=="")
			{
			document.getElementById("caError").innerHTML="enter customer Address";
			return false;
			}
		if(!isNaN(cusAddr))
			{
			document.getElementById("caEr ror").innerHTML="enter customer Address in Character";
			return false;
			}
		
		if(cusCont=="")
			{
			document.getElementById("ccError").innerHTML="enter customer contact";
			return false;
			}
		if(isNaN(cusCont))
			{
			document.getElementById("ccError").innerHTML="enter customer contact in value";
			return false;
			}
		if(cusCont.length<=9)	
			{
			document.getElementById("ccError").innerHTML="enter customer contact in 10 digit";
			return false;
			}
		
		
		if(isNaN(cusCont))
			{
			document.getElementById("ccError").innerHTML="enter customer contact in value";
			return false;
			}
		if(cusCont.length<=9)	
			{
			document.getElementById("ccError").innerHTML="enter customer contact in 10 digit";
			return false;
			}
		if(cusEmail=="")
			{
			document.getElementById("ceError").innerHTML="enter customer Email";
			return false;
			}
		
		if(cusPsw=="")
			{
			document.getElementById("cpError").innerHTML="enter customer password ";
			return false;
		}

		
		
		
		return false;
	}
	
	
	
	
	
	
	</script>	

<body>
<div id="templatemo_container">

<jsp:include page="Header.jsp"></jsp:include>

	<div>
	
		<form action="CustomerServelet" method="post">
			<div >
				<table cellpadding="6" cellspacing="6" border="3" align="center">
						<input type="hidden" name="action" value="addCus">
					<tr><td>Customer Name: <input type="text" name="CusName" id="cName"><span id="cnError" style="color: red"></span></td></tr>
					<tr><td>Customer Contact:	<input type="text" name="CusContact" id="cContact"><span id="ccError" style="color: red"></span></td></tr>
					<tr><td>Customer Address:	<input type="text" name="CusAddress" id="cAddress"><span id="caError" style="color: red"></span></td></tr>
					<tr><td>Customer Email: <input type="text" name="CusEmail" id="cEmail"><span id="ceError" style="color: red"></span></td></tr>
					<tr><td>Customer Password: <input type="password" name="custPass" id="cpsw"><span id="cpError" style="color: red"></span></td></tr>
					<tr><td><input type="submit" name="Submit" value="Submit" >
							<input type="reset" name="Reset" value="Reset">
					</td></tr>
				</table>
			</div>
		</form>
	</div>

<jsp:include page="Footer.jsp"></jsp:include>
</div>
</body>
</html>