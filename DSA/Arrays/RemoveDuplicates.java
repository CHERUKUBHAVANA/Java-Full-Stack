import java.util.*;
public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,2,2,2,3,3,4,4,5};
//		int size1 = removeDuplicates1(arr);
//		for(int i=0;i<size1;i++)
//			System.out.print(arr[i]+" ");
		int size2 = removeDuplicates2(arr);
		for(int i=0;i<size2;i++)
			System.out.print(arr[i]+" ");
	}

	private static int removeDuplicates2(int[] arr) {
		int i = 0;
		for(int j=1;j<arr.length;j++) {
			if(arr[i]!=arr[j]){
				arr[i+1] = arr[j];
				i++;
			}
		}
		return i+1;
	}

	private static int removeDuplicates1(int[] arr) {
		// TODO Auto-generated method stub
		Set<Integer> set = new HashSet<>();
		for(int element : arr) {
			set.add(element);
		}
		int index = 0;
		for(int element : set) {
			arr[index++] = element;
		}
		return index;
	}

}
