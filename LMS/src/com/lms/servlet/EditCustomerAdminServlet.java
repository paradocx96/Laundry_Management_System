package com.lms.servlet;

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
		ICustomerService iCustomerService = new CustomerServiceImpl();
		Customer customer = iCustomerService.selectCustomer(custid);	
		request.setAttribute("customer", customer);
		RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/editCustomerAdmin.jsp");
		requestDispatcher.forward(request, response);
		
	}

}
