<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">

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


<title>Add employee</title>

</head>

<body>

		<div class="page-wrapper bg-gra-03 p-t-45 p-b-50">
        <div class="wrapper wrapper--w790">
            <div class="card card-5">
                <div class="card-heading">
                    <h2 class="title">Employee Registration Form</h2>
                </div>
                <div class="card-body">
                    <form action="AddEmployee" method="post">
					
                        <div class="form-row m-b-55">
                            <div class="name">Name</div>
                            <div class="value">
                                <div class="row row-space">
                                    <div class="col-2">
                                        <div class="input-group-desc">
                                            <input class="input--style-5" type="text" name="fname" required>
                                            <label class="label--desc">first name</label>
                                        </div>
                                    </div>
                                    <div class="col-2">
                                        <div class="input-group-desc">
                                            <input class="input--style-5" type="text" name="lname" required>
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
                                    <input class="input--style-5" type="text" name="address" required>
                                </div>
                            </div>
                        </div>
						
						
                        <div class="form-row">
                            <div class="name">Date of Birth</div>
                            <div class="value">
                                <div class="input-group">
                                    <input class="input--style-5" type="date" name="dob" required>
                                </div>
                            </div>
                        </div>
						
                        <div class="form-row">
                            <div class="name">Phone</div>
                            <div class="value">
								<div class="input-group">
                                    <input class="input--style-5" type="number" name="phone" required>
                                </div>
                            </div>
                        </div>
						
						 <div class="form-row">
                            <div class="name">Username</div>
                            <div class="value">
								<div class="input-group">
                                    <input class="input--style-5" type="text" name="username" required>
                                </div>
                            </div>
                        </div>
						
						 <div class="form-row">
                            <div class="name">Password</div>
                            <div class="value">
								<div class="input-group">
                                    <input class="input--style-5" type="password" name="password" required>
                                </div>
                            </div>
                        </div>
						
						<!--
                        <div class="form-row">
                            <div class="name">Subject</div>
                            <div class="value">
                                <div class="input-group">
                                    <div class="rs-select2 js-select-simple select--no-search">
                                        <select name="subject">
                                            <option disabled="disabled" selected="selected">Choose option</option>
                                            <option>Subject 1</option>
                                            <option>Subject 2</option>
                                            <option>Subject 3</option>
                                        </select>
                                        <div class="select-dropdown"></div>
                                    </div>
                                </div>
                            </div>
                        </div>
						-->
						
                        <div class="form-row p-t-20">
                            <label class="label label--block">I agree all statements in Terms of service</label>
							<!--
                            <div class="p-t-15">
                                <label class="radio-container m-r-55">Yes
                                    <input type="radio" checked="checked" name="exist">
                                    <span class="checkmark"></span>
                                </label>
                                <label class="radio-container">No
                                    <input type="radio" name="exist">
                                    <span class="checkmark"></span>
                                </label>
                            </div>
							-->
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
		







<!--  
<div class="row">
	<div class="col-sm-4">
	<form action="AddEmployee" method="post" class="card">
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
			<label class="form-lable">Date of Birth </label>
			<input type="date" class="form-control" placeholder="date of birth" name="dob" id="email" required="required">
		</div>
		<br>
		<div align="left">
			<label class="form-lable">Phone Number</label>
			<input type="text" class="form-control" placeholder="Phone Number" name="phone" id="pnumber" required="required">
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
</div> -->
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
