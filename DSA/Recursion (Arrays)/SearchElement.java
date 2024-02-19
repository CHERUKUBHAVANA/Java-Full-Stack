package recursion_arrays;

public class SearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,18,21,10,6};
		int target = 6;
		System.out.println(foundAt(arr,0,target));
	}

	static int foundAt(int[] arr, int index, int target) {
		// TODO Auto-generated method stub
		if(index == arr.length)
			return -1;
		if(arr[index] == target)
			return index;
		return foundAt(arr, index+1, target);
	}

}
