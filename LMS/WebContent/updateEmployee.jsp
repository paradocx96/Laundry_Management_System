<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="com.lms.model.Employee,com.lms.service.*,com.lms.util.*,java.util.*" %>   

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<style type="text/css">
  <%@include file="CSS/reg.css" %>
</style>

<title>Employee edit bios</title>
</head>
<body>

<c:forEach var="emp" items="${empUpdate}">
<div class="row">
	<div class="col-sm-4">
	<form action="UpdateEmployee" method="post" class="card">
	
			<input type="hidden" value="${emp.empId}" name="empId">
		<div align="left">
			<label class="form-lable">First Name</label>
			<input type="text" class="form-control" value="${emp.firstName}" name="fname" id="fname" required="required">
		</div>
		<br>
		<div align="left">
			<label class="form-lable">Last Name</label>
			<input type="text" class="form-control" value="${emp.lastName}" name="lname" id="lname">
		</div>
		<br>
		<div align="left">
			<label class="form-lable">Address</label>
			<input type="text" class="form-control" value="${emp.address}" name="address" id="address">
		</div>
		<br>
		<div align="left">
			<label class="form-lable">Date of Birth </label>
			<input type="date" class="form-control" value="${emp.dob}" name="dob" id="email" required="required">
		</div>
		<br>
		<div align="left">
			<label class="form-lable">Phone Number</label>
			<input type="text" class="form-control" value="${emp.phone}" name="phone" id="pnumber" required="required">
		</div>
		<br>
		<div align="left">
			<label class="form-lable">Username</label>
			<input type="text" class="form-control" value="${emp.userName}" name="username" id="username" required="required">
		</div>
		<br>
		<div align="left">
			<label class="form-lable">Password</label>
			<input type="password" class="form-control"  value="${emp.password}" name="password" id="password" required="required">
		</div>
		<br>
		<br>
		<div align="right">
			<input type="submit" id="submit" value="Update" name="submit" class="btn btn-info">
			<input type="reset" id="reset" value="reset" name="reset" class="btn btn-warning">
		</div>
	</form>
	</div>
	<div class="col-sm-8">
		
	</div>
</div>
</c:forEach>



</body>
</html>