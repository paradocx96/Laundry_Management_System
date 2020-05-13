package com.lms.model;

public class Customer {
	
	private int custId;
	private String firstName;
	private String lastName;
	private String email;
	private int phone;
	private String address;
	private String userName;
	private String password;
	
	public Customer(int custId, String firstName, String lastName, String email, int phone, String address,
					String userName, String password) {
		this.custId = custId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.userName = userName;
		this.password = password;
	}
	
	public Customer(String firstName, String lastName, String email, int phone, String address, String userName,
			String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.userName = userName;
		this.password = password;
	}

	
	public Customer(int custId,String firstName, String lastName, String email, int phone, String address) {
		
		super();
		this.custId = custId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}
	
	
	
	public Customer(int custId) {
		super();
		this.custId = custId;
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public int getCustId() {
		return custId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public int getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}


