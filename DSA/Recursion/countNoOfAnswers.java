package arrays;
public class countNoOfAnswers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,1};
		int k = 2;
		System.out.print(sumSubseq(0,arr,k,0));
	}
	public static int sumSubseq(int index,int[] arr,int k,int sum) {
		if(index>=arr.length) {
			if(sum==k) {
				return 1;
			}
			return 0;
		}
		sum += arr[index];
		int l =  sumSubseq(index+1,arr,k,sum);
		sum -= arr[index];
		int r = sumSubseq(index+1,arr,k,sum);
		return l + r;
	}
}
