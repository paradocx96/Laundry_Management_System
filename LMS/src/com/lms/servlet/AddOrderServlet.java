package com.lms.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lms.util.OrderDBUtil;

@WebServlet("/AddOrderServlet")
public class AddOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public AddOrderServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String orderId = request.getParameter("orderId");
		String custId = request.getParameter("custId");
		String weight = request.getParameter("weight");
		String orderDate = request.getParameter("orderDate");
		String deliveryDate = request.getParameter("deliveryDate");
		
		boolean isTrue;
		
		isTrue = OrderDBUtil.insertOrder(orderId, custId, weight, orderDate, deliveryDate);
		
		if (isTrue == true) {
			RequestDispatcher dis=request.getRequestDispatcher("orderlist.jsp");
			dis.forward(request, response);
		}
		else {
			RequestDispatcher dis2=request.getRequestDispatcher("index.jsp");
			dis2.forward(request, response);
		}
		
	}

}
