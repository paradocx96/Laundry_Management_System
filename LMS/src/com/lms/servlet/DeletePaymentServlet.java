package com.lms.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lms.model.Payment;
import com.lms.service.PaymentService;


@WebServlet("/DeletePaymentServlet")
public class DeletePaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public DeletePaymentServlet() {
        super();
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			deletePayment(request,response);
		} catch (ServletException | IOException | SQLException e) {
			e.printStackTrace();
		}
			
	}
	
	private void deletePayment(HttpServletRequest request, HttpServletResponse response) throws ServletException, SQLException, IOException {
		
        int paymentID = Integer.parseInt(request.getParameter("paymentID"));
        System.out.println(paymentID);
        Payment payment = new Payment(paymentID);
    	PaymentService.deletePayment(payment);
        response.sendRedirect("paymentList.jsp");
 
    }


}
