package com.lms.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import javax.servlet.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lms.util.DBconnect;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		PrintWriter out = response.getWriter();
		
		
		try {
			
			Connection con = DBconnect.getConnection();
			Statement state = con.createStatement();  
			String sql = "select userName,password from customer where userName='"+userName+"'and password='"+password+"'";
			ResultSet result = state.executeQuery(sql);
			
					
				if(result.next()) {
					
					HttpSession session = request.getSession();
					session.setAttribute("userName", userName);
					response.sendRedirect("dashboard.jsp");
					
				}else {
					
					
					out.println("User name or passowrd Invalid");
					
				}
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}  

		//response.sendRedirect("dashboard.jsp");
		//RequestDispatcher dis = request.getRequestDispatcher("dashboard.jsp");
		//dis.forward(request, response);		

	}

}
