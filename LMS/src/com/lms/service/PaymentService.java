package com.lms.service;

import java.util.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;
import java.io.*;
import java.util.ArrayList;
import com.mysql.*;

import com.lms.model.Payment;
import com.lms.util.DBconnect;

public class PaymentService {
	
	private static final String REQUEST_PAYMENT_SQL = "INSERT INTO payment" + "(orderID,totAmount) VALUES" + "(?,?);";
	private static final String GET_PAYMENT_BY_ID = "SELECT paymentID,orderID,payType,totAmount,description,dateTime FROM payment WHERE paymentID = ?;";
	private static final String GET_ALL_PAYMENT = "SELECT * FROM payment;";
	private static final String DELETE_PAYMENT_SQL = "DELETE FROM payment WHERE paymentID = ?;";
	private static final String UPDATE_TOT_AMOUNT_SQL = "UPDATE payment SET totAmount = ? WHERE paymentID = ?;";

	public PaymentService() {
		
	}
	
	public void addPayment(Payment payment) throws SQLException{
		
		try (Connection connection = DBconnect.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(REQUEST_PAYMENT_SQL)) {
					
			preparedStatement.setString(1, payment.getOrderID());
			preparedStatement.setDouble(2, payment.getPayAmount());
			preparedStatement.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

}
