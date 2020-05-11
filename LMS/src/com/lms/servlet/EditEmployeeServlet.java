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

import com.lms.model.Employee;
import com.lms.service.EmployeeService;

/**
 * Servlet implementation class UpdateEmployeeServlet
 */
@WebServlet("/EditEmployeeServlet")
public class EditEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditEmployeeServlet() {
      
       
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			editEmployee(request,response);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private void editEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		
		int empId = Integer.parseInt(request.getParameter("empId"));
		
		List<Employee> empUpdate = EmployeeService.selectEmployee(empId);
		request.setAttribute("empUpdate", empUpdate);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("updateEmployee.jsp");
		requestDispatcher.forward(request, response);
		
		
	}
}
