package com.lowes.process;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculationsTest {

	@Test
	public void testAdd() {
		Calculations cal = new Calculations();
		assertEquals(50,cal.add(20, 30));
	}
	
	@Test
	public void testOddNumber() {
		Calculations cal = new Calculations();
		assertTrue(cal.isOdd(21));
	}
}
