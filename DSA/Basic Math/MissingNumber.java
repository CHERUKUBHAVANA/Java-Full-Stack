
public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,4,7,5,6};
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		int n = arr.length+1;
		int actual_sum = (n*(n+1))/2;
		System.out.print(actual_sum - sum);
	}

}
