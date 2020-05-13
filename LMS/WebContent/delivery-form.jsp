<%@ page import="com.lms.service.*" %>
<%@ page import="com.lms.model.*" %>
<%@ page import="java.sql.SQLException" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Delivery Form</title>
    <link rel="stylesheet" type="text/css" href="CSS/Delivery/delivery.css">
</head>

<body>
<%--<%--%>
<%-- DatabaseImpl db = new DatabaseImpl(); --%>
   
    <%--Order order = null;  --%>
   <%--  try {--%>
     <%--  order = db.GetSelecteOrder(1); --%> 
<%--%> --%>
<div id="ggif">
    <h3 id="del">Delivery</h3>
    <form name="deliveryForm" method="post" action="deliveryServlet">

        <div class="inputItem">
            <div class="inputLabel">
                Order ID
            </div>
            <div class="inputValue">
                <input type="number" name="orderId" value="" required disabled>
            </div>
        </div>

        <div class="inputItem">
            <div class="inputLabel">
                Location
            </div>
            <div class="inputValue">
                <input type="text" name="location" value="0" required >
            </div>
        </div>

        <div class="inputItem">
            <div class="inputLabel">
                Phone No
            </div>
            <div class="inputValue">
                <input type="number" name="phoneNo" value="0" required >
            </div>
        </div>

        <div class="inputItem">
            <div class="inputLabel">
                Email
            </div>
            <div class="inputValue">
                <input type="email" name="email" value="0" required >
            </div>
        </div>

        <div class="inputItem">
            <div class="inputLabel">
                Delivery Type
            </div>
            <div class="inputValue">
                <label>
                    <input type="radio" name="deliveryType" value="1" checked required >
                    Regular
                </label>
                <label>
                    <input type="radio" name="deliveryType" value="2"  required >
                    Express
                </label>
            </div>
        </div>

       <button type="submit" > Submit Delivery </button>
           
    </form>
</div>
<img id="gif" src="CSS/Delivery/gals3.gif">
<%--<%--%>
   <%-- }catch (SQLException throwables) {--%> 
       <%--  throwables.printStackTrace();--%>
  <%--   }--%>
<%---%>--%> 
</body>
</html>