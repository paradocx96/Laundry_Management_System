<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">

<style type="text/css">
  <%@include file="CSS/reg.css" %>
</style>

<title>Register</title>

</head>

<body>

<h1>Register</h1>

<div class="row">
	<div class="col-sm-4">
	<form action="Registration" method="post" class="card">
		<div align="left">
			<label class="form-lable">First Name</label>
			<input type="text" class="form-control" placeholder="First Name" name="fname" id="fname" required="required">
		</div>
		<br>
		<div align="left">
			<label class="form-lable">Last Name</label>
			<input type="text" class="form-control" placeholder="Last Name" name="lname" id="lname">
		</div>
		<br>
		<div align="left">
			<label class="form-lable">Address</label>
			<input type="text" class="form-control" placeholder="Address" name="address" id="address">
		</div>
		<br>
		<div align="left">
			<label class="form-lable">Email</label>
			<input type="text" class="form-control" placeholder="Email" name="email" id="email" required="required">
		</div>
		<br>
		<div align="left">
			<label class="form-lable">Phone Number</label>
			<input type="text" class="form-control" placeholder="Phone Number" name="pnumber" id="pnumber">
		</div>
		<br>
		<div align="left">
			<label class="form-lable">Username</label>
			<input type="text" class="form-control" placeholder="Username" name="username" id="username" required="required">
		</div>
		<br>
		<div align="left">
			<label class="form-lable">Password</label>
			<input type="password" class="form-control" name="password" id="password" required="required">
		</div>
		<br>
		<br>
		<div align="right">
			<input type="submit" id="submit" value="submit" name="submit" class="btn btn-info">
			<input type="reset" id="reset" value="reset" name="reset" class="btn btn-warning">
		</div>
	</form>
	</div>
	<div class="col-sm-8">
		
	</div>
</div>

</body>
</html>
