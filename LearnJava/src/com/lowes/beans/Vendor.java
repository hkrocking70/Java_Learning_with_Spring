package com.lowes.beans;

public class Vendor implements Comparable<Vendor>{
	
	int vendorId;
	String vendorName;
	String vendorLocation;
	
	public Vendor(int vendorId, String vendorName, String vendorLocation) {
		super();
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.vendorLocation = vendorLocation;
	}

	public Vendor() {
		super();		
	}
	
	@Override
	public String toString() {
		return vendorName;
	}

	@Override
	public int compareTo(Vendor vendor) {
		return vendorName.compareTo(vendor.vendorName);
	}
	
}
