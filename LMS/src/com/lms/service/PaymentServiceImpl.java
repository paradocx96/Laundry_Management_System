package com.lms.service;

import java.lang.ProcessBuilder.Redirect;

/*
 *  By IT19180526
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.websocket.SendResult;

import com.lms.model.Payment;
import com.lms.util.DBconnect;
import com.lms.util.PaymentConstants;
import com.lms.util.PaymentQuery;

public class PaymentServiceImpl implements IPaymentService {
	
	
	//Use for add new payment by Administration
	@Override
	public boolean addPayment(Payment payment) {
		boolean result = false;
		
		try (Connection connection = DBconnect.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(PaymentQuery.CREATE_PAYMENT)) {
			
			preparedStatement.setString(PaymentConstants.COLUMN_ONE, payment.getOrderID());
			preparedStatement.setString(PaymentConstants.COLUMN_TWO, payment.getPaymentType());
			preparedStatement.setDouble(PaymentConstants.COLUMN_THREE, payment.getPayAmount());
			preparedStatement.setString(PaymentConstants.COLUMN_FOUR, payment.getDescription());
			int resultset = preparedStatement.executeUpdate();
			
			System.out.println(preparedStatement);
			
			if(resultset > 0) {
				result = true;
			} else {
				result = false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	
	
	//Use for get selected payment details
	@Override
	public Payment selectPaymentByID(int payid) {
		
		return selectPayment(payid).get(0);
	}

	
	//Use for get selected payment details
	@Override
	public ArrayList<Payment> selectPayment(int payID) {
		ArrayList<Payment> selectpayment = new ArrayList<>();
		
		try (Connection connection = DBconnect.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(PaymentQuery.GET_PAYMENT_BY_ID);) {
			
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

	
	
	//Use for get payment details for relevant order
	@Override
	public Payment selectPaymentOrder(String orderID) {
		
		return PaymentByOrderId(orderID).get(0);
	}
	
	
	//Use for get payment details for relevant order
	@Override
	public ArrayList<Payment> PaymentByOrderId(String orderID) {
		ArrayList<Payment> selectOrderPayment = new ArrayList<>();
		
		try (Connection connection = DBconnect.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(PaymentQuery.GET_PAYMENT_BY_ORDER_ID);) {
			
			preparedStatement.setString(1,orderID);
			System.out.println(preparedStatement);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			/*boolean rs = selectOrderPayment.isEmpty();
			if (rs == true) {
				System.out.println("Array List Empty!!!");
				
				
			}*/
			
			if (resultSet.next()) {
				Payment payment = new Payment();
				
				payment.setPaymentID(resultSet.getInt("paymentID"));
				payment.setOrderID(resultSet.getString("orderID"));
				payment.setPaymentDate(resultSet.getString("dateTime"));
				payment.setPaymentType(resultSet.getString("payType"));
				payment.setDescription(resultSet.getString("description"));
				payment.setPayAmount(resultSet.getDouble("totAmount"));
				
				selectOrderPayment.add(payment);
			} else {
				System.out.println("Array List empty");
			}
						
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return selectOrderPayment;
	}

	
	
	//Use for get all payments details by administration
	@Override
	public ArrayList<Payment> selectAllPayment() {
		
		ArrayList<Payment> paymentlist = new ArrayList<Payment>();
		
		try (Connection connection = DBconnect.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(PaymentQuery.GET_ALL_PAYMENT);) {
			
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

	
	
	//Use for delete selected payment
	@Override
	public boolean deletePayment(Payment payment) {
		boolean result = false;
		
		try (Connection connection = DBconnect.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(PaymentQuery.DELETE_PAYMENT_SQL);) {
			
			preparedStatement.setInt(1, payment.getPaymentID());
			result = preparedStatement.executeUpdate() > 0;
			
			System.out.println(preparedStatement);
			
			preparedStatement.close();
			connection.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	
	
	//Use for update payment details by administration
	@Override
	public boolean updatePaymentAdmin(Payment payment) {
		boolean result = false;
		
		try (Connection connection = DBconnect.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(PaymentQuery.UPDATE_PAYMENT_ADMIN);) {
			
			preparedStatement.setString(PaymentConstants.COLUMN_ONE, payment.getOrderID());
			preparedStatement.setDouble(PaymentConstants.COLUMN_TWO, payment.getPayAmount());
			preparedStatement.setString(PaymentConstants.COLUMN_THREE, payment.getPaymentType());
			preparedStatement.setString(PaymentConstants.COLUMN_FOUR, payment.getDescription());
			preparedStatement.setString(PaymentConstants.COLUMN_FIVE, payment.getPaymentDate());
			preparedStatement.setInt(PaymentConstants.COLUMN_SIX, payment.getPaymentID());
			
			result = preparedStatement.executeUpdate() > 0;
			
			System.out.println(preparedStatement);
			
			preparedStatement.close();
			connection.close();			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	
	
	//Use for update payment details by Customer
	@Override
	public boolean updatePaymentCustomer(Payment payment) {
		boolean result = false;
		
		try (Connection connection = DBconnect.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(PaymentQuery.UPDATE_PAYMENT_CUSTOMER);) {
			
			preparedStatement.setString(PaymentConstants.COLUMN_ONE, payment.getPaymentType());
			preparedStatement.setString(PaymentConstants.COLUMN_TWO, payment.getDescription());
			preparedStatement.setString(PaymentConstants.COLUMN_THREE, payment.getPaymentDate());
			preparedStatement.setString(PaymentConstants.COLUMN_FOUR, payment.getOrderID());
			
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
