package com.lms.service;

import java.util.ArrayList;
import com.lms.model.Payment;

/*
 *  By IT19180526
 */

public interface IPaymentService {
	
	
	//Use for add new payment by Administration
	public boolean addPayment(Payment payment);
	
	
	//Use for get all payments details by administration 
	public ArrayList<Payment> selectAllPayment();
	
	
	//Use for get selected payment details
	public Payment selectPaymentByID(int payid);
	public ArrayList<Payment> selectPayment(int payID);
	
	
	//Use for get payment details for relevant order
	public Payment selectPaymentOrder(String orderID);
	public ArrayList<Payment> PaymentByOrderId(String orderID);
	
	
	//Use for delete selected payment
	public boolean deletePayment (Payment payment);
	
	
	//Use for update payment details by administration and Customer
	public boolean updatePaymentAdmin (Payment payment);
	
	
	//Use for update payment details by Customer
	public boolean updatePaymentCustomer (Payment payment);

}
