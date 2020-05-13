package com.lms.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lms.model.Customer;
import com.lms.service.CustomerServiceImpl;
import com.lms.service.ICustomerService;

@WebServlet("/DeleteCustomerServlet")
public class DeleteCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public DeleteCustomerServlet() {
        super();
    }

	
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			deleteCustomer(request,response);
		} catch (ServletException | IOException | SQLException e) {
			e.printStackTrace();
		}
			
	}
	
	private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, SQLException, IOException {
		
        int custId = Integer.parseInt(request.getParameter("custId"));
        Customer customer = new Customer(custId);
        ICustomerService icustomer = new CustomerServiceImpl(); 
        
        icustomer.deleteCustomer(customer);
        
       
    
        RequestDispatcher dis = getServletContext().getRequestDispatcher("/customerlist.jsp");
		dis.forward(request, response);
 
    }
	
	
}
