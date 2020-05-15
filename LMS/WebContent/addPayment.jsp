<!-- By IT19180526 -->
<!DOCTYPE html>
<html>
<head>

<%@ page language="java" 
contentType="text/html; charset=ISO-8859-1" 
pageEncoding="ISO-8859-1"
%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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
    

<title>Payment Management</title>
</head>
<body>
    <div class="page-wrapper bg-gra-03 p-t-45 p-b-50">
        <div class="wrapper wrapper--w790">
            <div class="card card-5">
                <div class="card-heading">
                    <h2 class="title">ADD PAYMENT</h2>
                </div>
                <div class="card-body">                
                <form action="addPayment" method="post">						
										 
                        <div class="form-row">
                            <div class="name">Order ID</div>
                            <div class="value">
                                <div class="input-group">
                                    <input class="input--style-5" type="text" name="orderid" required="required">
                                </div>
                            </div>
                        </div>
                        
						<div class="form-row p-t-20">
                            <label class="label label--block">Payment Type</label>
                            <div class="p-t-15">
                                <label class="radio-container m-r-55">Card Payment
                                    <input type="radio" name="paytype" value="Card Payment" >
                                    <span class="checkmark"></span>
                                </label>
                                <label class="radio-container">Cash on Delivery
                                    <input type="radio" name="paytype" value="Cash on Delivery">
                                    <span class="checkmark"></span>
                                </label>
                            </div>
                        </div>
						
                        <div class="form-row">
                            <div class="name">Date</div>
                            <div class="value">
                                <div class="input-group">
                                    <input class="input--style-5" type="date" name="paydate" required="required">
                                </div>
                            </div>
                        </div>
                        
                        <div class="form-row">
                            <div class="name">Description</div>
                            <div class="value">
								<div class="input-group">
                                    <input class="input--style-5" type="text" name="description" >
                                </div>
                            </div>
                        </div>
						
                        <div class="form-row">
                            <div class="name">Net Amount &nbsp;Rs.</div>
                            <div class="value">
								<div class="input-group">
                                    <input class="input--style-5" type="text" name="payamount" required="required">
                                </div>
                            </div>
                        </div>
												
                        <div>
                            <button class="btn btn--radius-2 btn--red" type="submit">Add Payment</button>
							<button class="btn btn--radius-2 btn--red" type="reset">Reset</button>
							
							<div id="buttons">
            				<a href="paymentList.jsp" style="border-radius: 5px;  
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