<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title> Delivery </title>
    <link rel="stylesheet" type="text/css" href="CSS/Delivery/delivery.css">
  </head>
  <body>
<h1>Laundry Management System</h1>

  <h1>Delivery</h1><a href="delivery-form.jsp">Add Delivery</a>
  
  <br><br>
  
  <form method=get action="./DeliveryDisplayServlet">
  <table>
  	<tr>
  		<td>Enter the ID: </td>
  		<td><input type="text" name="deliveryId"></td>
  	</tr>
  	<tr>
  		<td colspan="2"><input type="submit" value="Search"></td>
  	</tr>
  
  </table>
  
  </form>
  

    
  </body>
</html>

