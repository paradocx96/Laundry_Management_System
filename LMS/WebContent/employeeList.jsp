<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<!DOCTYPE html>
<html>
<head>

<link href="bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css">

<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css">

<link href="CSS/payment/css/main.css" rel="stylesheet" type="text/css">
<link href="CSS/payment/css/util.css" rel="stylesheet" type="text/css">
<link href="CSS/payment/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css">
<link href="CSS/payment/fonts/font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
<link href="CSS/payment/vendor/animate/animate.css" rel="stylesheet" type="text/css">
<link href="CSS/payment/vendor/select2/select2.min.css" rel="stylesheet" type="text/css">
<link href="CSS/payment/vendor/perfect-scrollbar/perfect-scrollbar.css" type="text/css">


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee List</title>
</head>
<body>

	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	
	<%@ page import="com.lms.model.Employee,com.lms.service.*,com.lms.util.*,java.util.*" %>

	
	<%
		List<Employee> empList = EmployeeService.getEmployeeList();
		request.setAttribute("empList",empList);
	%>
	
	
<div class="limiter">
<div class="container-table100">
<div class="wrap-table100">
<div class="table100">	
	<h1>Employee List</h1>
	<div align="center">
		<table>
			<thead>
				<tr class="table100-head">
					<th>Employee ID</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Address</th>
					<th>Date of Birth</th>
					<th>Phone</th>
					<th>Username</th>
					<th>Password</th>
					<th>Edit</th>
					<th>Delete</th>
				</tr>
			<thead>
			<c:forEach var="emp" items="${empList}">
			 <tbody>
				<tr>
					<td><c:out value="${emp.empId}" /></td>
					<td><c:out value="${emp.firstName}" /></td>
					<td><c:out value="${emp.lastName}" /></td>
					<td><c:out value="${emp.address}" /></td>
					<td><c:out value="${emp.dob}" /></td>
					<td><c:out value="${emp.phone}" /></td>
					<td><c:out value="${emp.userName}" /></td>
					<td><c:out value="${emp.password}" /></td>
					
					<td><a href= "editEmployee?empId=${emp.empId}" >Edit</a></td>
					<td><a href= "deleteEmployee?empId=${emp.empId}" >Delete</a></td>
				</tr>
			<tbody>						
			</c:forEach>	
		</table>
	
</div>
</div>
</div>	
</div>

</body>
</html>