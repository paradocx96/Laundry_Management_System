package com.lms.servlet;

/*
 *  By IT19180526
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


@WebServlet("/UpdateCustomerAdminServlet")
public class UpdateCustomerAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
    public UpdateCustomerAdminServlet() {
        super();
    }

    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		Customer customer = new Customer();
		
		customer.setCustId(Integer.parseInt(request.getParameter("custid")));
		customer.setFirstName(request.getParameter("fname"));
		customer.setLastName(request.getParameter("lname"));
		customer.setAddress(request.getParameter("address"));
		customer.setEmail(request.getParameter("email"));
		customer.setPhone(Integer.parseInt(request.getParameter("pnumber")));
		customer.setUserName(request.getParameter("username"));
		customer.setPassword(request.getParameter("password"));
		
		ICustomer iCustomer = new ICustomerImpl();
		iCustomer.updateCustomerAdmin(customer);
		RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/customerlist.jsp");
		requestDispatcher.forward(request, response);
		
	}
	
}
