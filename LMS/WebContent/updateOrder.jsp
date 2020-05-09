<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<head>

<style type="text/css">
  <%@include file="CSS/addOrder.css" %>
</style>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Update Order</title>

</head>

<body>
	
	<form method = "POST" action = "ViewOrderServlet">
	<table>
		<tr>
			<th WIDTH="2500"></th>
			<th WIDTH="2500"></th>
			<th WIDTH="100"><input type = "submit" value = "Show all orders" /></th>
		</tr>
	</table>
	</form>
	
	<fieldset>
	<legend>New Order</legend><br>
	<form method="post" action="UpdateOrderServlet">
	<c:forEach var="payment" items="${UpdateOrder}" >
		<table style="width: 100%;">
		<tr>
			<td>Order Id</td>
			<td><input type="text" name="orderId" id="orderId" value="${order.orderId}"></td>
		</tr>
		<tr>
			<td>Customer Id</td>
			<td><input type="text" name="custId" id="custId" value="${order.custId}"></td>
		</tr>
		<tr>
			<td>Weight</td>
			<td><input type="text" name="weight" id="weight" value="${order.weight}"></td>
		</tr>
		<tr>
			<td>Order Date</td>
			<td><input type="date" name="orderDate" id="orderDate" value="${order.orderDate}"></td>
		</tr>
		<tr>
			<td>Delivery Date</td>
			<td><input type="date" name="deliveryDate" id="deliveryDate" value="${order.deliveryDate}"></td>
		</tr>
		<tr>
			<td colspan="2" align="right"><input type="submit" value="Submit" /></td>
		</tr>
		</table>
		</c:forEach>
	</form>
	</fieldset>
</body>
</html>