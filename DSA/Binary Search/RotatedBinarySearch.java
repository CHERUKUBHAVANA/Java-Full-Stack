package binarySearch;

public class RotatedBinarySearch{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,4,5,6,7,0,1,2};
		System.out.println(searchInRotatedSortedArray(arr,5));
	}

	static int searchInRotatedSortedArray(int[] arr,int target) {
		// TODO Auto-generated method stub
		int start = 0;
		int end = arr.length - 1;
		int pivot = -1;
		while(start <= end) {
			int mid = start + (end - start) / 2;
			if(arr[mid] > arr[mid + 1]) {
				pivot = mid;
				break;
			}
			else if(arr[mid] < arr[mid - 1]) {
				pivot = mid - 1;
				break;
			}
			else if(arr[mid] > arr[start])
				start = mid + 1;
			else
				end = mid - 1;
		}
		start = 0;
		end = pivot;
		while(start <= end) {
			int mid = start + (end - start) / 2;
			if(arr[mid] == target)
				return mid;
			if(target > arr[mid])
				start = mid + 1;
			else
				end = mid - 1;
		}
		start = pivot;
		end = arr.length - 1;
		while(start <= end) {
			int mid = start + (end - start) / 2;
			if(arr[mid] == target)
				return mid;
			if(target > arr[mid])
				start = mid + 1;
			else
				end = mid - 1;
		}
		return -1;
	}

}
