import java.util.HashMap;
import java.util.Map;

public class NumberAppearingOnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4, 1, 2, 4, 3, 1, 2};
		System.out.println(numberAppearingOnce1(arr));
		System.out.println(numberAppearingOnce2(arr));
		System.out.println(numberAppearingOnce3(arr));
		System.out.println(numberAppearingOnce4(arr));
	}

	private static int numberAppearingOnce4(int[] arr) {
		// TODO Auto-generated method stub
		int xor = 0;
		for(int i=0;i<arr.length;i++) {
			xor = xor^arr[i];
		}
		return xor;
	}

	private static int numberAppearingOnce3(int[] arr) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i]))
				map.put(arr[i], map.get(arr[i])+1);
			else
				map.put(arr[i], 1);
		}
		for(Map.Entry<Integer,Integer> entries : map.entrySet()) {
			if(entries.getValue()==1)
				return entries.getKey();
		}
		return -1;
	}

	private static int numberAppearingOnce2(int[] arr) {
		// TODO Auto-generated method stub
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)
				max = arr[i];
		}
		int[] hashArray = new int[max+1];
		for(int i=0;i<arr.length;i++) {
			hashArray[arr[i]]++;
		}
		for(int i=0;i<hashArray.length;i++) {
			if(hashArray[i]==1)
				return i;
		}
		return -1;
	}

	private static int numberAppearingOnce1(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			int count = 0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j])
					count++;
			}
			if(count==1)
				return arr[i];
		}
		return -1;
	}

}
