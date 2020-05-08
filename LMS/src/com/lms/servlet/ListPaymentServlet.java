package com.lms.servlet;

import java.io.*;
import java.util.*;
import java.sql.*;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.lms.model.Payment;
import com.lms.service.PaymentService;

@WebServlet("/ListPaymentServlet")
public class ListPaymentServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private PaymentService paymentService;

    public void init() {
    	paymentService = new PaymentService();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	List<Payment> listPayment = paymentService.selectAllPayment();
    	request.setAttribute("listPayment", listPayment);
    	System.out.println(listPayment);
    	RequestDispatcher dispatcher = request.getRequestDispatcher("paymentList.jsp");
    	dispatcher.forward(request, response);	
		
	}

    
	

}
