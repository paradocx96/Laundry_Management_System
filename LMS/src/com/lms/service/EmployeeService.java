package com.lms.service;

import java.util.*;
import java.io.*;
import java.sql.*;

import com.lms.model.Employee;
import com.lms.util.DBconnect;



public class EmployeeService {
	
	
	private static final String ADD_NEW_EMPLOYEE = "INSERT INTO employee" + "(firstName,lastName,address,dob,phone,userName,password) VALUES" + "(?,?,?,?,?,?,?);";
	private static final String VIEW_EMPLOYEE = "SELECT * FROM employee"; 
	private static final String UPDATE_EMPLOYEE = "UPDATE employee SET firstName = ?, lastName = ?,address = ?,dob = ?,phone = ?,userName = ?,password = ? WHERE empId = ?;";
	private static final String GET_EMP_BY_ID_ADMIN = "SELECT * FROM employee WHERE empId = ?;";
	private static final String DELETE_EMPLOYEE = "DELETE FROM employee WHERE empId = ?;";
	
	public EmployeeService() {
		
		
	}
	
	public void addEmployee(Employee emp) throws SQLException {
		
		try (Connection connection = DBconnect.getConnection();
				PreparedStatement preparedStatment = connection.prepareStatement(ADD_NEW_EMPLOYEE))
		{
			
			preparedStatment.setString(1, emp.getFirstName());
			preparedStatment.setString(2,emp.getLastName());
			preparedStatment.setString(3, emp.getAddress());
			preparedStatment.setString(4, emp.getDob());
			preparedStatment.setInt(5, emp.getPhone());
			preparedStatment.setString(6, emp.getUserName());
			preparedStatment.setString(7,emp.getPassword());
			
			preparedStatment.executeUpdate();
			
			System.out.println(preparedStatment);
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
		
	}
	
	public static List<Employee> getEmployeeList() throws SQLException{
		
		ArrayList<Employee> empList = new ArrayList<>();
		
	try {	
			Connection con = DBconnect.getConnection();
			PreparedStatement state = con.prepareStatement(VIEW_EMPLOYEE);
			System.out.println(state);
			ResultSet result = state.executeQuery();
			
		while(result.next()) {
			
			int empId = result.getInt("empId");
			String fname = result.getString("firstName");
			String lname = result.getString("lastName");
			String address = result.getString("address");
			String dob = result.getString("dob");
			int phone = result.getInt("phone");
			String username = result.getString("userName");
			String password = result.getString("password");
			
			Employee emp = new Employee(empId,fname,lname,address,dob,phone,username,password);
			
			empList.add(emp);
		}	
			
			}catch(Exception e) {
				
				 e.printStackTrace();
			}
		
		return empList;
		
	}
	
	
	public static boolean updateEmployee(Employee emp) throws SQLException{
		
		boolean rowUpdate = false;
		
		try 	
			(Connection con = DBconnect.getConnection();
			PreparedStatement state =  con.prepareStatement(UPDATE_EMPLOYEE);)
		{

				
				state.setString(1, emp.getFirstName());
				state.setString(2, emp.getLastName());
				state.setString(3, emp.getAddress());
				state.setString(4, emp.getDob());
				state.setInt(5, emp.getPhone());
				state.setString(6, emp.getUserName());
				state.setString(7, emp.getPassword());
				state.setInt(8, emp.getEmpId());
				
				System.out.println(state);
				
				rowUpdate =  state.executeUpdate() > 0;
		}  	
				return rowUpdate;
			
		
		
	}
	
	
	public static List<Employee> selectEmployee(int empId){
		
		ArrayList<Employee> empSelectList = new ArrayList<>();
		
		try (Connection con = DBconnect.getConnection();
				PreparedStatement state = con.prepareStatement(GET_EMP_BY_ID_ADMIN);)
		
		{
			state.setInt(1, empId);
			System.out.println(state);
			ResultSet result = state.executeQuery();
			
			while(result.next()) {
				
			//	int Id = result.getInt("empId");
				String fname = result.getString("firstName");
				String lname = result.getString("lastName");
				String address = result.getString("address");
				String dob = result.getString("dob");
				int phone = result.getInt("phone");
				String username = result.getString("userName");
				String password = result.getString("password");
				
				
				Employee emp = new Employee(empId,fname,lname,address,dob,phone,username,password);
				
				empSelectList.add(emp);
				
			}
			
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
		return empSelectList;
		
	}

	public static boolean deleteEmployee(Employee emp) {
		
		boolean rowDelete = false;
		
		try(Connection con = DBconnect.getConnection();
				PreparedStatement state = con.prepareStatement(DELETE_EMPLOYEE);)
		{
			state.setInt(1, emp.getEmpId());
			rowDelete = state.executeUpdate() > 0;
			
			System.out.println(state);
			
			state.close();
			con.close();
			
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
		
		return rowDelete;
		
	}

}
