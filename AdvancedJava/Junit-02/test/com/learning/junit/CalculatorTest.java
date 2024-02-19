package com.learning.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	 //annotation present in org.junit.jupiter.api, indicates the platform/the test engine to run this method for testing.
	// Its visibility can be public/protected/default.
	//In JUnit4, it should be public, in JUnit5 it can be default/public/protected.
	Calculator c = new Calculator();
	@Test
	void test1() {
		int expected = c.divide(10,5);
		int actual = 2;
		assertEquals(expected , actual); //Assertions static method
	}
	
	@Test
	void test2() {
		int expected = c.divide(24, 3);
		int actual = 8;
		assertEquals(expected , actual);
	}
	

}