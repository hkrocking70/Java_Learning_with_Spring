package com.lowes.strings;

import java.util.StringTokenizer;

public class StringsDemo {

	public static void main(String[] args) {
		String companyName = "Lowe\'s Services India";
		StringTokenizer companyTokens = new StringTokenizer(companyName);
		
		while (companyTokens.hasMoreTokens()) {
			System.out.println(companyTokens.nextToken());
		}
		
		System.out.println("---------------------------------------");
		
		String name = "Himanshu";
		String dept = new String("CSE");
		
		StringBuffer strBuffer = new StringBuffer("Lowe\'s India");
		String sBuffer = strBuffer.toString();
		System.out.println(sBuffer);
		
		StringBuilder strBuilder = new StringBuilder("Lowe\'s India - New Batch");
		String sBuilder = strBuilder.toString();
		System.out.println(sBuilder);
	}

}
