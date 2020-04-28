package com.lms.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.jni.User;

import com.lms.model.Payment;
import com.lms.service.PaymentService;


@WebServlet("/")
public class PaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PaymentService paymentService;
       
    public PaymentServlet() {
        this.paymentService = new PaymentService();
    }
        
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
		
	}

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getServletPath();
		
		switch (action) {
		case "/new":
			showNewForm (request,response);
			break;
		
		case "/insert":
			try {
				insertPayment(request,response);
			} catch (ServletException | IOException | SQLException e) {
				e.printStackTrace();
			}
			break;
			
		default:
			break;
		}
		
	}
    
    private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	RequestDispatcher dispatcher = request.getRequestDispatcher("addPayment.jsp");
    	dispatcher.forward(request, response);
    }
    
    private void insertPayment(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
    	
    	String orderid = request.getParameter("orderid");
    	//int payid = Integer.parseInt(paymentid);
    	
    	String payamount = request.getParameter("payamount");
    	double payAmt = Double.valueOf(payamount);
    	
    	Payment newPayment = new Payment(orderid,payAmt);
    	
    	paymentService.addPayment(newPayment);
    	
    	response.sendRedirect("paymentList");
    }
    
    

}
