package com.lms.service;

/*
 *  By IT19180526
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.lms.model.Customer;
import com.lms.util.CustomerAdminQuery;
import com.lms.util.CustomerAdminConstants;
import com.lms.util.DBconnect;


public class ICustomerImpl implements ICustomer {
	
		
	//Use for add new customer from administration 
	@Override
	public boolean addCustomer(Customer customer) { //By_IT19180526
		boolean out = false;
		
		try (Connection connection = DBconnect.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(CustomerAdminQuery.ADD_CUSTOMER_ADMIN);) {
			
			
			preparedStatement.setString(CustomerAdminConstants.COLUMN_ONE, customer.getFirstName());
			preparedStatement.setString(CustomerAdminConstants.COLUMN_TWO, customer.getLastName());
			preparedStatement.setString(CustomerAdminConstants.COLUMN_THREE, customer.getAddress());
			preparedStatement.setString(CustomerAdminConstants.COLUMN_FOUR, customer.getEmail());
			preparedStatement.setInt(CustomerAdminConstants.COLUMN_FIVE, customer.getPhone());
			preparedStatement.setString(CustomerAdminConstants.COLUMN_SIX, customer.getUserName());
			preparedStatement.setString(CustomerAdminConstants.COLUMN_SEVEN, customer.getPassword());
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
	
	
	
	//Use for get selected customer details
	@Override
	public Customer selectCustomerByID(int custID) {
			
		return selectCustomer(custID).get(0);
	}
		
		
		
	//Use for get selected customer details
	@Override
	public ArrayList<Customer> selectCustomer(int custID) { //By_IT19180526
		ArrayList<Customer> selectedcustomer = new ArrayList<>();
		
		try (Connection connection = DBconnect.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(CustomerAdminQuery.GET_CUSTOMER_BY_ID);) {
			
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
	
	
	
	//Use for update selected customer details from administration	
	@Override
	public boolean updateCustomerAdmin(Customer customer) { //By_IT19180526
		boolean row = false;
		
		try (Connection connection = DBconnect.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(CustomerAdminQuery.UPDATE_CUSTOMER_ADMIN))
		{
			preparedStatement.setString(CustomerAdminConstants.COLUMN_ONE, customer.getFirstName());
			preparedStatement.setString(CustomerAdminConstants.COLUMN_TWO, customer.getLastName());
			preparedStatement.setString(CustomerAdminConstants.COLUMN_THREE, customer.getAddress());
			preparedStatement.setString(CustomerAdminConstants.COLUMN_FOUR, customer.getEmail());
			preparedStatement.setInt(CustomerAdminConstants.COLUMN_FIVE, customer.getPhone());
			preparedStatement.setString(CustomerAdminConstants.COLUMN_SIX, customer.getUserName());
			preparedStatement.setString(CustomerAdminConstants.COLUMN_SEVEN, customer.getPassword());
			preparedStatement.setInt(CustomerAdminConstants.COLUMN_EIGHT, customer.getCustId());
			
			
			System.out.println(preparedStatement);
			
			row = preparedStatement.executeUpdate() > 0;
			
			preparedStatement.close();
			connection.close();	
			
		} catch(Exception e) {
			
		}
		
		return row;
	}
	
	
	
	//Use for delete selected customer details from administration
	@Override
	public boolean deleteCustomer(Customer customer) { //By_IT19180526
		boolean result = false;
		
		try (Connection connection = DBconnect.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(CustomerAdminQuery.DELETE_CUSTOMER_ADMIN);) {
			
			preparedStatement.setInt(1, customer.getCustId());
			result = preparedStatement.executeUpdate() > 0;
			
			System.out.println(preparedStatement);
			
			preparedStatement.close();
			connection.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	
	
}
