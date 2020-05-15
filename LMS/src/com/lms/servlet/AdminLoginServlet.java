package com.lms.servlet;

/*
 *  By IT19180526
 */

import java.io.IOException;
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

@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			//create variable and assign values from JSP
			String userName = request.getParameter("userName");
			String password = request.getParameter("password");
		
			try {
				//Getting DB connection
				Connection con = DBconnect.getConnection();
				
				Statement state = con.createStatement();
				
				//prepare SQL syntax
				String sql = "SELECT userName,password FROM employee WHERE userName='"+userName+"'and password='"+password+"'";
				
				//execute SQL syntax
				ResultSet result = state.executeQuery(sql);
	
				//Check the result and redirect	
				if(result.next()) {
					
					//Calling session
					HttpSession session = request.getSession();
					session.setAttribute("userName", userName);
					
					response.sendRedirect("admindashboard.jsp");
				
				} else {
					
					response.sendRedirect("404LoginAdmin.jsp");
				}
			
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
		}
		
}
