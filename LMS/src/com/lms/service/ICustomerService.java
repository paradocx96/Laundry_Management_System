package com.lms.service;

import java.util.*;

import com.lms.model.Customer;

public interface ICustomerService {


    public void addCustomer(Customer customer);

    public ArrayList<Customer> listallcustomer();

    public Customer selectOneCustomerDetials(String user, String pass);

    public ArrayList<Customer> getCustomerDetials(String user, String pass);

    public boolean deleteCustomer(Customer customer);

    public boolean updateCustomerDetails(Customer cus);

    public ArrayList<Customer> selectCustomerById(int custId);

    public Customer selectCustomer(int custId);


}
