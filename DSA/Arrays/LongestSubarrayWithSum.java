import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,2,0,0,0,1,3,1,1,-2,1,1};
		int k = 5;
		System.out.println("Length of longest sub array with sum 7	 is : "+lengthOfLongestSubArray1(arr,k));
		System.out.println("Length of longest sub array with sum 7	 is : "+lengthOfLongestSubArray2(arr,k));
		System.out.println("Length of longest sub array with sum 7	 is : "+lengthOfLongestSubArray3(arr,k));
	}

	private static int lengthOfLongestSubArray3(int[] arr, int k) {
		// TODO Auto-generated method stub
		int start = 0;
		int end = 0;
		int sum = 0;
		int maxLength = 0;
		
		while(end<arr.length && start<arr.length) {
			sum += arr[end];
			if(sum==k) {
				maxLength = Math.max(maxLength,end-start+1);
				
			}
			else if(sum>k) {
				sum -= arr[start];
				start++;
				
			}
			end++;
		}
		return maxLength;
	}

	private static int lengthOfLongestSubArray2(int[] arr, int k) {
		// TODO Auto-generated method stub
		int maxLength = 0;
		int sum = 0;
		int length = 0;
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
			if(sum==k) {
				maxLength = Math.max(maxLength, i+1);
			}
			if(map.containsKey(sum-k)) {
				length = i - map.get(sum-k);
				if(length > maxLength)
					maxLength = length;
			}
			if(!map.containsKey(sum))
			map.put(sum, i);
		}
		return maxLength;
	}

	private static int lengthOfLongestSubArray1(int[] arr,int k) {
		// TODO Auto-generated method stub
		int maxLength = 0;
		for(int i=0;i<arr.length;i++) {
			int sum = 0;
			for(int j=i;j<arr.length;j++) {
				sum += arr[j];
				if(sum==k) {
					if(j-i+1 > maxLength) {
						maxLength = j-i+1;
					}
						
				}
			}
		}
		
		
		return maxLength;
	}

}
