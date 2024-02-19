package arrays;

import java.util.ArrayList;
import java.util.Collections;

public class FindUniqueCombinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,1,2,7,6,1,5};
		ArrayList<ArrayList<Integer>> targetArr = new ArrayList<>();
		ArrayList<Integer> list = new ArrayList<>();
		findCombinations(0,8,list,arr,targetArr);
	}
	public static void findCombinations(int index,int target,ArrayList<Integer> list,int[] arr,ArrayList<ArrayList<Integer>> targetArr) {
		if(index==arr.length) {
			if(target == 0) {
				Collections.sort(list);
				targetArr.add(list);
//				Collections.sort(targetArr);
				System.out.println(targetArr.get(targetArr.size()-1));
			}
			return;
		}
		if(arr[index]<=target) {
			list.add(arr[index]);
			findCombinations(index+1,target-arr[index],list,arr,targetArr);
			list.remove(list.size()-1);
		}
		findCombinations(index+1,target,list,arr,targetArr);
	}
}
