package com.lms.model;

public class Payment {
	
	private String paymentID;
	private String orderID;
	private String paymentDate;
	private String paymentType;
	private String description;
	private double payAmount;

	public Payment(String paymentID, String paymentDate, String paymentType, String description, double payAmount) {
		super();
		this.paymentID = paymentID;
		this.paymentDate = paymentDate;
		this.paymentType = paymentType;
		this.description = description;
		this.payAmount = payAmount;
	}
	
	public Payment(String orderID, double payAmount) {
		super();
		this.orderID = orderID;
		this.payAmount = payAmount;
	}

	
	public String getPaymentID() {
		return paymentID;
	}

	public void setPaymentID(String paymentID) {
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
