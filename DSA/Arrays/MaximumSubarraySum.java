
public class MaximumSubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println("Maximum subarray sum is : "+maxSubarraySum1(arr));
		System.out.println("Maximum subarray sum is : "+maxSubarraySum2(arr));
		System.out.println("Maximum subarray sum is : "+maxSubarraySum3(arr));
	}

	private static int maxSubarraySum3(int[] arr) {
		// TODO Auto-generated method stub
		int sum = 0;
		int maxSum = Integer.MIN_VALUE;
		int start_index = 0;
		int end_index = -1;
		int ans_start = -1;
		for(int i=0;i<arr.length;i++) {
			if(sum == 0) {
				start_index = i;
			}
			sum += arr[i];
			if(sum < 0) {
				sum = 0;
			}
			if(sum > maxSum) {
				maxSum = sum;
				ans_start = start_index;
				end_index = i;
			}
		}
		for(int i=ans_start;i<=end_index;i++) {
			System.out.print(arr[i]+" ");
		}
		if(maxSum < 0)
			return 0;
		return maxSum;
	}

	private static int maxSubarraySum2(int[] arr) {
		// TODO Auto-generated method stub
		int maxSum = 0;
		for(int i=0;i<arr.length;i++) {
			int sum = 0;
			for(int j=i;j<arr.length;j++) {
				sum += arr[j];
				if(sum > maxSum)
					maxSum = sum;
			}
		}
		return maxSum;
	}

	private static int maxSubarraySum1(int[] arr) {
		// TODO Auto-generated method stub
		int maxSum = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				int sum = 0;
				for(int k=i;k<=j;k++) {
					sum += arr[k];
				}
				if(sum > maxSum)
					maxSum = sum;
			}
		}
		return maxSum;
	}

}
