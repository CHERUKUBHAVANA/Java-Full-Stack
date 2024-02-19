import java.util.*;
public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 2, 1, 1, 1, 2, 2};
		System.out.println("Majority element : "+majorityElem1(arr));
		System.out.println("Majority element : "+majorityElem2(arr));
		System.out.println("Majority element : "+majorityElem3(arr));
	}

	private static int majorityElem3(int[] arr) {
		// TODO Auto-generated method stub
		int count = 0;
		int element = -1;
		int currentElement = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(count == 0) {
				count++;
				element = arr[i];
			}
			else if(element == currentElement) {
				count++;
			}
			else
				count--;
		}
		
		int count1 = 0;
		for(int i= 0; i<arr.length; i++) {
			if(arr[i]==element)
				count1++;
		}
		if(count1 > Math.floor(arr.length/2))
			return element;
		return -1;
	}

	private static int majorityElem2(int[] arr) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i]))
				map.put(arr[i], map.get(arr[i])+1);
			else
				map.put(arr[i], 1);
		}
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue()>arr.length/2)
				return entry.getKey();
		}
		return -1;
	}

	private static int majorityElem1(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			int count = 0;
			for(int j = 0; j<arr.length; j++) {
				if(arr[i] == arr[j])
					count++;
			}
			if(count > Math.floor(arr.length/2))
				return arr[i];
		}
		return -1;
	}

}
