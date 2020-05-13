package com.lms.service;

import java.util.ArrayList;

import com.lms.model.Payment;

public interface IPaymentService {
	
	
	public boolean addPayment(Payment payment);
	
	public ArrayList<Payment> selectAllPayment();
	
	public Payment selectPaymentByID(int payid);	
	
	public ArrayList<Payment> selectPayment(int payID);
	
	public Payment selectPaymentOrder(String orderID);	
	
	public ArrayList<Payment> PaymentByOrderId(String orderID);
	
	public boolean deletePayment (Payment payment);
	
	public boolean updatePaymentAdmin (Payment payment);

}
