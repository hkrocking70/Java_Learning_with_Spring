package com.lowes.generics;

public class GenericClassDemo {

	public static void main(String[] args) {
		
		Category<String> electronics = new Category<String>();
		
		electronics.add("Refrigerator");
		electronics.add("TV");
		
		electronics.printCat();
		
		Category<Integer> prices = new Category<>();
		prices.add(110);
		prices.add(120);
		prices.add(130);
		
		prices.printCat();

	}

}

//Imported Generic class in another class.