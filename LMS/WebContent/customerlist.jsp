<!DOCTYPE html>

<html>
<head>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<meta charset="ISO-8859-1">
<!-- 
<link href="bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css">
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css">
 -->
<link href="CSS/payment/css/main.css" rel="stylesheet" type="text/css">
<link href="CSS/payment/css/util.css" rel="stylesheet" type="text/css">
<link href="CSS/payment/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css">
<link href="CSS/payment/fonts/font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
<link href="CSS/payment/vendor/animate/animate.css" rel="stylesheet" type="text/css">
<link href="CSS/payment/vendor/select2/select2.min.css" rel="stylesheet" type="text/css">
<link href="CSS/payment/vendor/perfect-scrollbar/perfect-scrollbar.css" type="text/css">

<title>Customer Management</title>
</head>
<body>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="com.lms.model.Customer,com.lms.service.*,com.lms.util.*,java.util.*" %>
	
	

	
<div class="limiter">
<div class="container-table100">
<div class="wrap-table100">
<div class="table100">
<h1>Customer List</h1>
<input type="button" align="right" onclick="window.location.href='admindashboard.jsp'" value="Dashboared">
	<table>
		<thead>
			<tr class="table100-head">
				<th>Customer ID</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Address</th>
				<th>Email</th>
				<th>Phone</th>
				<th>Username</th>
				<th>Password</th>
				<th>View</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>
		</thead>
			<tbody>
			
				<%
					ICustomerService icustomer = new CustomerServiceImpl();
					ArrayList<Customer> listCustomer = icustomer.listallcustomer();
					
					for(Customer customer : listCustomer) {
					
				%>
			
				
				<tr>
					<td><c:out value="<%=customer.getCustId() %>" /></td>
					<td><c:out value="<%=customer.getFirstName() %>" /></td>
					<td><c:out value="<%=customer.getLastName() %>" /></td>
					<td><c:out value="<%=customer.getAddress() %>" /></td>
					<td><c:out value="<%=customer.getEmail() %>" /></td>
					<td><c:out value="<%=customer.getPhone() %>" /></td>
					<td><c:out value="<%=customer.getUserName() %>" /></td>
					<td><c:out value="<%=customer.getPassword() %>"/></td>
					<td><a href= "ViewPaymentAdmin?custId=<%=customer.getCustId() %>" >View</a></td>
					<td><a href= "editCustomer?custId=<%=customer.getCustId() %>" >Edit</a></td>
					<td><a href= "DeleteCustomer?custId=<%=customer.getCustId() %>" >Delete</a></td>
				</tr>
			</tbody>
								
				<%
					}
				%>
		
	</table>
	</div>
</div>
</div>
</div>
</body>

</html>