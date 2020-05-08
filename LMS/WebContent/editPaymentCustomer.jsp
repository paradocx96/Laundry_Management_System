<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.lms.model.Payment,com.lms.service.*,com.lms.util.*,java.util.*" %>

<title>Payment</title>
</head>
<body>
	<h1>Payment Management</h1>
	<br><br>
	
	<div>
		<table border="1">
		
		<form action="" method="post" class="">
					
			<c:forEach var="payment" items="${paymentUpdate}" >
			<tr>
				<td><label class="">Payment ID</label></td>
				<td><input type="text" class="" value="${payment.paymentID}" name="paymentid" id="paymentid" readonly="readonly"></td>
			</tr>
			<tr>
				<td><label class="">Order ID</label></td>
				<td><input type="text" class="" value="${payment.orderID}" name="orderid" id="orderid" readonly="readonly"></td>
			</tr>
			<tr>
				<td><label class="">Payment Date</label></td>
				<td><input type="text" class="" value="${payment.paymentDate}" name="paydatetime" id="paydatetime"readonly="readonly"></td>
			</tr>
			<tr>	
				<td><label class="">Net Amount</label></td>
				<td>Rs. <input type="text" class="" value="${payment.payAmount}" name="payamount" id="payamount" readonly="readonly"></td>
			</tr>
			<tr>
				<td><label class="">Payment Type</label></td>
				<td><input type="text" class="" value="${payment.paymentType}" name="paytype" id="paytype"></td>
			</tr>
			<tr>
				<td><label class="">Description</label></td>
				<td><input type="text" class="" value="${payment.description}" name="description" id="description"></td>
			</tr>
		</table>
		<br><br><br>
				<input type="submit" id="submit" value="update" name="submit" class="">	
				<input type="reset" id="reset" value="reset" name="reset" class="">
				
			</c:forEach>
		</form>
	</div>

</body>
</html>