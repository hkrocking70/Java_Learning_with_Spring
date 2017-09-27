package com.lowes.clazz;

public class OuterClass {
	int outerVal = 10;
	
	class InnerClass {
		int innerVal = 20;
		
		int getValue() {
			return innerVal;
		}
		
		int getTotal() {
			return outerVal + innerVal;
		}
	}
	
	int getValue() {
		return outerVal;
	}
}
