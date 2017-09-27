package com.lowes.concurrency;

public class ThreadDemonstration {
	public static void main(String[] args) {		
		Thread.currentThread().setName("Lowe\'s Thread");
		System.out.println(Thread.currentThread().getName());
	}
}
