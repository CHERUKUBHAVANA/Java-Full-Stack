
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,18,6,21,13,20,18,8};
		bubbleSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static void bubbleSort(int[] arr) {
		// TODO Auto-generated method stub
		int temp = 0;
//		for(int i=0;i<arr.length-1;i++) {
//			for(int j=0;j<arr.length-1;j++) {
//				if(arr[j]>arr[j+1]) {
//					temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//				}
//			}
//		}
		
		for(int i=arr.length-1;i>=1;i--) {
			boolean didSwap = false;
			for(int j=0;j<i;j++) {
				if(arr[j]>arr[j+1]) {
					didSwap = true;
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			if(!didSwap)
				break;
		}
	}
}
