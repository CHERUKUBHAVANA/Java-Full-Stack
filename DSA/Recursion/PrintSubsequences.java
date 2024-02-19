package arrays;

import java.util.ArrayList;

public class PrintSubsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,1,2};
		ArrayList<Integer> a = new ArrayList<>();
		printSubseq(0,a,arr);
	}
	public static void printSubseq(int index,ArrayList<Integer> a,int[] arr) {
		if(index==arr.length) {
			System.out.println(a);
			return;
		}
		a.add(arr[index]);
		printSubseq(index+1,a,arr);
		a.remove(a.size()-1);
		printSubseq(index+1,a,arr);
	}
}
