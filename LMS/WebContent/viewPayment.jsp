<!DOCTYPE html>

<html>
<head>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page import="com.lms.model.Payment,com.lms.service.*,com.lms.util.*,java.util.*" %>
    
<meta charset="ISO-8859-1">

<link href="CSS/payment/css/viewpay.css" rel="stylesheet" type="text/css">

<title>View Payment</title>
</head>
<body>
	<h1 align="center">Payment Summary</h1>
	<br>
	<br>	
	<div>
	<%
		Payment payment = (Payment) request.getAttribute("payment");
	%>
		
			<table border="1" align="center">
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
			</table>
	</div>
</body>
</html>