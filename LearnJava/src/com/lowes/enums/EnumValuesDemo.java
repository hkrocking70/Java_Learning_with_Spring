package com.lowes.enums;

public class EnumValuesDemo {

	public static void main(String[] args) {
		/*
		int selectedDayNumber = Integer.valueOf(args[0]);
		
		Days selectedDays = null;
		
		switch (selectedDayNumber) {
		case 1:
			selectedDays = Days.MON;			
			break;
		
		case 2:
			selectedDays = Days.WED;
			break;
			
		case 3:
			selectedDays = Days.FRI;
			break;

		}
		*/
		Days selectedDays = Days.FRI;
		
		switch (selectedDays) {
		case MON:
			System.out.println("First day of the week" + selectedDays.Timings);
			break;
		
		case WED:
			System.out.println("Mid week." + selectedDays.Timings);
			break;
		
		case FRI:
			System.out.println("Last Day.." + selectedDays.Timings);
			break;
			
		case SAT:
			System.out.println("Weekend Day." + selectedDays.Timings);
			break;
		}

	}

}
