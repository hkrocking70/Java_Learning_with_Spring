package com.lowes.clazz;

public class AnotherOuterClass {
	int outVal = 123;
	
	int getVal() {
		return outVal;
	}
	
	static class InnerClass {
		int inVal = 1234;
		
		int getVal() {
			return inVal;
		}
	}
}
