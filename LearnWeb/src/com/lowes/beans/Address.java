package com.lowes.beans;

public class Address {
	
	int addrId;
	String street;
	String city;
	String state;
	
	public int getAddrId() {
		return addrId;
	}
	
	public void setAddrId(int addrId) {
		this.addrId = addrId;
	}
	
	public Address(int addrId, String street, String city, String state) {
		super();
		this.addrId = addrId;
		this.street = street;
		this.city = city;
		this.state = state;
	}

	public String getStreet() {
		return street;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
}
