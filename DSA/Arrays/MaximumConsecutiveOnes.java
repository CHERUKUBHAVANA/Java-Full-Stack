
public class MaximumConsecutiveOnes {
	public static void main(String[] args) {
		int[] arr = {1,1,0,1,1,1,0,1,1};
		System.out.print("Maximum no.of ones is : "+maxOnes(arr));
	}

	private static int maxOnes(int[] arr) {
		// TODO Auto-generated method stub
		int maxOnes = 0;
		int ones = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1) {
				ones++;
			}
			else {
				maxOnes = Math.max(maxOnes, ones);
				ones = 0;
			}
		}
		return maxOnes;
	}
}
