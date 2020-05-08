<%@page import="com.lms.model.Order"%>
<%@page import="com.lms.util.OrderDBUtil"%>
<%@ page import="java.util.ArrayList" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Order List</title>

<style type="text/css">
  <%@include file="CSS/orderList.css" %>
</style>

</head>
<body>

	<h1>Order List</h1>
	<%
		OrderDBUtil dbUtil = new OrderDBUtil();
		ArrayList<Order> ordRec = new ArrayList<Order>();
		ordRec = dbUtil.getOrderDetails();
		
	%>

	<table WIDTH="650">
		<tr>
			<th WIDTH="100">Order ID</th>
			<th WIDTH="160">Customer ID</th>
			<th WIDTH="80">Weight</th>
			<th WIDTH="150">Order Date</th>
			<th WIDTH="150">Delivery Date</th>
			<th WIDTH="150">Payment</th>
		</tr>
	<% for(Order order : ordRec ){ %>
		<tr>
			<td style="text-align:center"><%= order.getOrderId() %></td>
			<td style="text-align:center"><%= order.getCustId() %></td>
			<td style="text-align:center"><%= order.getWeight() %></td>
			<td style="text-align:center"><%= order.getOrderDate() %></td>
			<td style="text-align:center"><%= order.getDeliveryDate() %></td>
			<td style="text-align:center"><input type="button" value="view"></td>
			<td><a href= "DeleteOrder?orderId=<%= order.getOrderId() %>" >Delete</a></td>
		</tr>
	<% } %>
	</table>
	
</body>
</html>