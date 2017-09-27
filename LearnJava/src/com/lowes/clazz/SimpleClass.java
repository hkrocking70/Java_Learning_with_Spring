package com.lowes.clazz;

public class SimpleClass {

	public static void main(String[] args) {
		SimpleClass simpleclass = new SimpleClass();
		simpleclass.welcomePerson("bhai");
		simpleclass.welcomePerson();
	}

	void welcomePerson(String name) {
		System.out.println("Welcome " + name);
	}

	void welcomePerson() {
		System.out.println("Welcome");
	}
}