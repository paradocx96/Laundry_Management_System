package com.lms.util;

/*
 *  By IT19180526
 */

public class PaymentQuery {
	
	
	//SQL query syntax - Create payment
	public static final String CREATE_PAYMENT = "INSERT INTO payment (orderID,payType,totAmount,description) VALUES (?,?,?,?);";
	
	//SQL query syntax - Get all payment details 
	public static final String GET_ALL_PAYMENT = "SELECT * FROM payment;";
	
	//SQL query syntax - Get selected payment details 
	public static final String GET_PAYMENT_BY_ID = "SELECT * FROM payment WHERE paymentID = ?;";
	
	//SQL query syntax - Update selected payment details by administration
	public static final String UPDATE_PAYMENT_ADMIN = "UPDATE payment SET orderID = ?, totAmount = ?, payType = ?, description = ?, dateTime = ? WHERE paymentID = ?;";
	
	//SQL query syntax - Customer update selected payment details by relevant order 
	public static final String UPDATE_PAYMENT_CUSTOMER = "UPDATE payment SET payType = ?, description = ?, dateTime = ? WHERE orderID = ?;";
	
	//SQL query syntax - Delete selected payment
	public static final String DELETE_PAYMENT_SQL = "DELETE FROM payment WHERE paymentID = ?;";
	
	//SQL query syntax - Get payment details by relevant order
	public static final String GET_PAYMENT_BY_ORDER_ID = "SELECT * FROM payment WHERE orderID = ?;";
	
	
}
