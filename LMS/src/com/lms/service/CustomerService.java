package com.lms.service;

import java.io.*;
import java.sql.*;
import java.util.*;

import com.lms.model.Customer;
import com.lms.util.DBconnect;

public class CustomerService {
	
	private static final String ADD_NEW_CUSTOMER = "INSERT INTO customer" + "(firstName,lastName,address,email,phone,userName,password) VALUES" + "(?,?,?,?,?,?,?);";
	private static final String UPDATE_USERS_SQL = "UPDATE customer SET firstName = ?,lastName= ?, address = ?, email = ?, phone = ? where custId = ?;";
	private static final String LIST_OF_CUSTOMERS = "SELECT * FROM customer";
	
	public CustomerService () {
		
	}
	
	public void addCustomer(Customer customer) throws SQLException{
		
		try (Connection connection = DBconnect.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(ADD_NEW_CUSTOMER)) {
					
			preparedStatement.setString(1, customer.getFirstName());
			preparedStatement.setString(2, customer.getLastName());
			preparedStatement.setString(3, customer.getAddress());
			preparedStatement.setString(4, customer.getEmail());
			preparedStatement.setInt(5, customer.getPhone());
			preparedStatement.setString(6, customer.getUserName());
			preparedStatement.setString(7, customer.getPassword());
			preparedStatement.executeUpdate();
			
			System.out.println(preparedStatement);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
	public static List<Customer> listallcustomer() throws SQLException {
		
		List<Customer> listCustomer = new ArrayList<>();
		
		Connection connection = DBconnect.getConnection();
		Statement statement = connection.createStatement();
		ResultSet resultset = statement.executeQuery(LIST_OF_CUSTOMERS);
		
		System.out.println(resultset);
		
		while (resultset.next()) {
			int custId = Integer.parseInt(resultset.getString("custId"));
			String firstName = resultset.getString("firstName");
			String lastName = resultset.getString("lastName");
			String address = resultset.getString("address");
			String email = resultset.getString("email");
			int phone = Integer.parseInt(resultset.getString("phone"));
			String userName = resultset.getString("userName");
			String password = resultset.getString("password");
			
			Customer customer = new Customer(custId, firstName, lastName, email, phone, address, userName, password);
			listCustomer.add(customer);
									
			}
		
		resultset.close();
		statement.close();
		
		return listCustomer;
	}
	
	
	public static List<Customer> getCustomerDetials(String user, String pass) {
			
		ArrayList<Customer> cus = new ArrayList<>();	
		
		
		try { 
			
			Connection con = DBconnect.getConnection();
			Statement state = con.createStatement();   
			String sql = "select * from customer where userName ='"+user+"' and password='"+pass+"'";
			System.out.println(sql);
			ResultSet result = state.executeQuery(sql);
			System.out.print(result);
	
			    
			    while(result.next()) {
			    	
			    	int Id = result.getInt("custId"); //custId
			    	String firstname = result.getString("firstName"); //firstName
			    	String lastname = result.getString("lastName"); //lastName
			    	String email = result.getString("email"); //email
			    	int phone = result.getInt("phone"); //phone
			    	String address = result.getString("address"); //address
			    	String username = result.getString("userName"); //userName
			    	String passwrd = result.getString("password"); //password */
			    	
			    	System.out.print( result.getString("custId")+""+result.getString("firstName")+""+ result.getString("lastName")+""+result.getString("email")+""+result.getString("phone")+""+result.getString("address")+""+result.getString("userName")+""+result.getString("password"));	
					  
			    	
			    	Customer displayCus = new Customer(Id, firstname, lastname, email, phone, address, username, passwrd);
			    	
			
				cus.add(displayCus);
				
			    }
			    
			}
			catch(Exception e) {
			    e.printStackTrace();
			}
			
		return cus;
			
		 }
		    
	public boolean updateCustomerDetails(Customer cus) throws SQLException {
			
			boolean rowUpdate;
			
			try (Connection connection = DBconnect.getConnection();
					PreparedStatement statement = connection.prepareStatement(UPDATE_USERS_SQL))
			{
				
						
				statement.setString(1, cus.getFirstName());
				statement.setString(2, cus.getLastName());
				statement.setString(3, cus.getAddress());
				statement.setString(4, cus.getEmail());
				statement.setInt(5, cus.getPhone());
				statement.setInt(6, cus.getCustId());
				
				System.out.println(statement);
				
				rowUpdate = statement.executeUpdate() > 0;
				
			} 
			
			return rowUpdate;
		}
		
	
}
