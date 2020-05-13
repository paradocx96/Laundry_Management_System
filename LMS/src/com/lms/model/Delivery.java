package com.lms.model;

public class Delivery {
    private int deliveryId;
    private int orderId;
    private String location;
    private String phoneNo;
    private String email;
    private int deliveryTypeId;

    public Delivery(int deliveryId, int orderId, String location, String phoneNo, String email, int deliveryTypeId) {
        this.deliveryId = deliveryId;
        this.orderId = orderId;
        this.location = location;
        this.phoneNo = phoneNo;
        this.email = email;
        this.deliveryTypeId = deliveryTypeId;
    }

    public int getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(int deliveryId) {
        this.deliveryId = deliveryId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDeliveryTypeId() {
        return deliveryTypeId;
    }

    public void deliveryTypeId(int deliveryTypeId) {
        this.deliveryTypeId = deliveryTypeId;
    }
}
