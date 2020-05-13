<!DOCTYPE html>
<html>

<head>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.lms.model.Customer,com.lms.service.*,com.lms.util.*,java.util.*" %>
    
<meta charset="ISO-8859-1">

<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

	<!-- Icons font CSS-->
    <link href="CSS/regform/vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">
    <link href="CSS/regform/vendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">
	
    <!-- Font special for pages-->
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i" rel="stylesheet">

    <!-- Vendor CSS-->
    <link href="CSS/regform/vendor/select2/select2.min.css" rel="stylesheet" media="all">
    <link href="CSS/regform/vendor/datepicker/daterangepicker.css" rel="stylesheet" media="all">

    <!-- Main CSS-->
    <link href="CSS/regform/css/main.css" rel="stylesheet" media="all">

<title>Register</title>

</head>

<body>
    <div class="page-wrapper bg-gra-03 p-t-45 p-b-50">
        <div class="wrapper wrapper--w790">
            <div class="card card-5">
                <div class="card-heading">
                    <h2 class="title">Update Customer Info</h2>
                </div>
                <div class="card-body">
                    <form action="UpdateCustomerAdmin" method="post">
						
				<%
					Customer customer = (Customer) request.getAttribute("customer");
				%>
						
						
						<div class="form-row">
                            <div class="name">Customer ID</div>
                            <div class="value">
                                <div class="input-group">
                                    <input class="input--style-5" type="text" name="custid" value="<%=customer.getCustId() %>" readonly="readonly">
                                </div>
                            </div>
                        </div>
						
                        <div class="form-row m-b-55">
                            <div class="name">Name</div>
                            <div class="value">
                                <div class="row row-space">
                                    <div class="col-2">
                                        <div class="input-group-desc">
                                            <input class="input--style-5" type="text" name="fname" value="<%=customer.getFirstName() %>">
                                            <label class="label--desc">first name</label>
                                        </div>
                                    </div>
                                    <div class="col-2">
                                        <div class="input-group-desc">
                                            <input class="input--style-5" type="text" name="lname" value="<%=customer.getLastName() %>">
                                            <label class="label--desc">last name</label>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
						
                        <div class="form-row">
                            <div class="name">Address</div>
                            <div class="value">
                                <div class="input-group">
                                    <input class="input--style-5" type="text" name="address" value="<%=customer.getAddress() %>">
                                </div>
                            </div>
                        </div>
						
						
                        <div class="form-row">
                            <div class="name">Email</div>
                            <div class="value">
                                <div class="input-group">
                                    <input class="input--style-5" type="email" name="email" value="<%=customer.getEmail() %>">
                                </div>
                            </div>
                        </div>
						
                        <div class="form-row">
                            <div class="name">Phone</div>
                            <div class="value">
								<div class="input-group">
                                    <input class="input--style-5" type="text" name="pnumber" value="<%=customer.getPhone() %>">
                                </div>
                            </div>
                        </div>
						
						 <div class="form-row">
                            <div class="name">Username</div>
                            <div class="value">
								<div class="input-group">
                                    <input class="input--style-5" type="text" name="username" value="<%=customer.getUserName() %>">
                                </div>
                            </div>
                        </div>
						
						 <div class="form-row">
                            <div class="name">Password</div>
                            <div class="value">
								<div class="input-group">
                                    <input class="input--style-5" type="password" name="password" value="<%=customer.getPassword() %>">
                                </div>
                            </div>
                        </div>
						
						<div class="form-row p-t-20">
                            <label class="label label--block">I agree all statements in Terms of service</label>
                        </div>
						
						
                        <div>
                            <button class="btn btn--radius-2 btn--red" type="submit">Update</button>
							<button class="btn btn--radius-2 btn--red" type="reset">Reset</button>
                        </div>
                     
                      
                    </form>
                </div>
            </div>
           <div id="buttons">
  		<a href="customerlist.jsp" style="border-radius: 5px;  
  							padding: 5px 10px; 
  							font-size: 22px;  
  							text-decoration: none;  
  							margin: 20px;  
  							color: #fff;  
  							position: relative;  
  							display: inline-block;
  							background-color: #9b59b6;
  							box-shadow: 0px 5px 0px 0px #82409D;" >CANCEL</a>
		</div>
        </div>
    </div>

    <!-- Jquery JS-->
    <script src="CSS/regform/vendor/jquery/jquery.min.js"></script>
    <!-- Vendor JS-->
    <script src="CSS/regform/vendor/select2/select2.min.js"></script>
    <script src="CSS/regform/vendor/datepicker/moment.min.js"></script>
    <script src="CSS/regform/vendor/datepicker/daterangepicker.js"></script>
    <!-- Main JS-->
    <script src="CSS/regform/js/global.js"></script>


</body>
</html>
