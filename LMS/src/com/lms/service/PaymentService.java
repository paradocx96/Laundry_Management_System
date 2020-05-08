package com.lms.service;

import java.util.*;
import java.sql.*;
import java.io.*;
import java.util.ArrayList;
import com.mysql.*;

import com.lms.model.Payment;
import com.lms.util.DBconnect;

public class PaymentService {
	
	private static final String GET_PAY_BY_ID = "SELECT paymentID,orderID,payType,totAmount,description,dateTime FROM payment WHERE paymentID = ?;";
	private static final String GET_ALL_PAYMENT = "SELECT * FROM payment;";
	private static final String GET_PAYMENT_BY_ID = "SELECT * FROM payment WHERE paymentID = ?;";
	private static final String GET_PAY_BY_ID_ADMIN = "SELECT paymentID,orderID,payType,totAmount,description,dateTime FROM payment WHERE paymentID = ?;";
	private static final String DELETE_PAYMENT_SQL = "DELETE FROM payment WHERE paymentID = ?;";
	private static final String UPDATE_PAYMENT_CUSTOMER = "UPDATE payment SET payType = ?, description = ? WHERE paymentID = ?;";
	private static final String UPDATE_PAYMENT_ADMIN = "UPDATE payment SET orderID = ?, totAmount = ?, payType = ?, description = ?, dateTime = ? WHERE paymentID = ?;";
	
	private static Connection connection = null;
	private static Statement statement = null;
	

	public PaymentService() {
		
	}
	
	
	public static boolean insertPayment (String oderid, double payamount) {
		boolean isSuccess = false;
		
		try {
			connection = DBconnect.getConnection();
			statement = connection.createStatement();
			String sql = "INSERT INTO payment (orderID,totAmount) values ('" + oderid + "','" + payamount + "')";
			int rs = statement.executeUpdate(sql);
			System.out.println(sql);
			
			if(rs > 0) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	/*
	public static Payment selectPayment(int payID) {
		Payment payment = null;
		
		try (Connection connection = DBconnect.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(GET_PAYMENT_BY_ID);) {
			
			preparedStatement.setInt(1,payID);
			
			System.out.println(preparedStatement);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				String orderid = resultSet.getString("orderID");
				String date = resultSet.getString("dateTime");
				String type = resultSet.getString("payType");
				String desc = resultSet.getString("description");
				double amount = resultSet.getDouble("totAmount");
				
				payment = new Payment(payID, orderid, date, type, desc, amount);
				
				
				
			}
						
		} catch (SQLException e) {
			printSQLException(e);
		}
		
		return payment;
		
	}*/
	
	public static List<Payment> selectPayment(int payID) {
		
		ArrayList<Payment> payment = new ArrayList<>();
		
		try (Connection connection = DBconnect.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(GET_PAY_BY_ID_ADMIN);) {
			
			preparedStatement.setInt(1,payID);
			System.out.println(preparedStatement);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				String orderid = resultSet.getString("orderID");
				String date = resultSet.getString("dateTime");
				String type = resultSet.getString("payType");
				String desc = resultSet.getString("description");
				double amount = resultSet.getDouble("totAmount");
				
				Payment showPayment = new Payment(payID, orderid, date, type, desc, amount);
				
				payment.add(showPayment);
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		return payment;
		
	}
	
	public static List<Payment> selectAllPayment() {
		
		List<Payment> payments = new ArrayList<>();
		
		try (Connection connection = DBconnect.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_PAYMENT);) {
			System.out.println(preparedStatement);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				int pid = resultSet.getInt("paymentID");
				String orderid = resultSet.getString("orderID");
				String date = resultSet.getString("dateTime");
				String type = resultSet.getString("payType");
				String desc = resultSet.getString("description");
				double amount = resultSet.getDouble("totAmount");
				
				payments.add(new Payment(pid, orderid, date, type, desc, amount));
			}
			
		} catch (SQLException e) {
			printSQLException(e);
		}	
		
		return payments;
	}
	
	
	public static boolean deletePayment (Payment payment) {
		
		boolean rowDelete = false;
		
		try (Connection connection = DBconnect.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(DELETE_PAYMENT_SQL);) {
			
			preparedStatement.setInt(1, payment.getPaymentID());
			rowDelete = preparedStatement.executeUpdate() > 0;
			System.out.println(preparedStatement);
			preparedStatement.close();
			connection.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rowDelete;

	}
	
	
	public static boolean updatePaymentAdmin (Payment payment) {
		boolean rowUpdate = false;
		
		try (Connection connection = DBconnect.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_PAYMENT_ADMIN);) {
			
			preparedStatement.setString(1, payment.getOrderID());
			preparedStatement.setDouble(2, payment.getPayAmount());
			preparedStatement.setString(3, payment.getPaymentType());
			preparedStatement.setString(4, payment.getDescription());
			preparedStatement.setString(5, payment.getPaymentDate());
			preparedStatement.setInt(6, payment.getPaymentID());
			
			rowUpdate = preparedStatement.executeUpdate() > 0;
			
			System.out.println(preparedStatement);
			
			preparedStatement.close();
			connection.close();			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rowUpdate;
	}
	
	
	private static void printSQLException(SQLException ex) {
		for (Throwable e : ex) {
			if (e instanceof SQLException) {
				e.printStackTrace(System.err);
				System.err.println("SQLState: " + ((SQLException) e).getSQLState());
				System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
				System.err.println("Message: " + e.getMessage());
				Throwable t = ex.getCause();
				while (t != null) {
					System.out.println("Cause: " + t);
					t = t.getCause();
				}
			}
		}
	}
	
	

}
