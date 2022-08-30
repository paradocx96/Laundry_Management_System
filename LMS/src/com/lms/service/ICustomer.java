package com.lms.service;

/*
 *  By IT19180526
 */

import java.util.ArrayList;

import com.lms.model.Customer;

public interface ICustomer {


    //Use for add new customer from administration
    public boolean addCustomer(Customer customer);


    //Use for get selected customer details
    public Customer selectCustomerByID(int custID);

    public ArrayList<Customer> selectCustomer(int custID);


    //Use for update selected customer details from administration
    public boolean updateCustomerAdmin(Customer customer);


    //Use for delete selected customer details from administration
    public boolean deleteCustomer(Customer customer);
}
