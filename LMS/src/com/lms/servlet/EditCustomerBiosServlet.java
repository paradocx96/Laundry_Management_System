package com.lms.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lms.model.Customer;
import com.lms.service.CustomerServiceImpl;
import com.lms.service.ICustomerService;

/**
 * Servlet implementation class EditCustomerBios
 */
@WebServlet("/EditCustomerBiosServlet")
public class EditCustomerBiosServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;


    public EditCustomerBiosServlet() {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        response.setContentType("text/html");

        Customer customer = new Customer();

        customer.setCustId(Integer.parseInt(request.getParameter("custId")));
        customer.setFirstName(request.getParameter("fname"));
        customer.setLastName(request.getParameter("lname"));
        customer.setAddress(request.getParameter("address"));
        customer.setEmail(request.getParameter("email"));
        customer.setPhone(Integer.parseInt(request.getParameter("pnumber")));

        //System.out.println(request.getParameter("custId")+""+request.getParameter("fname")+""+request.getParameter("lname")+""+ request.getParameter("address")+""+request.getParameter("email")+""+request.getParameter("pnumber"));


        ICustomerService icustomer = new CustomerServiceImpl();
        icustomer.updateCustomerDetails(customer);


        RequestDispatcher dis = getServletContext().getRequestDispatcher("/dashboard.jsp");
        dis.forward(request, response);


    }


}	
	

	


