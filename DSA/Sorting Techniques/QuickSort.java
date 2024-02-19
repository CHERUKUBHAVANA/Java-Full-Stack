
public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,18,21,6,16,10,18};
		quickSort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

	private static void quickSort(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		if(low>=high)
			return;
		int partitionIndex = quick(arr,low,high);
		quickSort(arr,low,partitionIndex - 1);
		quickSort(arr,partitionIndex + 1,high);
	}

	private static int quick(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		int pivotIndex = low;
		int i = low;
		int j = high;
		while(i<j) {
			while(arr[i]<=arr[pivotIndex] && i<high)
				i++;
			while(arr[j]>arr[pivotIndex] && j>=low)
				j--;
			if(i<j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[low];
		arr[low] = arr[j];
		arr[j] = temp;
		return j;
	}

}
