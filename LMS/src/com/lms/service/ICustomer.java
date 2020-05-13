package com.lms.service;

import java.util.ArrayList;

import com.lms.model.Customer;

public interface ICustomer {
	
	
	public boolean addCustomer(Customer customer);
	
	
	public Customer selectCustomerByID(int custID);	
	public ArrayList<Customer> selectCustomer(int custID);
	
	
	public boolean updateCustomerAdmin(Customer customer);
	

}
