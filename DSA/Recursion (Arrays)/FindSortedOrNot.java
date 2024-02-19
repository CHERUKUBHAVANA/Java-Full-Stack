package recursion_arrays;

public class FindSortedOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,6,8,22,45};
		System.out.println(isSorted(arr,0));
	}

	static boolean isSorted(int[] arr,int i) {
		// TODO Auto-generated method stub
		if(i == arr.length - 1)
			return true;
		return (arr[i] < arr[i+1]) && isSorted(arr,i+1);
	}

}
