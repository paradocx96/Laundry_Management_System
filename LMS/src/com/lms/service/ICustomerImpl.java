package com.lms.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.lms.model.Customer;
import com.lms.util.DBconnect;

/*
 *  By IT19180526
 */

public class ICustomerImpl implements ICustomer {
	
	private static final String ADD_CUSTOMER_ADMIN = "INSERT INTO customer (firstName,lastName,address,email,phone,userName,password) VALUES (?,?,?,?,?,?,?);";
	private static final String GET_CUSTOMER_BY_ID = "SELECT * FROM customer WHERE custId = ?";
	private static final String UPDATE_CUSTOMER_ADMIN = "UPDATE customer SET firstName = ?,lastName= ?, address = ?, email = ?, phone = ?, userName = ?, password = ? where custId = ?;";
	

	@Override
	public Customer selectCustomerByID(int custID) {
		
		return selectCustomer(custID).get(0);
	}
	
	
	//Use for get selected customer details
	@Override
	public ArrayList<Customer> selectCustomer(int custID) { //By IT19180526
		ArrayList<Customer> selectedcustomer = new ArrayList<>();
		
		try (Connection connection = DBconnect.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(GET_CUSTOMER_BY_ID);) {
			
			preparedStatement.setInt(1,custID);
			ResultSet resultSet = preparedStatement.executeQuery();
			System.out.println(preparedStatement);
			
			while (resultSet.next()) {
				Customer customer = new Customer();
				
				customer.setCustId(resultSet.getInt("custId"));
				customer.setFirstName(resultSet.getString("firstName"));
				customer.setLastName(resultSet.getString("lastName"));
				customer.setEmail(resultSet.getString("email"));
				customer.setPhone(resultSet.getInt("phone"));
				customer.setAddress(resultSet.getString("address"));
				customer.setUserName(resultSet.getString("userName"));
		    	customer.setPassword(resultSet.getString("password"));
		    	
		    	selectedcustomer.add(customer);
											
			}		
			
		} catch (Exception e) {
			e.printStackTrace();			
		}
		
		return selectedcustomer;
	}


	@Override
	public boolean updateCustomerAdmin(Customer customer) { //By IT19180526
		boolean row = false;
		
		try (Connection connection = DBconnect.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_CUSTOMER_ADMIN))
		{
			preparedStatement.setString(1, customer.getFirstName());
			preparedStatement.setString(2, customer.getLastName());
			preparedStatement.setString(3, customer.getAddress());
			preparedStatement.setString(4, customer.getEmail());
			preparedStatement.setInt(5, customer.getPhone());
			preparedStatement.setString(6, customer.getUserName());
			preparedStatement.setString(7, customer.getPassword());
			preparedStatement.setInt(8, customer.getCustId());
			
			
			System.out.println(preparedStatement);
			
			row = preparedStatement.executeUpdate() > 0;
			
			preparedStatement.close();
			connection.close();	
			
		} catch(Exception e) {
			
		}
		
		return row;
	}


	@Override
	public boolean addCustomer(Customer customer) { //By IT19180526
		boolean out = false;
		
		try (Connection connection = DBconnect.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(ADD_CUSTOMER_ADMIN);) {
		
		preparedStatement.setString(1, customer.getFirstName());
		preparedStatement.setString(2, customer.getLastName());
		preparedStatement.setString(3, customer.getAddress());
		preparedStatement.setString(4, customer.getEmail());
		preparedStatement.setInt(5, customer.getPhone());
		preparedStatement.setString(6, customer.getUserName());
		preparedStatement.setString(7, customer.getPassword());
		int result = preparedStatement.executeUpdate();
		
		System.out.println(preparedStatement);
		
		if(result > 0) {
			out = true;
		} else {
			out = false;
		}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return out;
		
	}
	
	
	
}
