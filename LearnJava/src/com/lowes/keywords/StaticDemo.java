package com.lowes.keywords;

public class StaticDemo {
	static {
		System.out.println("Always executes first.");
	}

	public static void main(String[] args) {
		System.out.println("StaticDemo.main()");
	}
}
