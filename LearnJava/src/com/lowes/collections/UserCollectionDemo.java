package com.lowes.collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.lowes.beans.Employee;
import com.lowes.beans.EmployeeComparator;
import com.lowes.beans.Vendor;

public class UserCollectionDemo {
	public static void main(String[] args) {
		usingComparable();		
		TreeSet<Employee> employeeSet = new TreeSet<Employee>(new EmployeeComparator());	
		employeeSet.add(new Employee(1, "Lowes", "Engg"));
		employeeSet.add(new Employee(2, "Himanshu", "DevOps"));
		employeeSet.add(new Employee(3, "Anmol", "Tech"));
		
		System.out.println(employeeSet);
		employeeSet = (TreeSet) employeeSet.descendingSet();
		System.out.println(employeeSet);
	}
	
	static void usingComparable() {
		Set<Vendor> userSet = new TreeSet<Vendor>();
		userSet.add(new Vendor(1, "Vodafone", "Pune"));
		userSet.add(new Vendor(2, "Airtel", "Bangalore"));
		userSet.add(new Vendor(3, "Lowes", "Bangalore"));
		
		System.out.println(userSet);
	}
}
