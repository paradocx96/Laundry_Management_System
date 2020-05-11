<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<!DOCTYPE html>
<html>
<head>

<link href="bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css">

<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css">


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee List</title>
</head>
<body>

	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	
	<%@ page import="com.lms.model.Employee,com.lms.service.*,com.lms.util.*,java.util.*" %>
	<h1 align="center">Employee List</h1>
	
	<%
		List<Employee> empList = EmployeeService.getEmployeeList();
		request.setAttribute("empList",empList);
	%>
	
	<div align="center">
		<table border="1" cellpadding="5">
			<tr>
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
			<c:forEach var="emp" items="${empList}">
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
			</c:forEach>	
		</table>
	</div>	
	


</body>
</html>