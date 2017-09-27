package com.lowes.collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		List<Integer> marks = new ArrayList<Integer>();  //Generics
		
		marks.add(76);
		marks.add(760);
		marks.add(7600);		
		
		System.out.println(marks);

	}

}

//List is different from array in a way that list size is not fixed