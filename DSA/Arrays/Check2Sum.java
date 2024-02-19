import java.util.*;
public class Check2Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,6,5,8,11};
		System.out.println(check2Sum1(arr,1));
		System.out.println(check2Sum2(arr,1));
		System.out.println(check2Sum3(arr,1));
	}

	private static boolean check2Sum3(int[] arr, int sum) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		int first = 0;
		int second = arr.length-1;
		while(second>=0 && first<arr.length) {
			if(arr[first]+arr[second] == sum) {
				return true;
			}
			if(arr[first]+arr[second] < sum) {
				first++;
			}
			else {
				second--;
			}
		}
		return false;
	}

	private static boolean check2Sum2(int[] arr, int sum) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0;i<arr.length;i++) {
			if(list.contains(sum-arr[i]))
				return true;
			list.add(arr[i]);
		}
		return false;
	}

	private static boolean check2Sum1(int[] arr,int sum) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==sum)
					return true;
			}
		}
		return false;
	}

}
