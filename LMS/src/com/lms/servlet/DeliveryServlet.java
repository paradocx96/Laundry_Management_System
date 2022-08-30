package com.lms.servlet;

import com.lms.service.DatabaseImpl;
import com.lms.model.Delivery;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/deliveryServlet")
public class DeliveryServlet extends HttpServlet {
    private DatabaseImpl db;
    public int test = 101;

    public DeliveryServlet() {
        this.db = new DatabaseImpl();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {
        try {
            insertDelivery(request, response);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    private void insertDelivery(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        String location = request.getParameter("location");
        String phoneNo = request.getParameter("phoneNo");
        String email = request.getParameter("email");
        int deliveryTypeId = Integer.parseInt(request.getParameter("deliveryType"));
        Delivery delivery = new Delivery(0, 1, location, phoneNo, email, deliveryTypeId);
        System.out.println("delivery : " + delivery);
        db.InserIntoDelivery(delivery);
        System.out.println("SuccessFull");
        response.sendRedirect("/");
    }

}

