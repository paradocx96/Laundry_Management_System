package com.lms.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

import com.lms.service.DatabaseImpl;
import com.lms.model.Delivery;


/**
 * Servlet implementation class DeliveryDisplayServlet
 */
@WebServlet("/DeliveryDisplayServlet")
public class DeliveryDisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeliveryDisplayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out=response.getWriter();
		int deliveryId=Integer.parseInt((request.getParameter("deliveryId")));
		System.out.println(deliveryId);
		out.print("<h1>Display the Record</h1>");
		out.print("<table border='1'><tr><th>Id</th><th>Location</th><th>PhoneNo</th><th>email</th><th>DeliveryType</th><th>OrderId</th></tr>");
		
		try {
				
			DatabaseImpl db = new DatabaseImpl();
						
			ArrayList result = db.GetSelectedDelivery(deliveryId);
						
			for (int i=0; i< result.size(); i++) {
										
				out.print("<tr><td>");
				out.println(((Delivery)result.get(i)).getDeliveryId()); 
				out.print("</td>");
				out.print("<td>");
				out.println(((Delivery)result.get(i)).getLocation()); 
				out.print("</td>");
				out.print("<td>");
				out.println(((Delivery)result.get(i)).getPhoneNo()); 
				out.print("</td>");
				out.print("<td>");
				out.println(((Delivery)result.get(i)).getEmail()); 
				out.print("</td>");
				out.print("<td>");
				out.println(((Delivery)result.get(i)).getDeliveryTypeId()); 
				out.print("</td>");
				out.print("<td>");
				out.println(((Delivery)result.get(i)).getOrderId()); 
				out.print("</td>");
				out.print("/<tr>");
								
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		out.print("</table>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
