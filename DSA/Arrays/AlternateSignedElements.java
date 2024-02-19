import java.util.ArrayList;
import java.util.Arrays;

public class AlternateSignedElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,-4,-5};
		int[] ans = rearrange1(arr);
		for(int i : ans)
			System.out.print(i+" ");
		
		System.out.println();
		
		ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(1, 2, -4, -5, 3, 4));
		ArrayList<Integer> ans2 = rearrange2(arr2);
		for(int i : ans2)
			System.out.print(i+" ");
	}

	private static ArrayList<Integer> rearrange2(ArrayList<Integer> arr) {
		// TODO Auto-generated method stub
		ArrayList<Integer> posArr = new ArrayList<>();
		ArrayList<Integer> negArr = new ArrayList<>();
		
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i)>=0) {
				posArr.add(arr.get(i));
			}
			else
				negArr.add(arr.get(i));
		}
		if(posArr.size()<negArr.size()) {
			for(int i=0;i<posArr.size();i++) {
				arr.set(2*i, posArr.get(i));
				arr.set(2*i+1, negArr.get(i));
			}
			int index = posArr.size()*2;
			for(int i=posArr.size();i<negArr.size();i++) {
				arr.set(index, negArr.get(i));
				index++;
			}
		}
		else {
			for(int i=0;i<negArr.size();i++) {
				arr.set(2*i, posArr.get(i));
				arr.set(2*i+1, negArr.get(i));
			}
			int index = negArr.size()*2;
			for(int i=negArr.size();i<posArr.size();i++) {
				arr.set(index, posArr.get(i));
				index++;
			}
		}
		return arr;
	}

	private static int[] rearrange1(int[] arr) { // when no.of positive elements = no.of negative elements
		// TODO Auto-generated method stub
		int[] ans = new int[arr.length];
		int posIndex = 0;
		int negIndex = 1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=0) {
				ans[posIndex] = arr[i];
				posIndex += 2;
			}
			else {
				ans[negIndex] = arr[i];
				negIndex += 2;
			}
		}
		return ans;
	}

}
