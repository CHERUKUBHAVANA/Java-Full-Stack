package com.junit.learning;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class TestTrial {
	Shapes shape = new Shapes();
	SortArray array = new SortArray();
	@Test
	void testComputeSquareArea() {
//		assertEquals(572, shape.computeSquareArea(24), "Area of square calculation is wrong!");
		assertNotEquals(572, shape.computeSquareArea(24), "Area of square calculation is wrong!");
	}
	@Test
	void testComputeCircleArea() {
		assertEquals(74.5, shape.computeCircleArea(5), ()->"Area of circle calculation is wrong!");
	}
	@Test
	void testDemo() {
		String s = "JUNIT";
		assertTrue(s.equals("JUNIT"), "Test demo failed!");
	}
	@Test
	void testDemo1() {
		String s = "JUNIT";
		assertFalse(s.equals("JUNT"));
	}
	@Test
	void testException() {
//		int[] arr = null;
		int[] arr = {1, 4, 2};
		assertThrows(NullPointerException.class, ()->Arrays.sort(arr));
	}
	
	@Test
	void testTimeOut() {
		int unsorted[] = {2, 5, 1};
		assertTimeout(Duration.ofMillis(10), ()->array.sortingArray(unsorted));
	}

}
