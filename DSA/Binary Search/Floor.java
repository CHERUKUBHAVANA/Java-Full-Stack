package binarySearch;

public class Floor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,5,9,14,16,18};
		System.out.println(floorOf(arr,1,0,arr.length - 1));
	}

	static int floorOf(int[] arr, int target, int start, int end) {
		// TODO Auto-generated method stub
		//biggest number that is less than or equal to target
		if(end == -1)
			return -1;
		if(start > end)
			return arr[end];
		int mid = start + (end - start)/2;
		if(arr[mid] == target)
			return arr[mid];
		if(target > arr[mid])
			return floorOf(arr,target,mid + 1,end);
		return floorOf(arr,target,start,mid - 1);
	}

}
