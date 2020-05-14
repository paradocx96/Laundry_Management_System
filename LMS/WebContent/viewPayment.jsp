<!-- By IT19180526 -->
<!DOCTYPE html>
<html>
<head>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page import="com.lms.model.Payment,
com.lms.service.*,
com.lms.util.*,
java.util.*"
%>
    
<meta charset="ISO-8859-1">

<link href="CSS/payment/css/main.css" rel="stylesheet" type="text/css">
<link href="CSS/payment/css/util.css" rel="stylesheet" type="text/css">
<link href="CSS/payment/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css">
<link href="CSS/payment/fonts/font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
<link href="CSS/payment/vendor/animate/animate.css" rel="stylesheet" type="text/css">
<link href="CSS/payment/vendor/select2/select2.min.css" rel="stylesheet" type="text/css">
<link href="CSS/payment/vendor/perfect-scrollbar/perfect-scrollbar.css" type="text/css">

<title>Payment Details</title>

</head>

<body>

<div class="limiter">
<div class="container-table100">
<div class="wrap-table100">
<div class="table100">
	<h1 align="center">Payment Details</h1>
	
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
  	<a href="paymentList.jsp" style="border-radius: 5px;  
  							padding: 5px 10px; 
  							font-size: 22px;  
  							text-decoration: none;  
  							margin: 20px;  
  							color: #fff;  
  							position: relative;  
  							display: inline-block;
  							background-color: #9b59b6;
  							box-shadow: 0px 5px 0px 0px #82409D;" >PAYMENT LIST</a>
	</div>
	
	<%
		Payment payment = (Payment) request.getAttribute("payment");
	%>
		
			<table>
				<thead></thead>
				<tbody>
					<tr>
						<td><label class="">Payment ID</label></td>
						<td><%=payment.getPaymentID() %></td>
					</tr>
					<tr>
						<td><label class="">Order ID</label></td>
						<td><%=payment.getOrderID() %></td>
					</tr>
					<tr>
						<td><label class="">Payment Date</label></td>
						<td><%=payment.getPaymentDate() %></td>
					</tr>
					<tr>	
						<td><label class="">Net Amount</label></td>
						<td>Rs. <%=payment.getPayAmount() %></td>
					</tr>
					<tr>
						<td><label class="">Payment Type</label></td>
						<td><%=payment.getPaymentType() %></td>
					</tr>
					<tr>
						<td><label class="">Description</label></td>
						<td><%=payment.getDescription() %></td>
					</tr>
				</tbody>
			</table>

</div>
</div>
</div>
</div>	
</body>
</html>