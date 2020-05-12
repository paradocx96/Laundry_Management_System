<%@page import="com.lms.model.Order"%>
<%@page import="com.lms.service.OrderService"%>
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
	<table>
		<tr>
			<th WIDTH="350" style="text-align:left"><h1>Order List</h1></th>
			<th WIDTH="400" style="text-align:right"><input type="button" value="Add New Order" onclick="window.location.href = '/LMS/order.jsp';"></th>
		</tr>
	</table>

	<%
		OrderService serv = new OrderService();
		ArrayList<Order> ordRec = new ArrayList<Order>();
		ordRec = serv.getOrderDetails();
		
	%>
	<table WIDTH="745">
		<tr>
			<th WIDTH="110">Order ID</th>
			<th WIDTH="160">Customer ID</th>
			<th WIDTH="80">Weight</th>
			<th WIDTH="150">Order Date</th>
			<th WIDTH="150">Delivery Date</th>
		</tr>
	<% for(Order order : ordRec ){ %>
		<tr>
			<td style="text-align:center"><%= order.getOrderId() %></td>
			<td style="text-align:center"><%= order.getCustId() %></td>
			<td style="text-align:center"><%= order.getWeight() %></td>
			<td style="text-align:center"><%= order.getOrderDate() %></td>
			<td style="text-align:center"><%= order.getDeliveryDate() %></td>
			<td style="text-align:center">
				<a href= "ViewPaymentByOrder?orderId=<%= order.getOrderId() %>" class="myButton" title="View Payment Details">Payment</a>
			</td>
			<td style="text-align:center">
				<a href= "EditOrder?orderId=<%= order.getOrderId()%>" class="myButtonBlue" title="Edit Order Details">Edit</a>
			</td>
			<td style="text-align:center">
				<a href= "DeleteOrder?orderId=<%= order.getOrderId()%>" class="myButtonRed" title="Delete Order">Delete</a>
			</td>
		</tr>
	<% } %>
	</table>
	
</body>
</html>