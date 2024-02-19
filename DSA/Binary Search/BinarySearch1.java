package binarySearch;

public class BinarySearch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {10,12,23,46,70,88};
		System.out.println(binarySearch(array,46,0,array.length-1));
	}

	static int binarySearch(int[] array, int target,int start,int end) {
		// TODO Auto-generated method stub
		if(start > end)
			return -1;
		int mid = start + (end - start)/2;
		if(array[mid] == target)
			return mid;
		if(target < array[mid])
			return binarySearch(array,target,start,mid - 1);
		else
			return binarySearch(array,target,mid + 1,end);
	}

}
