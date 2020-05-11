package com.lms.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lms.model.Customer;
import com.lms.service.CustomerService;


@WebServlet("/RegistrationAdminServlet")
public class RegistrationAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private CustomerService customerService;
	
    public RegistrationAdminServlet() {
        this.customerService = new CustomerService();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			insertCustomer(request,response);
		} catch (ServletException | IOException | SQLException e) {
			e.printStackTrace();
		}
			
	}

	private void insertCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		int pnumber = Integer.parseInt(request.getParameter("pnumber"));
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		Customer newCustomer = new Customer(fname, lname, email, pnumber, address, username, password);
		
		customerService.addCustomer(newCustomer);
		response.sendRedirect("customerlist.jsp");
		
    	
    }

}
