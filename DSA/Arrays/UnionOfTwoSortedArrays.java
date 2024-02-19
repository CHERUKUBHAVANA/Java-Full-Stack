import java.util.*;
public class UnionOfTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,1,1,2,3,4,5,6,7,7,8,9,10};
		int[] arr2 = {2,3,4,4,5,11,12};
		ArrayList<Integer> union1 = unionArray1(arr1,arr2);
		for(int i : union1)
			System.out.print(i+" ");
		System.out.println();
		ArrayList<Integer> union2 = unionArray2(arr1,arr2);
		for(int i : union2)
			System.out.print(i+" ");
	}

	//unionArray2 works only for sorted arrays
	private static ArrayList<Integer> unionArray2(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		ArrayList<Integer> union = new ArrayList<>();
		int i = 0;
		int j = 0;
		while(i<arr1.length && j<arr2.length){
			if(arr1[i]<arr2[j]) {
				if(union.size()==0 || union.get(union.size()-1)!=arr1[i]) 
					union.add(arr1[i]);
				i++;
			}
			else if(arr1[i]==arr2[j]) {
				if(union.size()==0 || union.get(union.size()-1)!=arr1[i]) 
					union.add(arr1[i]);
				i++;
				j++;
			}
			else {
				if(union.size()==0 || union.get(union.size()-1)!=arr2[j])
					union.add(arr2[j]);
				j++;
			}
		}	
		while(i<arr1.length) {
			if(union.get(union.size()-1)!=arr1[i])
				union.add(arr1[i]);
			i++;
		}
		while(j<arr2.length) {
			if(union.get(union.size()-1)!=arr2[j])
				union.add(arr2[j]);
			j++;
		}
		return union;
	}

	//unionArray1 works for unsorted arrays also
	private static ArrayList<Integer> unionArray1(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		ArrayList<Integer> union = new ArrayList<>();
		Set<Integer> set = new LinkedHashSet<>();
		for(int i=0;i<arr1.length;i++) {
			set.add(arr1[i]);
		}
		for(int i=0;i<arr2.length;i++) {
			set.add(arr2[i]);
		}
		for(int i : set) {
			union.add(i);
		}
		return union;
	}

}
