
public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,6,10,12,18,21,13,12};
		System.out.println(secondLargest1(arr));
		System.out.println(secondLargest2(arr));
	}

	private static int secondLargest2(int[] arr) {
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				secondLargest = largest;
				largest = arr[i];
			}
			else if(arr[i]>secondLargest && arr[i]!=largest) {
				secondLargest = arr[i];
			}
		}
		return secondLargest;
	}

	private static int secondLargest1(int[] arr) {
		int largest = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>largest)
				largest = arr[i];
		}
		int secondLarge = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>secondLarge && arr[i]!=largest)
				secondLarge = arr[i];
		}
		return secondLarge;
	}

}
