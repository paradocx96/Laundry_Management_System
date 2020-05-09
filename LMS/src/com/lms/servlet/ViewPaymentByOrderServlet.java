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

import com.lms.model.Payment;
import com.lms.service.PaymentService;


@WebServlet("/ViewPaymentByOrderServlet")
public class ViewPaymentByOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ViewPaymentByOrderServlet() {
        super();
        
    }

	
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
	}

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			viewPaymentByOrder(request,response);
		} catch (ServletException | IOException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	private void viewPaymentByOrder(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
		
		String orderid = request.getParameter("orderId");
		
		try {
			List<Payment> paymentView = PaymentService.selectPaymentOrder(orderid);
			request.setAttribute("paymentView", paymentView);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("viewPayment.jsp");
		requestDispatcher.forward(request, response);
 
    }

}
