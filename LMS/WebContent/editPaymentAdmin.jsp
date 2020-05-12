<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.lms.model.Payment,com.lms.service.*,com.lms.util.*,java.util.*" %>

<link href="CSS/payment/css/viewpay.css" rel="stylesheet" type="text/css">

<title>Edit Payment</title>
</head>
<body>
	<h1>Payment Management</h1>
	<br><br>
	
	<div>
	<form action="UpdatePaymentAdmin" method="post" class="">
		
		<%
			Payment payment = (Payment) request.getAttribute("payment");
		%>
		<table border="1">
			<tr>
				<td><label class="">Payment ID</label></td>
				<td><input type="text" class="" value="<%=payment.getPaymentID() %>" name="paymentid" id="paymentid" readonly="readonly"></td>
			</tr>
			<tr>
				<td><label class="">Order ID</label></td>
				<td><input type="text" class="" value="<%=payment.getOrderID() %>" name="orderid" id="orderid"></td>
			</tr>
			<tr>
				<td><label class="">Payment Date</label></td>
				<td><input type="text" class="" value="<%=payment.getPaymentDate() %>" name="paydatetime" id="paydatetime" readonly="readonly"></td>
			</tr>
			<tr>	
				<td><label class="">Net Amount</label></td>
				<td>Rs.<input type="text" class="" value="<%=payment.getPayAmount() %>" name="payamount" id="payamount"></td>
			</tr>
			<tr>
				<td><label class="">Payment Type</label></td>
				<td><input type="text" class="" value="<%=payment.getPaymentType() %>" readonly="readonly"><br>
				<input type="radio" id="cardPay" name="paytype" value="Card Payment" required="required"><label for="cardPay">Card Payment</label><br>
				<input type="radio" id="cashonDelivery" name="paytype" value="Cash on Delivery"><label for="cashonDelivery">Cash on Delivery</label>
				</td>
			</tr>
			<tr>
				<td><label class="">Description</label></td>
				<td><input type="text" class="" value="<%=payment.getDescription() %>" name="description" id="description"></td>
			</tr>
		</table><br><br><br>
		<input type="submit" id="submit" value="update" name="submit" class=""><button type="reset" value="reset" name="reset">RESET</button>
				
	</form>
	</div>

</body>
</html>