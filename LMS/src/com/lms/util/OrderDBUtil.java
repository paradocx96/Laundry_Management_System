package com.lms.util;


import java.sql.*;
import java.util.*;
import com.lms.model.Order;


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
	
	
	
	public ArrayList<Order> getOrderDetails(){
		ArrayList<Order> ordRecSet = new ArrayList<Order>(); 
		try {
			
			Connection con = DBconnect.getConnection();
			Statement state = con.createStatement();
			 String sql="select * from orders";
			 ResultSet rs = state.executeQuery(sql);

			 while(rs.next()) {
				 Order ord = new Order();
						ord.setOrderId(rs.getInt(1));
						ord.setCustId(rs.getInt(2));
						ord.setWeight(rs.getDouble(3));
						ord.setOrderDate(rs.getString(4));
						ord.setDeliveryDate(rs.getString(5));
					
					ordRecSet.add(ord);
			 }
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return ordRecSet;
	}
}
