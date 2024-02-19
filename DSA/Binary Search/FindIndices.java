//find first and last indices of an element in a given sorted array.
package binarySearch;

import java.util.Arrays;

public class FindIndices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,7,7,8,9,10};
		System.out.println(Arrays.toString(indices(arr,7)));
	}
	static int[] indices(int[] arr,int target) {
		int[] res = {-1,-1};
		res[0] = findIndices(arr,target,true);
		if(res[0] != -1)
			res[1] = findIndices(arr,target,false);
		return res;
	}
	static int findIndices(int[] arr, int target,boolean findStartIndex) {
		// TODO Auto-generated method stub
		int start = 0;
		int end = arr.length - 1;
		int ans = -1;
		while(start <= end) {
			int mid = start + (end - start) / 2;
			if(target > arr[mid])
				start = mid + 1;
			else if(target < arr[mid])
				end = mid - 1;
			else {
				ans = mid;
				if(findStartIndex)
					end = mid - 1;
				else
					start = mid + 1;
			}
		}
		return ans;
	}
	
}
