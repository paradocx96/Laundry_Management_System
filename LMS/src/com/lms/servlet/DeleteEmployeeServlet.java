package com.lms.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lms.model.Employee;
import com.lms.service.EmployeeService;

/**
 * Servlet implementation class DeleteEmployeeServlet
 */
@WebServlet("/DeleteEmployeeServlet")
public class DeleteEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
     
    public DeleteEmployeeServlet() {
        super();
        
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			deleteEmployee(request,response);
			
		}catch(ServletException | SQLException | IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	private void deleteEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, SQLException, IOException {
		
		int empId = Integer.parseInt(request.getParameter("empId"));
		System.out.println(empId);
		
		Employee emp = new Employee(empId);
		EmployeeService.deleteEmployee(emp);
		
		response.sendRedirect("employeeList.jsp");
		
		
	}

}
