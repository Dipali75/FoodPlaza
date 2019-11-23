<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Tea and Meal - Free CSS Template</title>

<meta name="keywords" content="" />
<meta name="description" content="" />

<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
</head>
<body >
<% String userName=(String)session.getAttribute("CusUserName");
		String adminName=(String)session.getAttribute("AdminUserName");
	  %>
<!--  Free CSS Template by TemplateMo.com  --> 
<div id="templatemo_container">
	<div id="templatemo_header">
    	<div id="site_title"></div>
    </div> <!-- end of header -->
    <div style="color: red" align="center"> <%
    String cartSuccsess=(String)session.getAttribute("CartMsg");
    		if(cartSuccsess!=null)
    		{
    			out.print(cartSuccsess);
    		}
    		  %> 
    	<% String placeOrder=(String)session.getAttribute("placeOrder");
    	if(placeOrder!=null){
    		out.print(placeOrder);
    	}
    	%>
    	
    	
    	
  </div>
    <div id="templatemo_menu">
        <ul>
        	<li class="current"><a href="Index.jsp"><b>Home</b></a></li>
            <li><a href="FoodServelet"><b>Food menu</b></a></li>
            <li><a href="Search.jsp"><b>Search</b></a></li>
            <%if(userName==null && adminName==null)
            	{
            	%>
            <li><a href="Customer.jsp"><b>Register</b></a></li>
            <li><a href="Login.jsp"><b>Login</b></a></li>
            <li ><a href="Contact.jsp"><b>Contact Us</b></a></li>
            <%} %>
            
            
            <%if(adminName!=null){ %>
            <li ><a href="CustomerServelet"><b>Show Customer</b></a></li>
            <li ><a href="AddFood.jsp"><b>Add Food</b></a></li>
            <li ><a href="OrderServelet"><b>Order</b></a></li>
            <li ><a href="FeedbackServlet"><b>Show Feedback</b></a></li>
            <%} %>
            
            
            
            <% if(userName!=null){ %>
            <li ><a href="#" ><b>Edit Profile</b></a></li>
            <li ><a href="CartServlet"><b>Show Cart</b></a></li>
            <li ><a href="FeedBack.jsp"><b>FeedBack</b></a></li>
            <li ><a href="#"><b>Show Order</b></a></li> 
            <%} %>
            
               
              <%if(userName!=null || adminName!=null) {%>
               
            <li ><a href="LoginServlet"><b>Log Out</b></a></li>
              <%} %>
        </ul>
    </div> <!-- end of menu -->
    
    <div id="templatemo_top_dishes">

    	<h1>Recommended Dishes</h1>
        <div class="top_dishes_box">
       	  <img src="images/vadapav.jpg" width="205" height="150" alt="image" />
          <h2>Cura bitur turpis</h2>
            <p>Nulla a risus. Ali quam lectus dui, euismod id, volutpat ac, fringilla eu, ipsum. <a href="#">Read more...</a></p>
      </div>
        
        <div class="top_dishes_box">
       	  <img src="images/pavBhaji.jpg" width="205" height="150" alt="image" />
            <h2>Suspen metus lorem</h2>
          <p>Volutpat non, molestie sit amet, placerat id, elit. Praesent laoreet. Mauris velit. <a href="#">Read more...</a></p>
        </div>
        
        <div class="top_dishes_box">
       	  <img src="images/pizza.jpg" width="205" height="150" alt="image" />
            <h2>Phasellus dui velit</h2>
          <p>Laoreet id, accumsan nec, dui. Etiam varius. Maecenas sit amet est et enim laoreet rutrum. <a href="#">Read more...</a></p>
      </div>
        
        <div class="top_dishes_box">
       	  <img src="images/momos.jpg" width="205" height="150" alt="image" />
            <h2>Donec iaculis felis</h2>
          <p>Praesent varius egestas velit. Donec a massa ut pede pulvinar vulputate. Nulla et augue. <a href="#">Read more...</a></p>
        </div>
        
        <div class="cleaner">&nbsp;</div>
    
    </div> <!-- end of top dishes -->
    
    <div id="templatemo_content">
    	<span class="top"></span>
        <div id="templatemo_innter_content">
            
                <div id="templatemo_content_left">
                    <h1>Welcome to our website</h1>
                <img src="images/templatemo_image_05.jpg" alt="image" />
                   
                    <p>Donec malesuada elit vel enim. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse id velit elementum mi egestas ullamcorper. Vivamus nec dui.</p>
                  <p>Suspendisse vitae nibh ac nunc mattis blandit. Morbi consectetur ullamcorper felis. Nulla nec elit. Aliquam et mauris. Ut euismod congue diam.</p>
                    <a href="#">Read more...</a>
                    
                    <div style="clear: both; padding: 30px 0 20px 0;">                
                <a href="http://validator.w3.org/check?uri=referer"><img style="border:0;width:88px;height:31px" src="http://www.w3.org/Icons/valid-xhtml10" alt="Valid XHTML 1.0 Transitional" width="88" height="31" vspace="8" border="0" /></a>
<a href="http://jigsaw.w3.org/css-validator/check/referer"><img style="border:0;width:88px;height:31px"  src="http://jigsaw.w3.org/css-validator/images/vcss-blue" alt="Valid CSS!" vspace="8" border="0" /></a>
					</div>
                    
                    <div class="cleaner_with_height">&nbsp;</div>
                
                </div> <!-- end of content left -->
                
                <div id="templatemo_content_right">
                    <h1>What's new?</h1>
                    <div class="right_column_section">
	                    <h2>Special recipe for you</h2>
                        <img src="images/masVadi.jpg" width="205" height="150" alt="image" />
                        <p>Curabitur turpis. Nulla a risus. Aliquam lectus dui, euismod id, volutpat ac, fringilla eu, ipsum.</p>
                        <a href="#">Read more...</a>
                     </div>
                
                </div> <!-- end of content right -->
        		<div class="cleaner">&nbsp;</div>
        </div>   
        <div class="cleaner" style="background: #fff;">&nbsp;</div> 	
    </div>


<div id="templatemo_footer">
    
    	<a href="#">Home</a> | <a href="#">Tea</a> | <a href="#">Top Dishes</a> | <a href="#">Company</a> | <a href="#">FAQs</a> | <a href="#">Contact Us</a><br />
        Copyright © 2024 <a href="#"><strong>Your Company Name</strong></a> 
        <!-- Credit: www.templatemo.com --></div> <!-- end of footer -->
<!--  Free CSS Templates by TemplateMo.com  --> 
</div><!-- end of container -->
<!-- templatemo 082 tea and meal -->
<!-- 
Tea And Meal Template 
http://www.templatemo.com/preview/templatemo_082_tea_and_meal 
-->
</body>
</html>