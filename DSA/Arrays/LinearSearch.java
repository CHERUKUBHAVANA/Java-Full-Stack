
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		int num = 4;
		System.out.print("Element found at index "+linearSearch(arr,num));	
	}

	private static int linearSearch(int[] arr, int num) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				return i;
			}
		}
		return -1;
	}

}
