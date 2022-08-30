package com.lms.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.lms.model.Order;
import com.lms.util.DBconnect;

public class OrderService {

    public static boolean insertOrder(String orderId, String custId, String weight, String orderDate,
                                      String deliveryDate) {
        boolean isSuccess = false;

        try {
            Connection con = DBconnect.getConnection();
            Statement state = con.createStatement();
            String sql = "insert into orders values(0,'" + custId + "','" + weight + "','" + orderDate + "','"
                    + deliveryDate + "');";
            int rs = state.executeUpdate(sql);
            if (rs > 0) {
                isSuccess = true;
            } else {
                isSuccess = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isSuccess;
    }

    public ArrayList<Order> getOrderDetails() {
        ArrayList<Order> ordRecSet = new ArrayList<Order>();
        try {
            Connection con = DBconnect.getConnection();
            Statement state = con.createStatement();
            String sql = "select * from orders";
            ResultSet rs = state.executeQuery(sql);

            while (rs.next()) {
                Order ord = new Order();
                ord.setOrderId(rs.getInt(1));
                ord.setCustId(rs.getInt(2));
                ord.setWeight(rs.getDouble(3));
                ord.setOrderDate(rs.getString(4));
                ord.setDeliveryDate(rs.getString(5));
                ordRecSet.add(ord);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ordRecSet;
    }

    public static boolean deleteOrder(Order order) {
        boolean rowDelete = false;
        try (Connection connection = DBconnect.getConnection();
             PreparedStatement preparedStatement = connection
                     .prepareStatement("DELETE FROM orders WHERE orderId=?");) {

            preparedStatement.setInt(1, order.getOrderId());
            rowDelete = preparedStatement.executeUpdate() > 0;
            preparedStatement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowDelete;
    }


    public static boolean updateOrder(Order order) {
        boolean rowUpdate = false;

        try (Connection connection = DBconnect.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("UPDATE orders SET customerId = ?, weight = ?, orderDate = ?, deliveryDate = ? WHERE orderId = ?;");) {

            preparedStatement.setInt(1, order.getCustId());
            preparedStatement.setDouble(2, order.getWeight());
            preparedStatement.setString(3, order.getOrderDate());
            preparedStatement.setString(4, order.getDeliveryDate());
            preparedStatement.setInt(5, order.getOrderId());

            rowUpdate = preparedStatement.executeUpdate() > 0;
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowUpdate;
    }


    public static Order selectOrder(int orderId) {

        Order order = new Order();

        try (Connection connection = DBconnect.getConnection();
             PreparedStatement preparedStatement = connection
                     .prepareStatement("SELECT * FROM orders WHERE orderId = ?");) {

            preparedStatement.setInt(1, orderId);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int orderid = resultSet.getInt("orderId");
                int custId = resultSet.getInt("custId");
                double weight = resultSet.getDouble("weight");
                String orderDate = resultSet.getString("orderDate");
                String deliveryDate = resultSet.getString("deliveryDate");

                order = new Order(orderid, custId, weight, orderDate, deliveryDate);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return order;
    }
}
