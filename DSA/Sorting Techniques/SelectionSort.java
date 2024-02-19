
public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = {12,20,6,18,21,32,16,12};
		selectionSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static void selectionSort(int[] arr) {
		// TODO Auto-generated method stub
		int min = 0;
		int temp = 0;
		for(int i=0;i<arr.length-1;i++) {
			min = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			if(min!=i) {
				temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}
	}
}
