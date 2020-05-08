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
import com.lms.service.CustomerService;


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
		
		try {
			
			List<Customer> cusDetails = CustomerService.getCustomerDetials(user, pass);
			request.setAttribute("cusDetails", cusDetails);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("customerEditView.jsp");
		dis.forward(request, response);
		
	}

}
