package com.lowes.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<String> depart = new HashSet<String>();
		
		depart.add("OPS");		
		depart.add("FIN");
		depart.add("OPS");
		depart.add("OPT");
		depart.add("ENGG");
		
		System.out.println(depart);

	}

}

//set allows unique element only...