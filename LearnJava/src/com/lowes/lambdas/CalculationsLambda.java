package com.lowes.lambdas;

public class CalculationsLambda {

	public static void main(String[] args) {
		
		Calculations add = (a,b) -> a+b;
		System.out.println(add.cal(20,30));
		
		Calculations sub = (a,b) -> a-b;
		System.out.println(sub.cal(50, 10));
		
		Calculations mul = (a,b) -> a*b;
		System.out.println(mul.cal(50, 10));
		
		Calculations div = (a,b) -> a/b;
		System.out.println(div.cal(50, 10));
		
	}

}

interface Calculations {
	
	int cal(int x,int y);
	
}
