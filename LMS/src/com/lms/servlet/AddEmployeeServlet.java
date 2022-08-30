package com.lms.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lms.model.Employee;
import com.lms.service.EmployeeService;

/**
 * Servlet implementation class AddEmployeeServlet
 */
@WebServlet("/AddEmployeeServlet")
public class AddEmployeeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private EmployeeService employeeService;

    public AddEmployeeServlet() {

        this.employeeService = new EmployeeService();

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doGet(request, response);
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            insertEmployeee(request, response);
        } catch (ServletException | IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    private void insertEmployeee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {


        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String address = request.getParameter("address");
        String dob = request.getParameter("dob");
        int phone = Integer.parseInt(request.getParameter("phone"));
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        System.out.println(request.getParameter("fname") + "" + request.getParameter("lname") + "" + request.getParameter("address") + "" + request.getParameter("dob") + "" + request.getParameter("phone") + "" + request.getParameter("username") + "" + request.getParameter("password"));


        Employee emp = new Employee(fname, lname, address, dob, phone, username, password);

        try {

            employeeService.addEmployee(emp);

        } catch (SQLException e) {

            e.printStackTrace();

        }

        response.sendRedirect("adminlogin.jsp");
    }


}
