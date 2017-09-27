package com.lowes.generics;

import java.util.*;

public class GenericMethodDemo {
	public static void main(String[] args) {
		
		// List<Integer> marks = new ArrayList<Integer>();
		// marks.add();

		int[] marksList = {10, 20, 30};

		List<Integer> marks = Arrays.asList(30, 40, 90, 100);
		//System.out.println(marks);
		List<String> departments = Arrays.asList("Civil", "Mechanical", "CSE", "ECE");
		
		// printMarks(marks);
		// printDept(departments);
		printElements(marks);
		printElements(departments);
		
		List<Boolean> boo = Arrays.asList(true,false);
		printElements(boo);
	}
	
	static <T> void printElements(List<T> elements){
		for (T t : elements) {
			System.out.println(t);
		}
	}
	
	static void printMarks(List<Integer> marksList){
		for(Integer mark : marksList){
			System.out.println(mark);
		}
	}
	
	/*static <Integer> void printMarks(List<Integer> marksList){
		for(Integer mark : marksList){
			System.out.println(mark);
		}
	} */   //Used as reference to print any type of object and not related to Integer only
	
	static void printDept(List<String> departments){
		for(String dept : departments){
			System.out.println(dept);
		}
	}
}
