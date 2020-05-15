package com.lms.servlet;

/*
 * By IT19180526
 */

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lms.model.Payment;
import com.lms.service.IPaymentService;
import com.lms.service.PaymentServiceImpl;


@WebServlet("/EditPaymentCustomerServlet")
public class EditPaymentCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public EditPaymentCustomerServlet() {
        super();
    }
    

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		int payid = Integer.parseInt(request.getParameter("paymentID"));
		
		IPaymentService iPaymentService = new PaymentServiceImpl();
		
		Payment payment = iPaymentService.selectPaymentByID(payid);	
		
		request.setAttribute("payment", payment);
		
		RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/editPaymentCustomer.jsp");
		requestDispatcher.forward(request, response);
		
	}

}
