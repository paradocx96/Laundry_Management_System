<!DOCTYPE html>
<html>
<head>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<meta charset="ISO-8859-1">

<link href="CSS/payment/css/viewpay.css" rel="stylesheet" type="text/css">

<title>Add Payment</title>
</head>
<body>
	<div>
		<form action="addPayment" method="post">
			<h1>ADD PAYMENT</h1>
			<br>
			<br>
			Order ID <input type="text" name="orderid"/>
			<br>
			Payment Type
			<table>
			<tr>
			<td></td>
			<td>
			<input type="radio" id="cardPay" name="paytype" value="Card Payment"><label for="cardPay">Card Payment</label><br>
  			<input type="radio" id="cashonDelivery" name="paytype" value="Cash on Delivery"><label for="cashonDelivery">Cash on Delivery</label>
  			</td>
  			</tr>
			</table>
			<br><br>
			Payment Description <input type="text" name="description"/>
			<br>
			<!-- Payment Date <input type="date" name="paydate"/>
			<br> -->
			Payment Amount <input type="text" name="payamount"/>
			<br>
			<br>
			<input type="submit" name="submit" value="Add Payment">
		</form>
	</div>
</body>
</html>