package com.lms.model;

/*
 *  By IT19180526
 */

public class Payment {
	
	//Declare variables	
	private int paymentID;
	private String orderID;
	private String paymentDate;
	private String paymentType;
	private String description;
	private double payAmount;
	

	//Implement constructors
	public Payment(int paymentID, String orderID, String paymentDate, String paymentType, String description, double payAmount) {
		super();
		this.paymentID = paymentID;
		this.orderID = orderID;
		this.paymentDate = paymentDate;
		this.paymentType = paymentType;
		this.description = description;
		this.payAmount = payAmount;
	}
	
	public Payment(int paymentID) {
		super();
		this.paymentID = paymentID;
	}
	
	public Payment(String orderID, double payAmount) {
		super();
		this.orderID = orderID;
		this.payAmount = payAmount;
	}	

	public Payment(String orderID, String paymentType, String description, double payAmount) {
		super();
		this.orderID = orderID;
		this.paymentType = paymentType;
		this.description = description;
		this.payAmount = payAmount;
	}

	public Payment() {	
	}
	
	
	//Implement getters and setters
	public int getPaymentID() {
		return paymentID;
	}

	public void setPaymentID(int paymentID) {
		this.paymentID = paymentID;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public String getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(double payAmount) {
		this.payAmount = payAmount;
	}	

}
