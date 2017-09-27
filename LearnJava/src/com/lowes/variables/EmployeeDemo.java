package com.lowes.variables;

public class EmployeeDemo {

	public static void main(String[] args) {
		Access anmol = new Access();
		
		anmol.addEmployee();
		System.out.println(anmol.getEmployeeCount());
		
		anmol.access();
		System.out.println(anmol.getAccessTimes());
		
		Access himashu = new Access();
		
		himashu.addEmployee();
		System.out.println(himashu.getEmployeeCount());
		
		himashu.access();
		System.out.println(himashu.getAccessTimes());
		
		Access bhaiHaiApna = new Access();
		
		bhaiHaiApna.addEmployee();
		System.out.println(bhaiHaiApna.getEmployeeCount());
		
		bhaiHaiApna.access();
		System.out.println(bhaiHaiApna.getAccessTimes());


	}

}
