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


@WebServlet("/UpdatePaymentAdminServlet")
public class UpdatePaymentAdminServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;


    public UpdatePaymentAdminServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        //Create an object
        Payment payment = new Payment();

        //getting values from JSP and assign to object setters
        payment.setPaymentID(Integer.parseInt(request.getParameter("paymentid")));
        payment.setOrderID(request.getParameter("orderid"));
        payment.setPaymentDate(request.getParameter("paydatetime"));
        payment.setPaymentType(request.getParameter("paytype"));
        payment.setPayAmount(Double.parseDouble(request.getParameter("payamount")));
        payment.setDescription(request.getParameter("description"));

        //create an object
        IPaymentService iPaymentService = new PaymentServiceImpl();

        //calling relevant method
        iPaymentService.updatePaymentAdmin(payment);

        //redirect to JSP
        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/paymentList.jsp");
        requestDispatcher.forward(request, response);

    }


}
