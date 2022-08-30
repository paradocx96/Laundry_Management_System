package com.lms.servlet;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lms.model.Order;
import com.lms.service.OrderService;


@WebServlet("/EditOrderServlet")
public class EditOrderServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;


    public EditOrderServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doGet(request, response);
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            EditOrder(request, response);
        } catch (ServletException | IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    private void EditOrder(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {

        int orderId = Integer.parseInt((request.getParameter("orderId")));

        System.out.println("Id : " + orderId);

        try {
            Order UpdateOrder = OrderService.selectOrder(orderId);
            System.out.println("Fetched data : " + UpdateOrder.getCustId() + " " + UpdateOrder.getDeliveryDate());
            request.setAttribute("UpdateOrder", UpdateOrder);

        } catch (Exception e) {
            e.printStackTrace();
        }


        RequestDispatcher requestDispatcher = request.getRequestDispatcher("updateOrder.jsp");
        requestDispatcher.forward(request, response);

    }

}
