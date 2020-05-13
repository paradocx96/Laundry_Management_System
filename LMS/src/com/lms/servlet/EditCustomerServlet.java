package com.lms.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lms.model.Customer;
import com.lms.service.CustomerServiceImpl;
import com.lms.service.ICustomerService;


@WebServlet("/EditCustomerServlet")
public class EditCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public EditCustomerServlet() {
    	super();
    }

	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
		
	}

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	response.setContentType("text/html");
    	
    	int custId = Integer.parseInt((request.getParameter("custId")));
		
		ICustomerService icustomer = new CustomerServiceImpl();
		
		Customer editCustomer = icustomer.selectCustomer(custId);
		request.setAttribute("editCustomer", editCustomer);
	
		
		RequestDispatcher dis = getServletContext().getRequestDispatcher("/editCustomerAdmin.jsp");
		dis.forward(request, response);
    	
	}
	
    
	
		
}
