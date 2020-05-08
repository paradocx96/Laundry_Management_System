<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Payment</title>
</head>
<body>
	<form action="" method="post">
		<table>
			<tr>
			<td>Payment ID</td>
			<td></td>
			<td><input type="text" name="payid" readonly="readonly"></td>
			</tr>
			<tr>
			<td>Oder ID</td>
			<td></td>
			<td><input type="text" name="oderid" readonly="readonly"></td>
			</tr>
			<tr>
			<td>Payment Amount</td>
			<td></td>
			<td><input type="text" name="payamount" readonly="readonly"></td>
			</tr>
			<tr>
			<td>Payment Type</td>
			<td></td>
			<td><input type="radio" name="paytype" value="Cash on Delivery"><i>Cash on Delivery</i><br>
				<input type="radio" name="paytype" value="Card Payment"><i>Card Payment</i></td>
			</tr>
			<tr>
			<td>Description</td>
			<td></td>
			<td><input type="text" name="description"></td>
			</tr>
			<tr>
			<td>Date</td>
			<td></td>
			<td><input type="text" name="date" readonly="readonly"></td>
			</tr>
			<tr>
			<td></td>
			<td></td>
			<td><input type="submit" name="submit" value="PAY"></td>
			</tr>
		</table>
	</form>

</body>
</html>