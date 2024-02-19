package binarySearch;

public class Ceiling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {2,3,5,9,14,16,18};
		System.out.println(ceilingOf(array,15,0,array.length-1));
	}

	static int ceilingOf(int[] array, int target, int start, int end) {
		// TODO Auto-generated method stub
		//smallest number that is greater equal to target
		if(array[array.length-1] < target)
			return -1;
		if(start > end)
			return array[start];
		int mid = start + (end - start)/2;
		if(array[mid] == target)
			return array[mid];
		if(target > array[mid])
			return ceilingOf(array, target, mid + 1, end);
		else
			return ceilingOf(array, target, start, mid - 1);
	}

}
