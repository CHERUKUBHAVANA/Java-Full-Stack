import java.util.Arrays;

public class LargestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,6,10,12,18,21,13,12};
		Arrays.sort(arr);
		System.out.println("Largest element is : "+arr[arr.length-1]);
		System.out.println("Largest element is : "+findMax(arr));
	}

	private static int findMax(int[] arr) {
		int max = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max)
				max = arr[i];
		}
		return max;
	}

}
