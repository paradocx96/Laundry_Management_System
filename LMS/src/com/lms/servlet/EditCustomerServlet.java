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
import com.lms.service.CustomerService;


@WebServlet("/EditCustomerServlet")
public class EditCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public EditCustomerServlet() {
    	super();
    }

	
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	this.doGet(request, response);
    	
	}
	
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			editCustomerAdmin(request,response);
		} catch (ServletException | IOException | SQLException e) {
			e.printStackTrace();
		}
			
	}
	
	private void editCustomerAdmin(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
		
		int custId = Integer.parseInt((request.getParameter("custId")));
		
		try {
			List<Customer> editCustomer = CustomerService.selectCustomerById(custId);
			request.setAttribute("editCustomer", editCustomer);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("editCustomerAdmin.jsp");
		requestDispatcher.forward(request, response);
 
    }
	
	
	
	
		
}
