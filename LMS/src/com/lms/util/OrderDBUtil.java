package com.lms.util;

import java.sql.*;

import com.lms.util.DBconnect;

public class OrderDBUtil {

	public static boolean insertOrder(String orderId, String custId, String weight, String orderDate, String deliveryDate) {
		
		boolean isSuccess=false;
		
		try {
			
			Connection con = DBconnect.getConnection();
			Statement state = con.createStatement();
			
			String sql="insert into orders values(0,'" + custId + "','" + weight + "','" + orderDate + "','" + deliveryDate + "');";
			int rs = state.executeUpdate(sql);
    		
    		if(rs > 0) {
    			isSuccess = true;
    		} else {
    			isSuccess = false;
    		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
		
	}
}
