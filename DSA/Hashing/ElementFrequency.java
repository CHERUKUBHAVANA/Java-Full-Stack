import java.util.HashMap;
import java.util.Map;

//Find the frequency of given elements in an array -- Hashing : PreStoring and fetching
//Given the maximum element of an array is 10^5. Create a hash array of size 10^5
public class ElementFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,10,12,2,12,3,14,10,3,2};
		int[] hashArray = new int[1000000000];
		for(int i=0;i<arr.length;i++) {
			hashArray[arr[i]] += 1;
		}
		System.out.println("Frequency of 2 is : "+hashArray[2]);
		System.out.println("Frequency of 12 is : "+hashArray[12]);
		System.out.println("Frequency of 18 is : "+hashArray[18]);
		
		//Provided, word contains only lowercase letters
		String word = "abbacdeeabcaa";
		int[] charHashArray = new int[27];
		for(int i=0;i<word.length();i++) {
			charHashArray[word.charAt(i)-'a'] += 1;
		}
		System.out.println("Frequency of b is : "+charHashArray['b'-'a']);
		System.out.println("Frequency of a is : "+charHashArray['a'-'a']);
		System.out.println("Frequency of z is : "+charHashArray['z'-'a']);
		
		//if characters specification is not given, take size as 256
		String word1 = "abbacdeeabcaa";
		int[] charHashArray1 = new int[256];
		for(int i=0;i<word1.length();i++) {
			charHashArray1[word1.charAt(i)] += 1;
		}
		System.out.println("Frequency of b is : "+charHashArray1['b']);
		System.out.println("Frequency of a is : "+charHashArray1['a']);
		System.out.println("Frequency of z is : "+charHashArray1['z']);
		
		//Using Map
		Map<Integer,Integer> freqMap = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(freqMap.containsKey(arr[i]))
				freqMap.put(arr[i], freqMap.get(arr[i])+1);
			else
				freqMap.put(arr[i], 1);
		}
		System.out.println(freqMap);
		
		for(Map.Entry<Integer,Integer> mapEntry : freqMap.entrySet()) {
			System.out.println(mapEntry.getKey()+"--"+mapEntry.getValue());
		}
	}

}
