package com.lowes.clazz;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class CalculationsDemo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Calculations cal = new Calculations();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter First Number: ");
		int f = Integer.parseInt(br.readLine());
		System.out.println("Enter Second Number: ");
		int se = Integer.parseInt(br.readLine());
		
		System.out.println("Addition: " + cal.add(f,se));
		System.out.println("Subtraction: " + cal.sub(f,se));
		System.out.println("Multiplication: " + cal.mul(f,se));
		

	}

}
