package com.lms.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lms.model.Employee;
import com.lms.model.Payment;
import com.lms.service.EmployeeService;
import com.lms.service.PaymentService;

/**
 * Servlet implementation class UpdateEmployeeServlet
 */
@WebServlet("/UpdateEmployeeServlet")
public class UpdateEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateEmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			updateEmployee(request,response);
		} catch (ServletException | IOException | SQLException e) {
			e.printStackTrace();
		}		
		
	}
	
	private void updateEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, SQLException, IOException {
		
		int empId = Integer.parseInt(request.getParameter("empId"));
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String address = request.getParameter("address");
		String dob = request.getParameter("dob");
		int phone = Integer.parseInt(request.getParameter("phone")); 
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		Employee emp = new Employee(empId,fname,lname,address,dob,phone,username,password); 
		EmployeeService.updateEmployee(emp);
		response.sendRedirect("employeeList.jsp"); 
		
		
	}
	

}
