package com.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testSum() {
		Calculator cal=new Calculator();
		assertEquals(30,cal.sum(10, 20));
		assertEquals(0,cal.sum(0, 0));
		assertEquals(-30,cal.sum(-10, -20));
	}

}
