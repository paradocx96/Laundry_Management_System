package com.lms.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lms.util.DBconnect;

/**
 * Servlet implementation class AdminLoginServlet
 */
@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			String userName = request.getParameter("userName");
			String password = request.getParameter("password");
			
		
			
			
			try {
				
				Connection con = DBconnect.getConnection();
				Statement state = con.createStatement();  
				String sql = "SELECT userName,password FROM employee WHERE userName='"+userName+"'and password='"+password+"'";
				ResultSet result = state.executeQuery(sql);
				
						
					if(result.next()) {
						
						HttpSession session = request.getSession();
						session.setAttribute("userName", userName);
						response.sendRedirect("admindashboard.jsp");
						
					}else {
						
						
						response.sendRedirect("error.jsp");
						
					}
			
			} catch (SQLException e) {
				
				e.printStackTrace();
			}  

			//response.sendRedirect("dashboard.jsp");
			//RequestDispatcher dis = request.getRequestDispatcher("dashboard.jsp");
			//dis.forward(request, response);		

		}


}
