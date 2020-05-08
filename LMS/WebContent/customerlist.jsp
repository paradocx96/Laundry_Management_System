<!DOCTYPE html>

<html>
<head>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<meta charset="ISO-8859-1">

<link href="bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css">

<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css">

<title>Customer Management</title>

</head>

<body>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page import="com.lms.model.Customer,com.lms.service.*,com.lms.util.*,java.util.*" %>
	<h1 align="center">Customer List</h1>
	
	<%
	List<Customer> listCustomer = CustomerService.listallcustomer();
	request.setAttribute("listCustomer",listCustomer);
	%>

	<div align="center">
		<table border="1" cellpadding="5">
			<tr>
				<th>Customer ID</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Address</th>
				<th>Email</th>
				<th>Phone</th>
				<th>Username</th>
				<th>Password</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>
			<c:forEach var="customer" items="${listCustomer}">
				<tr>
					<td><c:out value="${customer.custId}" /></td>
					<td><c:out value="${customer.firstName}" /></td>
					<td><c:out value="${customer.lastName}" /></td>
					<td><c:out value="${customer.address}" /></td>
					<td><c:out value="${customer.email}" /></td>
					<td><c:out value="${customer.phone}" /></td>
					<td><c:out value="${customer.userName}" /></td>
					<td><c:out value="${customer.password}" /></td>
					<td>Edit</td>
					<td>Delete</td>
				</tr>					
			</c:forEach>	
		</table>
	</div>	
</body>
</html>