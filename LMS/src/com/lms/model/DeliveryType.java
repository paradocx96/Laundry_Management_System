package com.lms.model;


public class DeliveryType {
    private int deliveryTypeId;
    private String deliveryType;

    public DeliveryType(int deliveryTypeId, String deliveryType) {
        this.deliveryTypeId = deliveryTypeId;
        this.deliveryType = deliveryType;
    }

    public int getDeliveryTypeId() {
        return deliveryTypeId;
    }

    public void setDeliveryTypeId(int deliveryTypeId) {
        this.deliveryTypeId = deliveryTypeId;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }
}
