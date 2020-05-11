package com.lms.model;

public class Employee {
	
	private int empId;
	private String firstName;
	private String lastName;
	private String address;
	private String dob;
	private int phone;
	private String userName;
	private String password;
	
	public Employee(int empId, String firstName, String lastName, String address, String dob, int phone,
			String userName, String password) {
		
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.dob = dob;
		this.phone = phone;
		this.userName = userName;
		this.password = password;
		
	}
	
	public Employee(String firstName, String lastName, String address, String dob, int phone,
			String userName, String password) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.dob = dob;
		this.phone = phone;
		this.userName = userName;
		this.password = password;
		
	}
	
	
	public Employee(int empId) {
		this.empId = empId;
	}

	public int getEmpId() {
		return empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAddress() {
		return address;
	}

	public String getDob() {
		return dob;
	}

	public int getPhone() {
		return phone;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	
}
