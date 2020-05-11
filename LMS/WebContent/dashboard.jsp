<!DOCTYPE html>
<html lang="en">

<head>
	
	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" type="image/png" sizes="16x16" href="CSS/dashboard/plugins/images/favicon.png" type="text/css">
    
    <title>Dashboard</title>
    <!-- Bootstrap Core CSS -->
    <link href="CSS/dashboard/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <!-- Menu CSS -->
    <link href="CSS/dashboard/plugins/bower_components/sidebar-nav/dist/sidebar-nav.min.css" rel="stylesheet" type="text/css">
    <!-- toast CSS -->
    <link href="CSS/dashboard/plugins/bower_components/toast-master/css/jquery.toast.css" rel="stylesheet" type="text/css">
    <!-- morris CSS -->
    <link href="CSS/dashboard/plugins/bower_components/morrisjs/morris.css" rel="stylesheet" type="text/css">
    <!-- chartist CSS -->
    <link href="CSS/dashboard/plugins/bower_components/chartist-js/dist/chartist.min.css" rel="stylesheet" type="text/css">
    <link href="CSS/dashboard/plugins/bower_components/chartist-plugin-tooltip-master/dist/chartist-plugin-tooltip.css" rel="stylesheet" type="text/css">
    <!-- animation CSS -->
    <link href="CSS/dashboard/css/animate.css" rel="stylesheet" type="text/css">
    <!-- Custom CSS -->
    <link href="CSS/dashboard/css/style.css" rel="stylesheet" type="text/css">
    <!-- color CSS -->
    <link href="CSS/dashboard/css/colors/default.css" id="theme" rel="stylesheet" type="text/css">
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
<![endif]-->
</head>

<body class="fix-header">
    <!-- ============================================================== -->
    <!-- Preloader -->
    <!-- ============================================================== -->
    <div class="preloader">
        <svg class="circular" viewBox="25 25 50 50">
            <circle class="path" cx="50" cy="50" r="20" fill="none" stroke-width="2" stroke-miterlimit="10" />
        </svg>
    </div>
    <!-- ============================================================== -->
    <!-- Wrapper -->
    <!-- ============================================================== -->
    <div id="wrapper">
        <!-- ============================================================== -->
        <!-- Topbar header - style you can find in pages.scss -->
        <!-- ============================================================== -->
        <nav class="navbar navbar-default navbar-static-top m-b-0">
            <div class="navbar-header">
                <div class="top-left-part">
                    <!-- Logo -->
				<center><h4 style="color:#044fbf;font-family:; font-size:23px;"><u><b>	Laundry </b> <i>Services</i></u></h4></center> 
                    
                </div>
                <!-- /Logo -->
                <ul class="nav navbar-top-links navbar-right pull-right">
                    <li>
                        <a class="nav-toggler open-close waves-effect waves-light hidden-md hidden-lg" href="javascript:void(0)"><i class="fa fa-bars"></i></a>
                    </li>
                    <li>
                        <form role="search" class="app-search hidden-sm hidden-xs m-r-10">
                            <input type="text" placeholder="Search..." class="form-control"> 
                            <a href="">
                                <i class="fa fa-search"></i>
                            </a> 
                        </form>
                    </li>
                    <li>
                        <a class="profile-pic" href="#"> <img src="CSS/dashboard/plugins/images/users/varun.jpg" alt="user-img" width="36" class="img-circle"><b class="hidden-xs">Hirush</b></a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-header -->
            <!-- /.navbar-top-links -->
            <!-- /.navbar-static-side -->
        </nav>
        <!-- End Top Navigation -->
        <!-- ============================================================== -->
        <!-- Left Sidebar - style you can find in sidebar.scss  -->
        <!-- ============================================================== -->
        <div class="navbar-default sidebar" role="navigation">
            <div class="sidebar-nav slimscrollsidebar">
                <div class="sidebar-head">
                    <h3><span class="fa-fw open-close"><i class="ti-close ti-menu"></i></span> <span class="hide-menu">Navigation</span></h3>
                </div>
                <ul class="nav" id="side-menu">
                    <li style="padding: 70px 0 0;">
                        <a href="dashboard.jsp" class="waves-effect"><i class="fa fa-clock-o fa-fw" aria-hidden="true"></i>Dashboard</a>
                    </li>
                    <li>
                      <a href="customerEditBios.jsp" class="waves-effect"><i class="fa fa-user fa-fw" aria-hidden="true"></i> <b> Edit Profile  </b></a>
                    </li>
                    <li>
                        <a href="order.jsp" class="waves-effect"><i class="fa fa-table fa-fw" aria-hidden="true"></i> <b>Order </b></a>
                    </li>
                    <li>
                        <a href="editPaymentCustomer.jsp" class="waves-effect"><i class="fa fa-font fa-fw" aria-hidden="true"></i> <b>Payment </b></a>
                    </li>
                    <li>
                        <a href="map-google.html" class="waves-effect"><i class="fa fa-globe fa-fw" aria-hidden="true"></i>  <b> Google Map  </b></a>
                    </li>
                    <li>
                        <a href="blank.html" class="waves-effect"><i class="fa fa-columns fa-fw" aria-hidden="true"></i> <b>Contact us </b></a>
                    </li>
                    <li>
                        <a href="404.html" class="waves-effect"><i class="fa fa-info-circle fa-fw" aria-hidden="true"></i>  <b>More info </b></a>
                    </li>

                </ul>
                
            </div>
            
        </div>
        <!-- ============================================================== -->
        <!-- End Left Sidebar -->
        <!-- ============================================================== -->
        <!-- ============================================================== -->
        <!-- Page Content -->
        <!-- ============================================================== -->
        <div id="page-wrapper">
            <div class="container-fluid">
                <div class="row bg-title">
                    <div class="col-lg-3 col-md-4 col-sm-4 col-xs-12">
                        <h4 class="page-title">Dashboard</h4> </div>
                    <div class="col-lg-9 col-sm-8 col-md-8 col-xs-12">
                        
                     
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                <!-- /.row -->
                <!-- ============================================================== -->
                <!-- Different data widgets -->
                <!-- ============================================================== -->
                <!-- .row -->
                <div class="row">
                    <div class="col-lg-4 col-sm-6 col-xs-12">
                        <div class="white-box analytics-info">
                            <h3 class="box-title">Total Orders</h3>
                            <ul class="list-inline two-part">
                                <li>
                                    <div id="sparklinedash"></div>
                                </li>
                                <li class="text-right"><i class="ti-arrow-up text-success"></i> <span class="counter text-success">12</span></li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-lg-4 col-sm-6 col-xs-12">
                        <div class="white-box analytics-info">
                            <h3 class="box-title">Total Delievries</h3>
                            <ul class="list-inline two-part">
                                <li>
                                    <div id="sparklinedash2"></div>
                                </li>
                                <li class="text-right"><i class="ti-arrow-up text-purple"></i> <span class="counter text-purple">9</span></li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-lg-4 col-sm-6 col-xs-12">
                        <div class="white-box analytics-info">
                            <h3 class="box-title">Total Visits</h3>
                            <ul class="list-inline two-part">
                                <li>
                                    <div id="sparklinedash3"></div>
                                </li>
                                <li class="text-right"><i class="ti-arrow-up text-info"></i> <span class="counter text-info">25</span></li>
                            </ul>
                        </div>
                    </div>
                </div>
                <!--/.row -->
                <!--row -->
                <!-- /.row -->
                <div class="row">
                    
                </div>
                <!-- ============================================================== -->
                <!-- table -->
                <!-- ============================================================== -->
                <div class="row">
                   
                </div>
                <!-- ============================================================== -->
                <!-- chat-listing & recent comments -->
                <!-- ============================================================== -->
                <div class="row">
                    <!-- .col -->
                    
                    
                    <!-- /.col -->
                </div>
            </div>
            <!-- /.container-fluid -->
            <footer class="footer text-center">  <b> - Laundry Management System -</b> </footer>
        </div>
        <!-- ============================================================== -->
        <!-- End Page Content -->
        <!-- ============================================================== -->
    </div>
    <!-- ============================================================== -->
    <!-- End Wrapper -->
    <!-- ============================================================== -->
    <!-- ============================================================== -->
    <!-- All Jquery -->
    <!-- ============================================================== -->
    <script src="CSS/dashboard/plugins/bower_components/jquery/dist/jquery.min.js"></script>
    <!-- Bootstrap Core JavaScript -->
    <script src="CSS/dashboard/bootstrap/dist/js/bootstrap.min.js"></script>
    <!-- Menu Plugin JavaScript -->
    <script src="CSS/dashboard/plugins/bower_components/sidebar-nav/dist/sidebar-nav.min.js"></script>
    <!--slimscroll JavaScript -->
    <script src="CSS/dashboard/js/jquery.slimscroll.js"></script>
    <!--Wave Effects -->
    <script src="CSS/dashboard/js/waves.js"></script>
    <!--Counter js -->
    <script src="CSS/dashboard/plugins/bower_components/waypoints/lib/jquery.waypoints.js"></script>
    <script src="CSS/dashboard/plugins/bower_components/counterup/jquery.counterup.min.js"></script>
    <!-- chartist chart -->
    <script src="CSS/dashboard/plugins/bower_components/chartist-js/dist/chartist.min.js"></script>
    <script src="CSS/dashboard/plugins/bower_components/chartist-plugin-tooltip-master/dist/chartist-plugin-tooltip.min.js"></script>
    <!-- Sparkline chart JavaScript -->
    <script src="CSS/dashboard//plugins/bower_components/jquery-sparkline/jquery.sparkline.min.js"></script>
    <!-- Custom Theme JavaScript -->
    <script src="CSS/dashboard/js/custom.min.js"></script>
    <script src="CSS/dashboard/js/dashboard1.js"></script>
   <script src="CSS/dashboard/plugins/bower_components/toast-master/js/jquery.toast.js"></script>
</body>

</html>
