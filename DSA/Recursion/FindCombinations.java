package arrays;

import java.util.ArrayList;

public class FindCombinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,6,7};
		ArrayList<ArrayList<Integer>> targetArr = new ArrayList<>();
		ArrayList<Integer> list = new ArrayList<>();
		findCombinations(0,7,list,arr,targetArr);
		
	}
	public static void findCombinations(int index,int target,ArrayList<Integer> list,int[] arr,ArrayList<ArrayList<Integer>> targetArr) {
		if(index==arr.length) {
			if(target == 0) {
				targetArr.add(list);
				System.out.println(targetArr.get(targetArr.size()-1));
			}
			return;
		}
		if(arr[index]<=target) {
			list.add(arr[index]);
			findCombinations(index,target-arr[index],list,arr,targetArr);
			list.remove(list.size()-1);
		}
		findCombinations(index+1,target,list,arr,targetArr);
	}
}
