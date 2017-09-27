package com.lowes.beans;

public class User {
	
	int company;
	int userId;
	String userName;
	String userMail;
	
	String contactNumber;
	Address address;
	
	public User(int company,int userId, String userName, String userMail, String contactNumber, Address address) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userMail = userMail;
		this.contactNumber = contactNumber;
		this.address = address;
		this.company = company;
	}

	public int getCompany() {
		return company;
	}

	public void setCompany(int company) {
		this.company = company;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getUserId() {
		return userId;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserMail() {
		return userMail;
	}
	
	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}
	
	public String getContactNumber() {
		return contactNumber;
	}
	
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {		
		return userName + " : " + userMail + " : " + contactNumber;
	}
	
}
