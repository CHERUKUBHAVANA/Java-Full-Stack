package arrays;

import java.util.ArrayList;

public class SumSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,1};
		ArrayList<Integer> a = new ArrayList<>();
		int k = 3;
		sumSubseq(0,arr,a,k,0);
	}
	public static void sumSubseq(int index,int[] arr,ArrayList<Integer> a,int k,int sum) {
		if(index>=arr.length) {
			if(sum==k) {
				System.out.println(a);
				return;
			}
			return;
		}
		a.add(arr[index]);
		sum += arr[index];
		sumSubseq(index+1,arr,a,k,sum);
		a.remove(a.size()-1);
		sum -= arr[index];
		sumSubseq(index+1,arr,a,k,sum);
	}
}
