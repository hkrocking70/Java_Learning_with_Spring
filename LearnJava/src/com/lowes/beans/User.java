package com.lowes.beans;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import com.sun.xml.internal.txw2.annotation.XmlElement;

@XmlRootElement
public class User implements Serializable {
	
	int userId;
	String userName;
	String userMail;
	
	String contactNumber;
	Address address;
	
	public User(int userId, String userName, String userMail, String contactNumber, Address address) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userMail = userMail;
		this.contactNumber = contactNumber;
		this.address = address;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getUserId() {
		return userId;
	}
	
	@XmlElement
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return userName;
	}
	
	@XmlElement
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserMail() {
		return userMail;
	}
	
	@XmlElement
	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}
	
	public String getContactNumber() {
		return contactNumber;
	}
	
	@XmlElement
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	public Address getAddress() {
		return address;
	}
	
	@XmlElement
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {		
		return userName + " : " + userMail + " : " + contactNumber;
	}
	
}
