//find the peak of a mountain.
package binarySearch;

public class PeakElement {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] arr = {0,2,1,0};
//		System.out.println(peakElement(arr));
//	}
//
//	static int peakElement(int[] arr) {
//		// TODO Auto-generated method stub
//		Arrays.sort(arr);
//		return arr[arr.length - 1];
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,2,1,0};
		System.out.println(peakElement(arr));
	}
	static int peakElement(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while(start < end) {
			int mid = start + (end - start) / 2;
			if(arr[mid] > arr[mid + 1])
				end = mid;
			else
				start = mid + 1;
		}
		return arr[start];
	}
}
