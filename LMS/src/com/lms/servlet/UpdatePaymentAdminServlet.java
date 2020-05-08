package com.lms.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lms.model.Payment;
import com.lms.service.PaymentService;


@WebServlet("/UpdatePaymentAdminServlet")
public class UpdatePaymentAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
    public UpdatePaymentAdminServlet() {
        super();
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			updatePaymentAdmin(request,response);
		} catch (ServletException | IOException | SQLException e) {
			e.printStackTrace();
		}		
		
	}
	
	private void updatePaymentAdmin (HttpServletRequest request, HttpServletResponse response) throws ServletException, SQLException, IOException {
		
		int paymentid = Integer.parseInt(request.getParameter("paymentid"));
		String orderid = request.getParameter("orderid");
		double payamount = Double.parseDouble(request.getParameter("payamount"));
		String paytype = request.getParameter("paytype");
		String description = request.getParameter("description");
		String paydatetime = request.getParameter("paydatetime");
		
		Payment payment = new Payment(paymentid, orderid, paydatetime, paytype, description, payamount);
		PaymentService.updatePaymentAdmin(payment);
		response.sendRedirect("paymentList.jsp");
		
	}
	
	
	

}
