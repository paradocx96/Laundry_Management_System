<!DOCTYPE html>
<html>
<head>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<meta charset="ISO-8859-1">

<link href="bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css">
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css">

<title>List Payments</title>
</head>
<body>

<%@ page import="com.lms.model.Payment,com.lms.service.*,com.lms.util.*,java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<h1 align="center">Payment List</h1>


<%
	List<Payment> payments = PaymentService.selectAllPayment();
	request.setAttribute("payments",payments);
%>

<table border="1" width ="90%" align="center">
	<tr>
	<th>Payment ID</th>
	<th>Order No</th>
	<th>Payment Amount</th>			
    <th>Payment Type</th>
    <th>Description</th>
    <th>Payment Date</th>
    <th>Edit</th>
    <th>Delete</th>
    </tr>
    <c:forEach items="${payments}" var="payment">
			<tr>
				<td>${payment.paymentID}</td>
				<td>${payment.orderID}</td>
				<td>Rs. ${payment.payAmount}</td>
				<td>${payment.paymentType}</td>
				<td>${payment.description}</td>
				<td>${payment.paymentDate}</td>
				<td><a href= "editPaymentAdmin?paymentID=${payment.paymentID}" >Edit</a></td>
				<td><a href= "deletePayment?paymentID=${payment.paymentID}" >Delete</a></td>
			</tr>
	</c:forEach>    
</table>
</body>
</html>