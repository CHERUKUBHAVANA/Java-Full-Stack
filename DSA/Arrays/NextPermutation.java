import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class NextPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(3,2,1));
		generateNextPermutation(arr);
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}

	private static void generateNextPermutation(ArrayList<Integer> arr) {
		// TODO Auto-generated method stub
		
		int breakPoint = -1;
		for(int i = arr.size()-2; i>=0; i--) {
			if(arr.get(i)<arr.get(i+1)) {
				breakPoint = i;
				break;
			}
		}
		
		if(breakPoint == -1) {
			Collections.reverse(arr);
			return;
		}
		for(int i=arr.size()-1; i>=breakPoint - 1; i--) {
			if(arr.get(i)>arr.get(breakPoint)) {
				int temp = arr.get(i);
				arr.set(i, arr.get(breakPoint));
				arr.set(breakPoint, temp);
				break;
			}
		}
		List<Integer> subList = arr.subList(breakPoint+1, arr.size());
		Collections.reverse(subList);
	}
}
