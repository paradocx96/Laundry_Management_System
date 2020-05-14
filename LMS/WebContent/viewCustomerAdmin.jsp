<!-- By IT19180526 -->
<%@ page language="java" 
contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<%@ page import="com.lms.model.Customer,
com.lms.service.*,
com.lms.util.*,
java.util.*" %>

<link href="CSS/payment/css/main.css" rel="stylesheet" type="text/css">
<link href="CSS/payment/css/util.css" rel="stylesheet" type="text/css">
<link href="CSS/payment/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css">
<link href="CSS/payment/fonts/font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
<link href="CSS/payment/vendor/animate/animate.css" rel="stylesheet" type="text/css">
<link href="CSS/payment/vendor/select2/select2.min.css" rel="stylesheet" type="text/css">
<link href="CSS/payment/vendor/perfect-scrollbar/perfect-scrollbar.css" type="text/css">

<title>Customer Details</title>
</head>
<body>

<div class="limiter">
<div class="container-table100">
<div class="wrap-table100">
<div class="table100">
<h1 align="center">Customer Details</h1>
<div id="buttons">
  		<a href="admindashboard.jsp" style="border-radius: 5px;  
  							padding: 5px 10px; 
  							font-size: 22px;  
  							text-decoration: none;  
  							margin: 20px;  
  							color: #fff;  
  							position: relative;  
  							display: inline-block;
  							background-color: #9b59b6;
  							box-shadow: 0px 5px 0px 0px #82409D;" >DASHBOARD</a>
  							
  		<a href="customerlist.jsp" style="border-radius: 5px;  
  							padding: 5px 10px; 
  							font-size: 22px;  
  							text-decoration: none;  
  							margin: 20px;  
  							color: #fff;  
  							position: relative;  
  							display: inline-block;
  							background-color: #9b59b6;
  							box-shadow: 0px 5px 0px 0px #82409D;" >CUSTOMER LIST</a>
</div>

<%
	Customer customer = (Customer) request.getAttribute("customer");
%>

	<table border="5" align="center">
	<thead>
	</thead>
	<tbody>
		<tr>
		<td>Customer ID</td>
		<td><%=customer.getCustId() %></td>
		</tr>
		<tr>
		<td>First Name</td>
		<td><%=customer.getFirstName() %></td>
		</tr>
		<tr>
		<td>Last Name</td>
		<td><%=customer.getLastName() %></td>
		</tr>
		<tr>
		<td>Email</td>
		<td><%=customer.getEmail() %></td>
		</tr>
		<tr>
		<td>Phone</td>
		<td><%=customer.getPhone() %></td>
		</tr>
		<tr>
		<td>Address</td>
		<td><%=customer.getAddress() %></td>
		</tr>
		<tr>
		<td>Username</td>
		<td><%=customer.getUserName() %></td>
		</tr>
		<tr>
		<td>Password</td>
		<td><%=customer.getPassword() %></td>
		</tr>
	</tbody>	
	</table>
</div>
</div>
</div>
</div>
</body>
</html>