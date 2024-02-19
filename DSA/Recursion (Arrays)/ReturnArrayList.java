package recursion_arrays;

import java.util.ArrayList;

public class ReturnArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,10,11,6,10,18,10};
		int target = 10;
		System.out.println(listIndices(arr,target,0));
	}
//	static ArrayList<Integer> listIndices(int[] arr, int target,int index,ArrayList<Integer> list) {
//		// TODO Auto-generated method stub
//		if(index == arr.length)
//			return list;
//		if(arr[index] == target)
//			list.add(index);
//		return listIndices(arr,target,index+1,list);
//	}
	static ArrayList<Integer> listIndices(int[] arr,int target,int index){
		ArrayList<Integer> list = new ArrayList<>();
		if(index == arr.length)
			return list;
		if(arr[index] == target)
			list.add(index);
		ArrayList<Integer> newList = listIndices(arr,target,index+1);
		list.addAll(newList);
		return list;
		
	}
}
