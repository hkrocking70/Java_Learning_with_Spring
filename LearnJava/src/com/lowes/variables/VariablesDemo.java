package com.lowes.variables;

public class VariablesDemo {
	
	int count;  //instance variable
	static int classCount; //shared variable--class level variable
	
	public static void main(String[] args) {
		
		VariablesDemo vdemo = new VariablesDemo();
		
		System.out.println("Count : " + vdemo.count);
		System.out.println(classCount);
		int localCount = 0;
		System.out.println(localCount);
		
	}
	
}
