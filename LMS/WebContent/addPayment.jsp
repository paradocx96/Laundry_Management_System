<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Payment</title>
</head>
<body>
	<form action="addPayment" method="post">
		<h1>ADD PAYMENT</h1>
		<br>
		<br>
		<br>
		Order ID
		<br>
		<input type="text" name="orderid"/>
		<br>
		<br>
		Payment Amount
		<br>
		<input type="text" name="payamount"/>
		<br>
		<br>
		<button type="submit" name="submit" value="Add Payment">Save</button>
		</form>
</body>
</html>