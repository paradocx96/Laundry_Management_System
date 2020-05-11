
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<style type="text/css">
  <%@include file="CSS/reg.css" %>
</style>

<title>Customer update bios</title>
</head>
<body>

	   
	<h1>CUSTOMER EDIT DETIALS</h1>
	
	<div class="row">
	<div class="col-sm-4">
	<form action="EditCustomerBios" method="post" class="card">
		
		<c:forEach var="cus" items="${cusDetails}">
		
			<div align="left">	 
				<input type="hidden" class="form-control" value="${cus.custId}" name="custId" id="fname" required="required">
			</div>
		
			<div align="left">	 
				<label class="form-lable">First Name</label>
				<input type="text" class="form-control" value="${cus.firstName}" name="fname" id="fname" required="required">
			</div>
			<br>
			<div align="left">
				<label class="form-lable">Last Name</label>
				<input type="text" class="form-control" value="${cus.lastName}" name="lname" id="lname">
			</div>
			<br>
			<div align="left">
				<label class="form-lable">Address</label>
				<input type="text" class="form-control" value="${cus.address}" name="address" id="address">
			</div>
			<br>
			<div align="left">
				<label class="form-lable">Email</label>
				<input type="text" class="form-control" value="${cus.email}" name="email" id="email" required="required">
			</div>
			<br>
			<div align="left">
				<label class="form-lable">Phone Number</label>
				<input type="text" class="form-control" value="${cus.phone}" name="pnumber" id="pnumber">
			</div>
			<br>
		<br>
		<br>
		<div align="right">
			<input type="submit" id="submit" value="update" name="submit" class="btn btn-info">					
			<input type="reset" id="reset" value="reset" name="reset" class="btn btn-warning">
		</div>
	</c:forEach>	
	</form>
	</div>
	<div class="col-sm-8">
		
	</div>
</div>

	
	
	
	
	
	
	
	<!--  
	  <table border="1" cellpadding="5">
            <caption><h2>List of Customers</h2></caption>
            <tr>
                <th>custId ID</th>
                <th>firstName Name</th>
                <th>lastName Name</th>
                <th>email</th>
                <th>phone</th>
                <th>address</th>
                <th>User name</th>
                <th>Password</th>
                <th>Update Details</th>
                
            </tr> 
           <c:forEach var="cus" items="${cusDetails}">
                <tr>
                   	<td> <c:out value="${cus.custId}"/> </td>
				   	<td> <c:out value="${cus.firstName}"/> </td>
				  	<td> <c:out value="${cus.lastName}"/> </td>
					<td> <c:out value="${cus.email}"/> </td>
					<td> <c:out value="${cus.phone}"/> </td>
					<td> <c:out value="${cus.address}"/>	</td>
					<td> <c:out value="${cus.userName}"/> </td>	
					<td> <c:out value="${cus.password}"/> </td>
		
                    
                    <td> <a href="edit?id=<c:out value='${cus.custId}' />">Edit</a> </td>
                      &nbsp;&nbsp;&nbsp;&nbsp; 
                  
                 
            		</tr>
			</c:forEach>
        </table> -->
</body>
</html>