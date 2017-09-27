package com.lowes.concepts;

public class GarbageCollectionDemo {
	public static void main(String[] args) {
		
		System.out.println(Runtime.getRuntime().freeMemory());
		
		String id;
		
		for (int i = 0; i < 2000000; i++) {
			id = "id : " + i;
		}
		System.out.println("After: " + Runtime.getRuntime().freeMemory());
		System.gc();
		
		System.out.println("After GC: " + Runtime.getRuntime().freeMemory());
	}
}
