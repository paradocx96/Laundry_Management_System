package com.lms.servlet;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lms.model.Order;
import com.lms.service.OrderService;

@WebServlet("/UpdateOrderServlet")
public class UpdateOrderServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public UpdateOrderServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        try {
            updateOrder(request, response);
        } catch (ServletException | IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    private void updateOrder(HttpServletRequest request, HttpServletResponse response) throws ServletException, SQLException, IOException {

        int orderId = Integer.parseInt(request.getParameter("orderId"));
        int custId = Integer.parseInt(request.getParameter("custId"));
        double weight = Double.parseDouble(request.getParameter("weight"));
        String orderDate = request.getParameter("orderDate");
        String deliveryDate = request.getParameter("deliveryDate");

        Order order = new Order(orderId, custId, weight, orderDate, deliveryDate);
        OrderService.updateOrder(order);
        response.sendRedirect("orderlist.jsp");

    }
}
