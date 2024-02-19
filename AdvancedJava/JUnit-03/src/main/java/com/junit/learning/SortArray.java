package com.junit.learning;

import java.util.Arrays;

public class SortArray {
	public int[] sortingArray(int[] arr) {
		for(int i=0; i<100000; i++) {
			Arrays.sort(arr);
		}
		return arr;
	}
}
