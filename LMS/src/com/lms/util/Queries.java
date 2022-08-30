package com.lms.util;

public class Queries {
    public static final String INSERT_INTO_DELIVERY = "INSERT INTO Delivery VALUES (?,?,?,?,?,?)";
    public static final String GET_SELECTED_DELIVERY = "SELECT * FROM Delivery WHERE deliveryId = ?";
    public static final String GET_SELECTED_ORDER = "SELECT * FROM Orders WHERE orderId = ?";
    public static final String DELETE_FROM_DELIVERY = "DELETE * FROM Delivery WHERE deliveryId = ?";
}
