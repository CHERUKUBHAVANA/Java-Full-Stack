/*find the position of an element in a sorted array of infinite elements i.e, start and end 
 are not known to us*/
package binarySearch;

public class InfiniteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
		System.out.println(positionOf(arr,10));
	}
	static int positionOf(int[] arr,int target) {
		int start = 0;
		int end = 1;
		while(target > arr[end]) {
			start = end + 1;
			end = 2 * (end + 1) + start;
		}
		return binarySearch(arr,target,start,end);
	}
	static int binarySearch(int[] arr,int target,int start,int end) {
		if(start > end)
			return -1;
		int mid = start + (end - start) / 2;
		if(arr[mid] == target)
			return mid;
		if(target > arr[mid])
			return binarySearch(arr,target,mid + 1,end);
		else
			return binarySearch(arr,target,start,mid - 1);
	}
}
