package com.lms.servlet;

import java.util.*;
import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lms.model.Customer;
import com.lms.service.CustomerServiceImpl;
import com.lms.service.ICustomerService;


/**
 * Servlet implementation class DisplayCustomerListServelet
 */
@WebServlet("/DisplayCustomerListServlet")
public class DisplayCustomerBioServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    //private  CustomerService customerService;

    public DisplayCustomerBioServlet() {
        super();

    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String user = request.getParameter("userName");
        String pass = request.getParameter("password");


        ICustomerService icustomer = new CustomerServiceImpl();
        Customer cusDetails = icustomer.selectOneCustomerDetials(user, pass);

        request.setAttribute("cusDetails", cusDetails);

        RequestDispatcher dis = getServletContext().getRequestDispatcher("/customerEditView.jsp");
        dis.forward(request, response);

    }


}
