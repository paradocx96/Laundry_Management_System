<!DOCTYPE html>
<html>
<head>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="com.lms.service.*,com.lms.util.*,java.util.*,java.sql.*" %>
    
    <link href="CSS/AdminDashboard/css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <link href="CSS/AdminDashboard/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="CSS/AdminDashboard/css/datepicker3.css" rel="stylesheet" type="text/css">
    <link href="CSS/AdminDashboard/css/styles.css" rel="stylesheet" type="text/css">
    
	<meta charset="ISO-8859-1">
	<title>Dashboard</title>
</head>
<body>

<nav class="navbar navbar-custom navbar-fixed-top" role="navigation">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#sidebar-collapse"><span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#"><span>Laundry Management</span>System</a>
			</div>
		</div><!-- /.container-fluid -->
	</nav>
<div id="sidebar-collapse" class="col-sm-3 col-lg-2 sidebar">
		<div class="divider"></div>
		<form role="search">
			<div class="form-group">
				<input type="text" class="form-control" placeholder="Search">
			</div>
		</form>
		<ul class="nav menu">
			<li class="active"><a href="admindashboard.jsp"><em class="fa fa-dashboard">&nbsp;</em> Dashboard</a></li>
			
			<li class="parent "><a data-toggle="collapse" href="#sub-item-1">
				<em class="fa fa-navicon">&nbsp;</em> Customer <span data-toggle="collapse" href="#sub-item-1" class="icon pull-right"><em class="fa fa-plus"></em></span>
				</a>
				<ul class="children collapse" id="sub-item-1">
					<li><a class="" href="customerlist.jsp">
						<span class="fa fa-arrow-right">&nbsp;</span> Customer List
					</a></li>
					<li><a class="" href="addCustomerAdmin.jsp">
						<span class="fa fa-arrow-right">&nbsp;</span> Add Customer
					</a></li>
					<li><a class="" href="#">
						<span class="fa fa-arrow-right">&nbsp;</span> Setting
					</a></li>
				</ul>
			</li>
			
			<li class="parent "><a data-toggle="collapse" href="#sub-item-2">
				<em class="fa fa-navicon">&nbsp;</em> Employee <span data-toggle="collapse" href="#sub-item-2" class="icon pull-right"><em class="fa fa-plus"></em></span>
				</a>
				<ul class="children collapse" id="sub-item-2">
					<li><a class="" href="employeeList.jsp">
						<span class="fa fa-arrow-right">&nbsp;</span> Employee List
					</a></li>
					<li><a class="" href="addEmployee.jsp">
						<span class="fa fa-arrow-right">&nbsp;</span> Add Employee
					</a></li>
					<li><a class="" href="#">
						<span class="fa fa-arrow-right">&nbsp;</span> Setting
					</a></li>
				</ul>
			</li>
			
			<li class="parent "><a data-toggle="collapse" href="#sub-item-3">
				<em class="fa fa-navicon">&nbsp;</em> Order <span data-toggle="collapse" href="#sub-item-3" class="icon pull-right"><em class="fa fa-plus"></em></span>
				</a>
				<ul class="children collapse" id="sub-item-3">
					<li><a class="" href="orderlist.jsp">
						<span class="fa fa-arrow-right">&nbsp;</span> Order List
					</a></li>
					<li><a class="" href="order.jsp">
						<span class="fa fa-arrow-right">&nbsp;</span> Add Order
					</a></li>
					<li><a class="" href="#">
						<span class="fa fa-arrow-right">&nbsp;</span> Setting
					</a></li>
				</ul>
			</li>
			
			<li class="parent "><a data-toggle="collapse" href="#sub-item-4">
				<em class="fa fa-navicon">&nbsp;</em> Delivery <span data-toggle="collapse" href="#sub-item-4" class="icon pull-right"><em class="fa fa-plus"></em></span>
				</a>
				<ul class="children collapse" id="sub-item-4">
					<li><a class="" href="#">
						<span class="fa fa-arrow-right">&nbsp;</span> Delivery List
					</a></li>
					<li><a class="" href="#">
						<span class="fa fa-arrow-right">&nbsp;</span> Add Delivery
					</a></li>
					<li><a class="" href="#">
						<span class="fa fa-arrow-right">&nbsp;</span> Setting
					</a></li>
				</ul>
			</li>
			
			<li class="parent "><a data-toggle="collapse" href="#sub-item-5">
				<em class="fa fa-navicon">&nbsp;</em> Payment <span data-toggle="collapse" href="#sub-item-5" class="icon pull-right"><em class="fa fa-plus"></em></span>
				</a>
				<ul class="children collapse" id="sub-item-5">
					<li><a class="" href="paymentList.jsp">
						<span class="fa fa-arrow-right">&nbsp;</span> Payment List
					</a></li>
					<li><a class="" href="addPayment.jsp">
						<span class="fa fa-arrow-right">&nbsp;</span> Add Payment
					</a></li>
					<li><a class="" href="#">
						<span class="fa fa-arrow-right">&nbsp;</span> Setting
					</a></li>
				</ul>
			</li>
			
			<li><a href="adminlogin.jsp"><em class="fa fa-power-off">&nbsp;</em> Logout</a></li>
		</ul>
</div><!--/.sidebar-->
		
<div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">
		<div class="row">
			<ol class="breadcrumb">
				<li><a href="#">
					<em class="fa fa-home"></em>
				</a></li>
				<li class="active">Dashboard</li>
			</ol>
		</div><!--/.row-->
		
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Dashboard</h1>
			</div>
		</div><!--/.row-->
		
		<div class="panel panel-container">
			<div class="row">
				
				<div class="col-xs-6 col-md-3 col-lg-3 no-padding">
					<div class="panel panel-orange panel-widget border-right">
						<div class="row no-padding"><em class="fa fa-xl fa-users color-teal"></em>
							<div class="large"><% try { Connection con = DBconnect.getConnection();
														Statement st = con.createStatement();
														String sql = "SELECT COUNT(*) FROM customer";
														ResultSet rs = st.executeQuery(sql);
														String Countrow="";
														while(rs.next()){
															Countrow = rs.getString(1);
															out.println(Countrow);
															}} catch (Exception e){ e.printStackTrace();} %>
							</div>
							<div class="text-muted">Customers</div>
						</div>
					</div>
				</div>
				
				<div class="col-xs-6 col-md-3 col-lg-3 no-padding">
					<div class="panel panel-orange panel-widget border-right">
						<div class="row no-padding"><em class="fa fa-xl fa-users color-teal"></em>
							<div class="large"><% try { Connection con = DBconnect.getConnection();
														Statement st = con.createStatement();
														String sql = "SELECT COUNT(*) FROM customer";
														ResultSet rs = st.executeQuery(sql);
														String Countrow="";
														while(rs.next()){
															Countrow = rs.getString(1);
															out.println(Countrow);
															}} catch (Exception e){ e.printStackTrace();} %></div>
							<div class="text-muted">Employees</div>
						</div>
					</div>
				</div>
			
				<div class="col-xs-6 col-md-3 col-lg-3 no-padding">
					<div class="panel panel-teal panel-widget border-right">
						<div class="row no-padding"><em class="fa fa-xl fa-shopping-cart color-blue"></em>
							<div class="large"><% try { Connection con = DBconnect.getConnection();
														Statement st = con.createStatement();
														String sql = "SELECT COUNT(*) FROM orders";
														ResultSet rs = st.executeQuery(sql);
														String Countrow="";
														while(rs.next()){
															Countrow = rs.getString(1);
															out.println(Countrow);
															}} catch (Exception e){ e.printStackTrace();} %>
							</div>
							<div class="text-muted">Orders</div>
						</div>
					</div>
				</div>
				
				<div class="col-xs-6 col-md-3 col-lg-3 no-padding">
					<div class="panel panel-teal panel-widget border-right">
						<div class="row no-padding"><em class="fa fa-xl fa-shopping-cart color-blue"></em>
							<div class="large"><% try { Connection con = DBconnect.getConnection();
														Statement st = con.createStatement();
														String sql = "SELECT SUM(weight) FROM orders";
														ResultSet rs = st.executeQuery(sql);
														String Countrow="";
														while(rs.next()){
															Countrow = rs.getString(1);
															out.println(Countrow);
															}} catch (Exception e){ e.printStackTrace();} %>Kg
							</div>
							<div class="text-muted">Total Service Weight</div>
						</div>
					</div>
				</div>
				
				<div class="col-xs-6 col-md-3 col-lg-3 no-padding">
					<div class="panel panel-red panel-widget ">
						<div class="row no-padding"><em class="fa fa-xl fa-search color-red"></em>
							<div class="large">#NULL</div>
							<div class="text-muted">Total Delivery</div>
						</div>
					</div>
				</div>
				
				<div class="col-xs-6 col-md-3 col-lg-3 no-padding">
					<div class="panel panel-blue panel-widget border-right">
						<div class="row no-padding"><em class="fa fa-xl fa-bar-chart color-orange"></em>
							<div class="large"><% try { Connection con = DBconnect.getConnection();
														Statement st = con.createStatement();
														String sql = "SELECT COUNT(*) FROM payment";
														ResultSet rs = st.executeQuery(sql);
														String Countrow="";
														while(rs.next()){
															Countrow = rs.getString(1);
															out.println(Countrow);
															}} catch (Exception e){ e.printStackTrace();} %>
							</div>
							<div class="text-muted">Total Payment</div>
						</div>
					</div>
				</div>
				
				<div class="col-xs-6 col-md-3 col-lg-3 no-padding">
					<div class="panel panel-blue panel-widget border-right">
						<div class="row no-padding"><em class="fa fa-xl fa-bar-chart color-orange"></em>
							<div class="large">Rs. <% try { Connection con = DBconnect.getConnection();
														Statement st = con.createStatement();
														String sql = "SELECT SUM(totAmount) FROM payment";
														ResultSet rs = st.executeQuery(sql);
														String Countrow="";
														while(rs.next()){
															Countrow = rs.getString(1);
															out.println(Countrow);
															}} catch (Exception e){ e.printStackTrace();} %>
							</div>
							<div class="text-muted">Total Sale</div>
						</div>
					</div>
				</div>
				
			</div><!--/.row-->
		</div>
		
		<div class="row">
			<div class="col-md-12">
			</div>
		</div><!--/.row-->
		
		<!-- 
		<div class="row">
			<div class="col-xs-6 col-md-3">
				<div class="panel panel-default">
					<div class="panel-body easypiechart-panel">
						<h4>New Orders</h4>
						<div class="easypiechart" id="easypiechart-blue" data-percent="92" ><span class="percent">92%</span></div>
					</div>
				</div>
			</div>
			<div class="col-xs-6 col-md-3">
				<div class="panel panel-default">
					<div class="panel-body easypiechart-panel">
						<h4>Comments</h4>
						<div class="easypiechart" id="easypiechart-orange" data-percent="65" ><span class="percent">65%</span></div>
					</div>
				</div>
			</div>
			<div class="col-xs-6 col-md-3">
				<div class="panel panel-default">
					<div class="panel-body easypiechart-panel">
						<h4>New Users</h4>
						<div class="easypiechart" id="easypiechart-teal" data-percent="56" ><span class="percent">56%</span></div>
					</div>
				</div>
			</div>
			<div class="col-xs-6 col-md-3">
				<div class="panel panel-default">
					<div class="panel-body easypiechart-panel">
						<h4>Visitors</h4>
						<div class="easypiechart" id="easypiechart-red" data-percent="27" ><span class="percent">27%</span></div>
					</div>
				</div>
			</div>
		</div><!--/.row-->
		
		<div class="row">	
		
			<div class="col-md-6">
			</div><!--/.col-->
		
			<div class="col-sm-12">
			</div>
		
		</div><!--/.row-->
</div>	<!--/.main-->


<!-- 
	<h1>DASHBOARD</h1>
	<br><br><br>
	<table border="2" cellpadding="25">
		<tr>
			<th><a href="customerlist.jsp">Customers</a></th>
			<th><a href="registration.jsp">Add Customer</a></th>
		</tr>
	</table>
	<br>
	<br>
		<hr>
	<br>
	<br>
	<table border="2" cellpadding="25">
		<tr>
			<th><a href="">Employees</a></th>
			<th><a href="">Add Employee</a></th>
		</tr>
	</table>
	<br>
	<br>
		<hr>
	<br>
	<br>	
	<table border="2" cellpadding="25">
		<tr>
			<th><a href="paymentList.jsp">Payments</a></th>
			<th><a href="addPayment.jsp">Add Payment</a></th>
		</tr>
	</table>
	<br>
	<br>
		<hr>
	<br>
	<br>
	<table border="2" cellpadding="25">
		<tr>
			<th><a href="orderlist.jsp">Orders</a></th>
			<th><a href="order.jsp">Add Order</a></th>
		</tr>
	</table>
	<br>
	<br>
	 -->
	
<script src="CSS/AdminDashboard/js/jquery-1.11.1.min.js"></script>
	<script src="CSS/AdminDashboard/js/bootstrap.min.js"></script>
	<script src="CSS/AdminDashboard/js/chart.min.js"></script>
	<script src="CSS/AdminDashboard/js/chart-data.js"></script>
	<script src="CSS/AdminDashboard/js/easypiechart.js"></script>
	<script src="CSS/AdminDashboard/js/easypiechart-data.js"></script>
	<script src="CSS/AdminDashboard/js/bootstrap-datepicker.js"></script>
	<script src="CSS/AdminDashboard/js/custom.js"></script>
	<script>
		window.onload = function () {
	var chart1 = document.getElementById("line-chart").getContext("2d");
	window.myLine = new Chart(chart1).Line(lineChartData, {
	responsive: true,
	scaleLineColor: "rgba(0,0,0,.2)",
	scaleGridLineColor: "rgba(0,0,0,.05)",
	scaleFontColor: "#c5c7cc"
	});
	};
	</script>
</body>
</html>