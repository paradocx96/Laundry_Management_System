package com.lms.util;

/*
 *  By IT19180526
 */

public class CustomerAdminQuery {


    //SQL query syntax - Add new customer by administration
    public static final String ADD_CUSTOMER_ADMIN = "INSERT INTO customer (firstName,lastName,address,email,phone,userName,password) VALUES (?,?,?,?,?,?,?);";

    //SQL query syntax - Get selected customer details by administration
    public static final String GET_CUSTOMER_BY_ID = "SELECT * FROM customer WHERE custId = ?";

    //SQL query syntax - Update selected customer details by administration
    public static final String UPDATE_CUSTOMER_ADMIN = "UPDATE customer SET firstName = ?,lastName= ?, address = ?, email = ?, phone = ?, userName = ?, password = ? where custId = ?;";

    //SQL query syntax - Delete selected customer
    public static final String DELETE_CUSTOMER_ADMIN = "DELETE FROM customer WHERE custId = ?;";


}
