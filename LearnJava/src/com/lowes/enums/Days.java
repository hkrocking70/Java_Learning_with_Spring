package com.lowes.enums;

public enum Days {
	MON("9-6pm"), TUE("9-6pm"), WED("9-6pm"), THU("9-4pm"), FRI("9-3pm"), SAT("Holiday"), SUN("Holiday");

	String Timings;

	private Days(String timings) {
		Timings = timings;
	}

}
