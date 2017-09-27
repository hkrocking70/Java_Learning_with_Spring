package com.lowes.variables;

public class Access {
	
	static int empCount;
	
	void addEmployee(){
		empCount++;
	}
	
	int getEmployeeCount(){
		return empCount;
	}
	
	
	int accessTimes;
	
	void access(){
		accessTimes++;
	}
	
	int getAccessTimes(){
		return accessTimes;
	}
}
