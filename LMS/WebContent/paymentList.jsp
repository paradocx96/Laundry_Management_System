<!-- By IT19180526 -->
<!DOCTYPE html>
<html>
<head>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="com.lms.model.Payment" %>
<%@ page import="com.lms.util.*" %>
<%@ page import="com.lms.service.*" %>
<%@ page import="com.lms.service.IPaymentService" %>
<%@ page import="com.lms.service.PaymentServiceImpl" %>

<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.*" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<meta name="viewport" content="width=device-width, initial-scale=1">

<link href="CSS/payment/css/main.css" rel="stylesheet" type="text/css">
<link href="CSS/payment/css/util.css" rel="stylesheet" type="text/css">
<link href="CSS/payment/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css">
<link href="CSS/payment/fonts/font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
<link href="CSS/payment/vendor/animate/animate.css" rel="stylesheet" type="text/css">
<link href="CSS/payment/vendor/select2/select2.min.css" rel="stylesheet" type="text/css">
<link href="CSS/payment/vendor/perfect-scrollbar/perfect-scrollbar.css" type="text/css">

<title>Payment Management</title>

</head>
<body>

<div class="limiter">
<div class="container-table100">
<div class="wrap-table100">
<div class="table100">

<h1>Payment History</h1>

<div id="buttons">
	<a href="admindashboard.jsp" style="border-radius: 5px;  
  							padding: 5px 10px; 
  							font-size: 22px;  
  							text-decoration: none;  
  							margin: 20px;  
  							color: #fff;  
  							position: relative;  
  							display: inline-block;
  							background-color: #9b59b6;
  							box-shadow: 0px 5px 0px 0px #82409D;" >DASHBOARD</a>
  	<a href="addPayment.jsp" style="border-radius: 5px;  
  							padding: 5px 10px; 
  							font-size: 22px;  
  							text-decoration: none;  
  							margin: 20px;  
  							color: #fff;  
  							position: relative;  
  							display: inline-block;
  							background-color: #9b59b6;
  							box-shadow: 0px 5px 0px 0px #82409D;" >ADD NEW PAYMENT</a>
</div>
<table>
<thead>
	<tr class="table100-head">
	<th>Payment ID</th>
	<th>Order No</th>
	<th>Payment Amount</th>			
    <th>Payment Type</th>
    <th>Description</th>
    <th>Payment Date</th>
    <th>View</th>
    <th>Edit</th>
    <th>Delete</th>
    </tr>
</thead>
       	<tbody>
       	<%
			IPaymentService iPaymentService = new PaymentServiceImpl();
			ArrayList<Payment> paymentList = iPaymentService.selectAllPayment();
			for(Payment payment : paymentList) {
		%>
			<tr>
				<td><%=payment.getPaymentID() %></td>
				<td><%=payment.getOrderID() %></td>
				<td>Rs. <%=payment.getPayAmount() %></td>
				<td><%=payment.getPaymentType() %></td>
				<td><%=payment.getDescription() %></td>
				<td><%=payment.getPaymentDate() %></td>
				<td><a href= "ViewPayment?paymentID=<%=payment.getPaymentID() %>" >View</a></td>
				<td><a href= "editPaymentAdmin?paymentID=<%=payment.getPaymentID() %>" >Edit</a></td>
				<td><a href= "deletePayment?paymentID=<%=payment.getPaymentID() %>" >Delete</a></td>
			</tr>
		<%
			}
		%>
		</tbody> 
</table>
</div>
</div>
</div>
</div>

</body>
</html>