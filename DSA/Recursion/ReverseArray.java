
public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,18,6,21,13};
//		reversedArray1(arr);
//		reversedArray2(arr);
		reversedArray3(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	private static void reversedArray3(int[] arr,int l,int r) {
		// TODO Auto-generated method stub
		if(l>=r) {
			return;
		}
		int temp = arr[l];
		arr[l] = arr[r];
		arr[r] = temp;
		reversedArray3(arr,l+1,r-1);
	}
	public static void reversedArray2(int[] arr) {
		// TODO Auto-generated method stub
		int l = 0;
		int r = arr.length-1;
		int temp = 0;
		while(l<r) {
			temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			l++;
			r--;
		}
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	public static void reversedArray1(int[] arr) {
		int[] answer = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			answer[arr.length-i-1] = arr[i];
		}
		for(int i=0;i<arr.length;i++)
			System.out.print(answer[i]+" ");
		System.out.println();
	}
}
