package com.learning.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
//		fail("Not yet implemented");
		Calculator c = new Calculator();
		int actual = c.divide(10, 5);
		int expectedResult = 2;
		assertEquals(expectedResult, actual);
	}

}
