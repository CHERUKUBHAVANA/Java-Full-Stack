public class LeftRotateArrayByd {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int d = 4;
		leftRotateArrayByd(arr,d);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static void leftRotateArrayByd(int[] arr,int d) {
		// TODO Auto-generated method stub
		d = d%arr.length;
		int[] temp = new int[d];
		for(int i=0;i<d;i++) {
			temp[i] = arr[i];
		}
		for(int i=d;i<arr.length;i++) {
			arr[i-d] = arr[i];
		}
		for(int i=0;i<temp.length;i++) {
			arr[arr.length-d+i] = temp[i];
		}
	}
}
