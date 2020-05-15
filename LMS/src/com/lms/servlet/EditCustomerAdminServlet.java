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


@WebServlet("/EditCustomerAdminServlet")
public class EditCustomerAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public EditCustomerAdminServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		int custid = Integer.parseInt(request.getParameter("custId"));
		
		ICustomer iCustomer = new ICustomerImpl();
		
		Customer customer = iCustomer.selectCustomerByID(custid);	
		
		request.setAttribute("customer", customer);
		
		RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/editCustomerAdmin.jsp");
		requestDispatcher.forward(request, response);
		
	}

}
