package com.lowes.interfaces;

public class InterfaceDemo {
	public static void main(String[] args) {
		
		Calculations cal = new RegularCal();
		System.out.println(cal.add(20,30));
		
		Calculations www = new Calculations() {
			
			@Override				//Anonymous Inner Class
			public int add(int x, int y) {
				// TODO Auto-generated method stub
				return x+y*2;
			}
		};
		System.out.println(www.add(20, 30));
		
	}
}

interface Calculations {
	int add(int x,int y);
}

class RegularCal implements Calculations {

	@Override
	public int add(int a,int b) {
		
		return a+b;
	}
	
}
