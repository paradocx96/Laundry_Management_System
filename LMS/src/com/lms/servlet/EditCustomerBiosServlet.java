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

/**
 * Servlet implementation class EditCustomerBios
 */
@WebServlet("/EditCustomerBiosServlet")
public class EditCustomerBiosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    private CustomerService customerService;   
   
    public EditCustomerBiosServlet() {
   
        this.customerService = new CustomerService();
        
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		this.doGet(request, response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			updateCustomer(request,response);
		} catch (ServletException | IOException | SQLException e) {
			e.printStackTrace();
		}
			
	}

	private void updateCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		
		
		int custId = Integer.parseInt(request.getParameter("custId"));
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		int phone = Integer.parseInt(request.getParameter("pnumber"));
		
		//System.out.println(request.getParameter("custId")+""+request.getParameter("fname")+""+request.getParameter("lname")+""+ request.getParameter("address")+""+request.getParameter("email")+""+request.getParameter("pnumber"));
		
		Customer customer = new Customer(custId,fname,lname,email,phone,address); 
		
		try {
			
			customerService.updateCustomerDetails(customer);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		response.sendRedirect("dashboard.jsp");
		
		
		
    	
    }
	
	
	
	
		
}
		
		/*
		String action = request.getServletPath();


		try {
			switch (action) {
			case "/edit":
				updateUser(request, response);
				break;
			default:
				listUser(request, response);
				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}	
		
	private void updateUser(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		*/
	/*	int custId = Integer.parseInt(request.getParameter("custId"));
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		int pnumber = Integer.parseInt(request.getParameter("pnumber"));
		
		Customer customer = new Customer(custId,fname,lname,email,pnumber, address); 
		
		try {
			
			custService.updateCustomerDetails(customer);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		response.sendRedirect("dashboard.jsp");
		
		
	}
	
	private void listUser(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException { */
		
		

	


