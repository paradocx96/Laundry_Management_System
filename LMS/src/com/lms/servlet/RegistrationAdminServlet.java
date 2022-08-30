package com.lms.servlet;

/*
 * By IT19180526
 */

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lms.model.Customer;
import com.lms.service.ICustomer;
import com.lms.service.ICustomerImpl;


@WebServlet("/RegistrationAdminServlet")
public class RegistrationAdminServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;


    public RegistrationAdminServlet() {

    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);

    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        boolean out;

        //Create an object
        Customer customer = new Customer();

        //getting values from JSP and assign to object setters
        customer.setFirstName(request.getParameter("fname"));
        customer.setLastName(request.getParameter("lname"));
        customer.setAddress(request.getParameter("address"));
        customer.setEmail(request.getParameter("email"));
        customer.setPhone(Integer.parseInt(request.getParameter("pnumber")));
        customer.setUserName(request.getParameter("username"));
        customer.setPassword(request.getParameter("password"));

        //create an object
        ICustomer iCustomer = new ICustomerImpl();

        //calling relevant method
        out = iCustomer.addCustomer(customer);

        //check the results and redirect
        if (out == true) {
            RequestDispatcher requestDispatcher1 = request.getRequestDispatcher("customerlist.jsp");
            requestDispatcher1.forward(request, response);
        } else {
            RequestDispatcher requestDispatcher2 = request.getRequestDispatcher("404errorAdmin.jsp");
            requestDispatcher2.forward(request, response);
        }
    }

}
