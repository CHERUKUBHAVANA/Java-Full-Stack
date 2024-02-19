
public class SortedArrayOf012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0, 2, 1, 2, 0, 1, 2, 0};
		sortedArray1(arr);
		for(int i = 0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		int[] arr1 = {0, 2, 1, 2, 0, 1, 2, 0};
		sortedArray2(arr1);
		for(int i = 0; i<arr1.length; i++)
			System.out.print(arr1[i]+" ");
	}

	private static void sortedArray2(int[] arr) {
		// TODO Auto-generated method stub
		int low = 0;
		int mid = 0;
		int high = arr.length-1;
		
		while(mid <= high) {
			if(arr[mid] == 1)
				mid++;
			else if(arr[mid] == 0) {
				int temp = arr[mid];
				arr[mid] = arr[low];
				arr[low] = temp;
				low++;
				mid++;
			}
			else {
				int temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;
				high--;
			}
		}
	}

	private static void sortedArray1(int[] arr) {
		// TODO Auto-generated method stub
		int zeros = 0;
		int ones = 0;
		int twos = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0)
				zeros++;
			else if(arr[i]==1)
				ones++;
			else
				twos++;
		}
		for(int i=0;i<zeros;i++) {
			arr[i] = 0;
		}
		for(int i=zeros;i<zeros+ones;i++) {
			arr[i] = 1;
		}
		for(int i=zeros+ones;i<arr.length;i++) {
			arr[i] = 2;
		}
	}

}
