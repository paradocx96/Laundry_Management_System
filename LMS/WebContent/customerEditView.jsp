
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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

<title>Customer update bios</title>
</head>
<body>

		<div class="page-wrapper bg-gra-03 p-t-45 p-b-50">
        <div class="wrapper wrapper--w790">
            <div class="card card-5">
                <div class="card-heading">
                    <h2 class="title">Customer Edit Detial Form</h2>
                </div>
                <div class="card-body">
                    <form action="EditCustomerBios" method="post">
						<c:forEach var="cus" items="${cusDetails}">
                        <div class="form-row m-b-55">
                            <div class="name">Name</div>
                            <div class="value">
                                <div class="row row-space">
                                    <div class="col-2">    
                                   	 <input type="hidden" value="${cus.custId}" name="custId">                           
                                        <div class="input-group-desc">                                     
                                            <input class="input--style-5" value="${cus.firstName}" type="text" name="fname">
                                            <label class="label--desc">first name</label>
                                        </div>
                                    </div>
                                    <div class="col-2">
                                        <div class="input-group-desc">
                                            <input class="input--style-5" value="${cus.lastName}" type="text" name="lname">
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
                                    <input class="input--style-5"  value="${cus.address}"  type="text" name="address">
                                </div>
                            </div>
                        </div>
						
						
                        <div class="form-row">
                            <div class="name">Email</div>
                            <div class="value">
                                <div class="input-group">
                                    <input class="input--style-5" value="${cus.email}" type="email" name="email">
                                </div>
                            </div>
                        </div>
						
                        <div class="form-row">
                            <div class="name">Phone</div>
                            <div class="value">
								<div class="input-group">
                                    <input class="input--style-5" value="${cus.phone}" type="text" name="pnumber">
                                </div>
                            </div>
                        </div>
					</c:forEach>	
                        <div class="form-row p-t-20">
                            <label class="label label--block">I agree all statements in Terms of service</label>
                        </div>										
                        <div>
                            <button class="btn btn--radius-2 btn--red" type="submit">Register</button>
							<button class="btn btn--radius-2 btn--red" type="reset">Reset</button>
                        </div>
                    </form>
                </div>
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