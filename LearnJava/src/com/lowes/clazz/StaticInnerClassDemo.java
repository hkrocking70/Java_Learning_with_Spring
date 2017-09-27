package com.lowes.clazz;

public class StaticInnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnotherOuterClass oClass = new AnotherOuterClass();
		int oVal = oClass.getVal();
		System.out.println(oVal);
		
		AnotherOuterClass.InnerClass iClass = new AnotherOuterClass.InnerClass();
		System.out.println(iClass.getVal());
	}

}
