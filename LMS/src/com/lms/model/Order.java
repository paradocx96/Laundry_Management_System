package com.lms.model;

public class Order{

	private int orderId;
	private int custId;
	private float weight;
	private String orderDate;
	private String deliveryDate;
	
	public Order(int orderId, int custId, float weight, String orderDate, String deliveryDate) {
		super();
		this.orderId = orderId;
		this.custId = custId;
		this.weight = weight;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
	}

	public int getOrderId() {
		return orderId;
	}

	public int getCustId() {
		return custId;
	}

	public float getWeight() {
		return weight;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public String getDeliveryDate() {
		return deliveryDate;
	}
	
}
