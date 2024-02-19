
public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,18,21,6,16,10,18};
		mergeSort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

	private static void mergeSort(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		if(low>=high)
			return;
		int mid = (low+high)/2;
		mergeSort(arr,low,mid);
		mergeSort(arr,mid+1,high);
		merge(arr,low,mid,high);
	}

	private static void merge(int[] arr, int low, int mid, int high) {
		// TODO Auto-generated method stub
		int left = low;
		int right = mid+1;
		int[] temp = new int[low+high+1];
		int k = 0;
		while(left<=mid && right<=high) {
			if(arr[left]<=arr[right])
				temp[k++] = arr[left++];
			else
				temp[k++] = arr[right++];
		}
		while(left<=mid) {
			temp[k++] = arr[left++];
		}
		while(right<=high) {
			temp[k++] = arr[right++];
		}
		
		for(int i=low;i<=high;i++) {
			arr[i] = temp[i-low];
		}
	}
	
}
