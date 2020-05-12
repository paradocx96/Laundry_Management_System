<%@page import="com.lms.model.Order"%>
<%@page import="com.lms.service.OrderService"%>
<%@ page import="java.util.ArrayList" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="com.lms.model.Order,com.lms.util.*,java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Order</title>


<style type="text/css">
  <%@include file="CSS/addOrder.css" %>
</style>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

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
<%
	Order order = (Order) request.getAttribute("UpdateOrder");
%>	
	<fieldset>
	<legend>Edit Order</legend><br>
	<form method="post" action="UpdateOrderServlet">

		<table style="width: 100%;">
		
		<tr>
			<td>Order Id</td>
			<td><input type="text" name="orderId" id="orderId" value="<%= order.getOrderId() %>" readonly="readonly"  style="color:#B0B0B0;"></td>
		</tr>
		<tr>
			<td>Customer Id</td>
			<td><input type="text" name="custId" id="custId" value="<%= order.getCustId() %>"></td>
		</tr>
		<tr>
			<td>Weight</td>
			<td><input type="text" name="weight" id="weight" value="<%= order.getWeight() %>"></td>
		</tr>
		<tr>
			<td>Order Date</td>
			<td><input type="text" name="orderDate" id="orderDate" value="<%= order.getOrderDate() %>"></td>
		</tr>
		<tr>
			<td>Delivery Date</td>
			<td><input type="text" name="deliveryDate" id="deliveryDate" value="<%= order.getDeliveryDate() %>"></td>
		</tr>
		<tr>
			<td colspan="2" align="right"><input type="submit" value="Update" /></td>
		</tr>
		
		</table>
	
	</form>
	</fieldset>
</body>
</html>