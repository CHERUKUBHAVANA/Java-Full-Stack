package com.junit.learning;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS) //only one instance is created for all test methods in this class.
public class TestBeforeAfter {
	TestBeforeAfter() {
		System.out.println("Test Object is created");
	}
	Shapes shape = null;
	@BeforeEach
	void init() {
		shape = new Shapes();
		System.out.println("Before each test case runs");
	}
	@Test
	void testComputeSquareArea() {
		assertNotEquals(572, shape.computeSquareArea(24), "Area of square calculation is wrong!");
		System.out.println("Test executed");
	}
	@Test
	void testComputeCircleArea() {
		assertEquals(78.5, shape.computeCircleArea(5), ()->"Area of circle calculation is wrong!");
		System.out.println("Test executed");
	}
	@AfterEach
	void destroy() {
		System.out.println("After test");
	}
	@BeforeAll
	void beforeAll() {
		System.out.println("Before all tests");
	}
	@AfterAll
	void afterAll() {
		System.out.println("After all tests");
	}
}
