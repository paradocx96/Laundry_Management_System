<!DOCTYPE html>
<html>
<head>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!--
<link href="bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css">
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css">
-->
<link href="CSS/payment/css/main.css" rel="stylesheet" type="text/css">
<link href="CSS/payment/css/util.css" rel="stylesheet" type="text/css">
<link href="CSS/payment/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css">
<link href="CSS/payment/fonts/font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
<link href="CSS/payment/vendor/animate/animate.css" rel="stylesheet" type="text/css">
<link href="CSS/payment/vendor/select2/select2.min.css" rel="stylesheet" type="text/css">
<link href="CSS/payment/vendor/perfect-scrollbar/perfect-scrollbar.css" type="text/css">

<title>List Payments</title>
</head>
<body>

<%@ page import="com.lms.model.Payment,com.lms.service.*,com.lms.util.*,java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%
	List<Payment> payments = PaymentService.selectAllPayment();
	request.setAttribute("payments",payments);
%>

<div class="limiter">
<div class="container-table100">
<div class="wrap-table100">
<div class="table100">

<h1>Payment History</h1>
<table>
<thead>
	<tr class="table100-head">
	<th>Payment ID</th>
	<th>Order No</th>
	<th>Payment Amount</th>			
    <th>Payment Type</th>
    <th>Description</th>
    <th>Payment Date</th>
    <th>View</th>
    <th>Edit</th>
    <th>Delete</th>
    </tr>
</thead>
    
    <c:forEach items="${payments}" var="payment">
    	<tbody>
			<tr>
				<td>${payment.paymentID}</td>
				<td>${payment.orderID}</td>
				<td>Rs. ${payment.payAmount}</td>
				<td>${payment.paymentType}</td>
				<td>${payment.description}</td>
				<td>${payment.paymentDate}</td>
				<td><a href= "ViewPaymentAdmin?paymentID=${payment.paymentID}" >View</a></td>
				<td><a href= "editPaymentAdmin?paymentID=${payment.paymentID}" >Edit</a></td>
				<td><a href= "deletePayment?paymentID=${payment.paymentID}" >Delete</a></td>
			</tr>
		</tbody>
	</c:forEach>    
</table>
</div>
</div>
</div>
</div>

</body>
</html>