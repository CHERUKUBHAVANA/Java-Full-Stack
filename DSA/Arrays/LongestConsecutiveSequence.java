import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,4,3,2,1};
		System.out.println(lengthOfLongestConsecutiveSeq1(arr));
		System.out.println(lengthOfLongestConsecutiveSeq2(arr));
	}

	private static int lengthOfLongestConsecutiveSeq2(int[] arr) {
		// TODO Auto-generated method stub
		int maxLength = 0;
		Set<Integer> hs = new HashSet<>();
		for(int i : arr)
			hs.add(i);
		
		int i = 0;
		int max = 0;
		while(i<arr.length) {
			if(hs.contains(arr[i]-1)) {
				i++;
			}
			else {
				int num = arr[i];
				while(hs.contains(num)) {
					max++;
					num++;
				}
				maxLength = Math.max(maxLength, max);
				max = 0;
				i++;
			}
		}
		return maxLength;
	}

	private static int lengthOfLongestConsecutiveSeq1 (int[] arr) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		int i = 0;
		int j = 1;
		int maxSeqLength = 0;
		int max = 0;
		while(j<arr.length && i<arr.length) {
			if(arr[j]-arr[i] == 1) {
				max++;
				j++;
				i++;
			}
			else {
				maxSeqLength = Math.max(maxSeqLength, max);
				max = 0;
				i++;
				j = i+1;
			}
		}
		maxSeqLength = Math.max(maxSeqLength, max);
		return maxSeqLength+1;
	}

}
