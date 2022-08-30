package com.lms.service;

import com.lms.model.Delivery;
import com.lms.util.Queries;

import java.sql.*;
import java.util.ArrayList;

public class DatabaseImpl implements Database {
    private String dbURL = "jdbc:mysql://localhost:3306/lms";
    private String dbUSername = "root";
    private String dbPassword = "";

    protected Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL, dbUSername, dbPassword);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public void InserIntoDelivery(Delivery delivery) throws SQLException {
        try {
            System.out.println(delivery.getDeliveryId());
            System.out.println(delivery.getLocation());
            System.out.println(delivery.getPhoneNo());
            System.out.println(delivery.getEmail());
            System.out.println(delivery.getDeliveryId());
            System.out.println(delivery.getOrderId());
            Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement(Queries.INSERT_INTO_DELIVERY);
            ps.setInt(1, delivery.getDeliveryId());
            ps.setString(2, delivery.getLocation());
            ps.setString(3, delivery.getPhoneNo());
            ps.setString(4, delivery.getEmail());
            ps.setInt(5, delivery.getDeliveryId());
            ps.setInt(6, delivery.getOrderId());

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public ArrayList GetSelectedDelivery(int deliveryId) throws SQLException {
        String location;
        String phoneNo;
        String email;
        int deliveryType;
        int orderId;

        ArrayList<Delivery> arr = new ArrayList<Delivery>();

        Connection connection = getConnection();
        PreparedStatement ps = connection.prepareStatement(Queries.GET_SELECTED_DELIVERY);
        ps.setInt(1, deliveryId);
        ResultSet resultSet = ps.executeQuery();

        while (resultSet.next()) {
            deliveryId = resultSet.getInt("deliveryId");
            location = resultSet.getString("location");
            phoneNo = resultSet.getString("phoneNo");
            email = resultSet.getString("email");
            deliveryType = resultSet.getInt("deliveryTypeId");
            orderId = resultSet.getInt("orderId");

            Delivery delivery = new Delivery(1, deliveryId, location, phoneNo, email, deliveryType);

            arr.add(delivery);
        }
        return arr;
    }
}
