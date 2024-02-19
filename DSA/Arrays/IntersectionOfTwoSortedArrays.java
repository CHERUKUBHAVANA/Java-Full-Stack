import java.util.*;
public class IntersectionOfTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr2 = {1,2,3,3,3,4,5,6,6};
		int[] arr1 = {3,3,5,5};
		ArrayList<Integer> intersection1 = intersectionArray1(arr1,arr2);
		for(int i : intersection1)
			System.out.print(i+" ");
		System.out.println();
		ArrayList<Integer> intersection2 = intersectionArray2(arr1,arr2);
		for(int i : intersection2)
			System.out.print(i+" ");
	}

	private static ArrayList<Integer> intersectionArray2(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		ArrayList<Integer> intersection = new ArrayList<>();
		int i = 0;
		int j = 0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]==arr2[j]) {
				if(intersection.size()==0 || intersection.get(intersection.size()-1)!=arr1[i])
				intersection.add(arr1[i]);
				i++;
				j++;
			}
			else if(arr1[i]<arr2[j]) {
				i++;
			}
			else {
				j++;
			}
		}
		return intersection;
	}

	private static ArrayList<Integer> intersectionArray1(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		ArrayList<Integer> intersection = new ArrayList<>();
		int[] visited = new int[arr2.length];
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					if(visited[j] == 0) {
						intersection.add(arr1[i]);
						visited[j] = 1;
					}
					break;
				}
				if(arr2[j] > arr1[i])
					break;
			}
		}
		return intersection;
	}

}
