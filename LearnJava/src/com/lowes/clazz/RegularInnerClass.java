package com.lowes.clazz;

public class RegularInnerClass {
	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		System.out.println(oc.getValue());
		
		OuterClass.InnerClass ic = oc.new InnerClass();
		System.out.println(ic.getTotal());
	}
}
