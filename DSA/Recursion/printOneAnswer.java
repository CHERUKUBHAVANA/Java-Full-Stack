package arrays;

import java.util.ArrayList;

public class printOneAnswer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,1};
		ArrayList<Integer> a = new ArrayList<>();
		int k = 2;
		sumSubseq(0,arr,a,k,0);
	}
	public static boolean sumSubseq(int index,int[] arr,ArrayList<Integer> a,int k,int sum) {
		if(index>=arr.length) {
			if(sum==k) {
				System.out.println(a);
				return true;
			}
			return false;
		}
		a.add(arr[index]);
		sum += arr[index];
		if(sumSubseq(index+1,arr,a,k,sum)==true) {
			return true;
		}
		a.remove(a.size()-1);
		sum -= arr[index];
		if(sumSubseq(index+1,arr,a,k,sum)==true) {
			return true;
		}
		return false;
	}
}
