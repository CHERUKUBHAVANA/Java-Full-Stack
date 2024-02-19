
public class LeftRotateUsingReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7};
		int d = 1;
		leftRotateByD(arr,d);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

	private static void leftRotateByD(int[] arr, int d) {
		// TODO Auto-generated method stub
		reverse(arr,0,d-1);
		reverse(arr,d,arr.length-1);
		reverse(arr,0,arr.length-1);
	}

	private static void reverse(int[] arr,int start,int end) {
		// TODO Auto-generated method stub
		int temp = 0;
		while(start<end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

}
