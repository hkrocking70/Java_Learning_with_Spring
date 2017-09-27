package com.lowes.concepts;

public class VarArgsDemo {

	public static void main(String[] args) {
		
		System.out.println(add(20,30));
		System.out.println(add(20,30,40,60, "ABC"));
	}
	
	@SafeVarargs
	static <T> int add(T... values){
		
		int total = 0;
		
		for (int i = 0; i < values.length-1; i++) {
			total += (int) values[i];
		}
		
		return total;
	}

}
