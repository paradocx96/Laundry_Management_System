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


@WebServlet("/ViewPaymentServlet")
public class ViewPaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ViewPaymentServlet() {
        super();
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
	}

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			editPaymentAdmin(request,response);
		} catch (ServletException | IOException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	private void editPaymentAdmin(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
		
		int payid = Integer.parseInt((request.getParameter("paymentID")));
		
		try {
			List<Payment> paymentView = PaymentService.selectPayment(payid);
			request.setAttribute("paymentView", paymentView);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("viewPayment.jsp");
		requestDispatcher.forward(request, response);
 
    }

}
