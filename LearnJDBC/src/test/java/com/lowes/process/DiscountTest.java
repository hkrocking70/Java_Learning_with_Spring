package com.lowes.process;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiscountTest {

	@Test
	public void testDisAmount() {
		Discount dis = new Discount();
		
		assertEquals(90.0f, dis.amountToPay(100,10.736f),0.8);
		
	}

}
