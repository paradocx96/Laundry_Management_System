package com.lms.util;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class CustomerDBUtil {

	public static void validate(String userName, String password) {
	

	
	//validate username and password
	/*try {
		
		
		Connection con = DBconnect.getConnection();
		Statement state = con.createStatement();  
		String sql = "select * from customer where userName='"+userName+"'and password='"+password+"'";
		ResultSet result = state.executeQuery(sql);
		
		if(result.next())
			
			JOptionPane.showConfirmDialog(null,"Login Sucessfull !!!");
			
		else
			JOptionPane.showConfirmDialog(null,"Login Unsucessfuull !!!");
			
		con.close();
			
	}
	catch(Exception e) {
		
		e.printStackTrace();
		
	}
	
	*/
	}
	
	
}
