package com.lowes.enums;

public class EnumDemo {

	public static void main(String[] args) {

		Directions dir = Directions.SOUTH;

		switch (dir) {
		case SOUTH:
			System.out.println("South States........");
			break;
		case NORTH:
			System.out.println("North States........");
			break;
		}

	}

}
