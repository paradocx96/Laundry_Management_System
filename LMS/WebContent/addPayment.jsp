<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Payment</title>
</head>
<body>
<header>
<a href="<%=request.getContextPath()%> /list">Payment</a>
</header>


<c:if test="${payment == null}">
<form action="insert" method="post">
</c:if>

<c:if test="${payment == null}"><h1>ADD PAYMENT</h1></c:if>
<br>
<br>
<br>
Order ID
<br>
<input type="text" value="<c:out value='${payment.orderid}' />" name="orderid"/>
<br>
<br>
Payment Amount
<br>
<input type="text" value="<c:out value='${payment.payamount}' />" name="payamount"/>
<br>
<br>
<button type="submit">Save</button>
</form>
</body>
</html>