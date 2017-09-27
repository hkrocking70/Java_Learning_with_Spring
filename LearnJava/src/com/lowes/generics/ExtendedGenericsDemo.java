package com.lowes.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExtendedGenericsDemo {
	public static void main(String[] args) {
		List<Emp> employee = Arrays.asList(new Emp("Lowes", "Engg"), new Emp("Himanshu", "Mktg"));
		// printEmployees(employee);
		empListNames(employee);

		List<Contractor> contractor = Arrays.asList(new Contractor("anmol", "soft", 3));
		empListNames(contractor);

	}

	static void printEmployees(List emps) {
		for (int i = 0; i < emps.size(); i++) {
			Emp obj = (Emp) emps.get(i);
			System.out.println(obj.getDept() + " : " + obj.getEmpName());
		}
	}

	static <T extends Emp> void empListNames(List<T> emp) {
		for (T t : emp) {
			System.out.println(t.getEmpName() + " " + t.getDept());
		}
	}

}

class Contractor extends Emp {

	int duration;

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Contractor(String empName, String dept, int duration) {
		super(empName, dept);
		this.duration = duration;
	}

	public Contractor() {
		super();
		// TODO Auto-generated constructor stub
	}

}

class Emp {
	String empName;
	String dept;

	public Emp(String empName, String dept) {
		super();
		this.empName = empName;
		this.dept = dept;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
}
