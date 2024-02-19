public class LeftRotateArrayBy1 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		leftRotateArrayBy1(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

	private static void leftRotateArrayBy1(int[] arr) {
		// TODO Auto-generated method stub
		int temp = arr[0];
		for(int i=0;i<arr.length-1;i++) {
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = temp;
	}
}
