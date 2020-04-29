package com.lms.util;
import java.sql.*;

public class OrderDBUtil {

	public static boolean insertOrder(String orderId, String custId, String weight, String orderDate, String deliveryDate) {
		
		boolean isSuccess=false;
		
		//database connection
		String url = "jdbc.mysql://localhost:3306/lms";
		String user = "root";
		String password="LMS1234#";
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url,user,password);
			Statement stmt = con.createStatement();
			String sql="insert into orders values(0,'"+custId+"','"+weight+"','"+orderDate+"','"+deliveryDate+"')";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess=true;
			}
			else {
				isSuccess=false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
		
	}
}
