<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="CSS/index.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Order</title>
</head>
<body>
	<fieldset>
	<legend>New Order</legend><br>
	<form>
		<table border="0" style="width: 100%;">
		<tr>
			<td>Order Id</td>
			<td><input type="text" name="oderId"></td>
		</tr>
		<tr>
			<td>Customer Id</td>
			<td><input type="text" name="customerId"></td>
		</tr>
		<tr>
			<td>Weight</td>
			<td><input type="text" name="weight"></td>
		</tr>
		<tr>
			<td>Order Date</td>
			<td><input type="date" name="orderDate"></td>
		</tr>
		<tr>
			<td>Delivery Date</td>
			<td><input type="date" name="deliveryDate"></td>
		</tr>
		<tr>
			<td colspan="2" align="right"><input type="submit" value="Submit" /></td>
		</tr>
		</table>
	</form>
	</fieldset>
</body>
</html>