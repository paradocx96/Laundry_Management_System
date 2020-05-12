package com.lms.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.lms.model.Payment;
import com.lms.util.DBconnect;

public class PaymentServiceImpl implements IPaymentService {
	
	private static final String CREATE_PAYMENT = "INSERT INTO payment (orderID,payType,totAmount,description) VALUES (?,?,?,?);";
	private static final String GET_ALL_PAYMENT = "SELECT * FROM payment;";
	private static final String GET_PAYMENT_BY_ID = "SELECT * FROM payment WHERE paymentID = ?;";
	private static final String UPDATE_PAYMENT_ADMIN = "UPDATE payment SET orderID = ?, totAmount = ?, payType = ?, description = ?, dateTime = ? WHERE paymentID = ?;";
	private static final String DELETE_PAYMENT_SQL = "DELETE FROM payment WHERE paymentID = ?;";
	private static final String GET_PAYMENT_BY_ORDER_ID = "SELECT * FROM payment WHERE orderID = ?;";

	@Override
	public boolean addPayment(Payment payment) {
		boolean isSuccess = false;
		
		try (Connection connection = DBconnect.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(CREATE_PAYMENT)) {
			
			preparedStatement.setString(1, payment.getOrderID());
			preparedStatement.setString(2, payment.getPaymentType());
			preparedStatement.setDouble(3, payment.getPayAmount());
			preparedStatement.setString(4, payment.getDescription());
			int result = preparedStatement.executeUpdate();
			
			System.out.println(preparedStatement);
			
			if(result > 0) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	
	
	@Override
	public Payment selectPaymentByID(int payid) {
		
		return selectPayment(payid).get(0);
	}

	
	
	@Override
	public ArrayList<Payment> selectPayment(int payID) {
		ArrayList<Payment> selectpayment = new ArrayList<>();
		
		try (Connection connection = DBconnect.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(GET_PAYMENT_BY_ID);) {
			
			preparedStatement.setInt(1,payID);
			System.out.println(preparedStatement);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				Payment payment = new Payment();
				
				payment.setPaymentID(resultSet.getInt("paymentID"));
				payment.setOrderID(resultSet.getString("orderID"));
				payment.setPaymentDate(resultSet.getString("dateTime"));
				payment.setPaymentType(resultSet.getString("payType"));
				payment.setDescription(resultSet.getString("description"));
				payment.setPayAmount(resultSet.getDouble("totAmount"));
				
				selectpayment.add(payment);
				
			}
						
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
		return selectpayment;
	}

	
	
	@Override
	public Payment selectPaymentOrder(String orderID) {
		
		return PaymentByOrderId(orderID).get(0);
	}
	
	
	
	@Override
	public ArrayList<Payment> PaymentByOrderId(String orderID) {
		ArrayList<Payment> selectOrderPayment = new ArrayList<>();
		
		try (Connection connection = DBconnect.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(GET_PAYMENT_BY_ORDER_ID);) {
			
			preparedStatement.setString(1,orderID);
			System.out.println(preparedStatement);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				Payment payment = new Payment();
				
				payment.setPaymentID(resultSet.getInt("paymentID"));
				payment.setOrderID(resultSet.getString("orderID"));
				payment.setPaymentDate(resultSet.getString("dateTime"));
				payment.setPaymentType(resultSet.getString("payType"));
				payment.setDescription(resultSet.getString("description"));
				payment.setPayAmount(resultSet.getDouble("totAmount"));
				
				selectOrderPayment.add(payment);
			}
						
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return selectOrderPayment;
	}

	
	
	@Override
	public ArrayList<Payment> selectAllPayment() {
		
		ArrayList<Payment> paymentlist = new ArrayList<Payment>();
		
		try (Connection connection = DBconnect.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_PAYMENT);) {
			
			System.out.println(preparedStatement);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				Payment payment = new Payment();
				
				payment.setPaymentID(resultSet.getInt("paymentID"));
				payment.setOrderID(resultSet.getString("orderID"));
				payment.setPaymentDate(resultSet.getString("dateTime"));
				payment.setPaymentType(resultSet.getString("payType"));
				payment.setDescription(resultSet.getString("description"));
				payment.setPayAmount(resultSet.getDouble("totAmount"));
				
				paymentlist.add(payment);
				
			}
						
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
		return paymentlist;

	}

	
	
	@Override
	public boolean deletePayment(Payment payment) {
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

	
	
	@Override
	public boolean updatePaymentAdmin(Payment payment) {
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



	

	
	
	
	
	
}
