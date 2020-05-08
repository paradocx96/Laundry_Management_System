package com.lms.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lms.service.PaymentService;


@WebServlet("/AddPaymentServlet")
public class AddPaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		boolean istrue;
		
		String oderid = request.getParameter("orderid");
		String payamount = request.getParameter("payamount");
		double amount = Double.parseDouble(payamount);
		
		istrue = PaymentService.insertPayment(oderid, amount);
				
		if (istrue == true) {
			RequestDispatcher requestDispatcher1 = request.getRequestDispatcher("paymentList.jsp");
			requestDispatcher1.forward(request, response);
		} else {
			RequestDispatcher requestDispatcher2 = request.getRequestDispatcher("adminDashboard.jsp");
			requestDispatcher2.forward(request, response);
		}
		
		
	}

}
