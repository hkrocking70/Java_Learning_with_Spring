package com.lowes.generics;

import java.util.ArrayList;
import java.util.List;

public class Category<T> {
	
	List<T> categories = new ArrayList<>();
	
	void add(T t){
		categories.add(t);
	}
	
	void printCat(){
		for (T t : categories) {
			System.out.println(t);
		}
	}
}
