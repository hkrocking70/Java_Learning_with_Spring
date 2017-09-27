package com.lowes.beans;

public class Employee {
	
	int empId;
	String empName;
	String empDept;
	
	public Employee(int empId, String empName, String empDept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
	}
	
	public Employee() {
		super();
	}
	
	@Override
	public String toString() {
		return empName;
	}

}
