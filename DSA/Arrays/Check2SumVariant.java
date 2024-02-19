import java.util.*;
public class Check2SumVariant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,6,5,8,11};
		int[] answer1 = sum2Indices1(arr,14);
		for(int i=0;i<answer1.length;i++)
			System.out.print(answer1[i]+" ");
		System.out.println();
		int[] answer2 = sum2Indices2(arr,14);
		for(int i=0;i<answer2.length;i++)
			System.out.print(answer2[i]+" ");
		System.out.println();
		int[] answer3 = sum2Indices3(arr,14);
		for(int i=0;i<answer3.length;i++)
			System.out.print(answer3[i]+" ");
	}

	private static int[] sum2Indices3(int[] arr, int sum) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[arr.length];
		for(int i=0;i<arr.length;i++)
			arr1[i] = arr[i];
		int[] answer = new int[2];
		answer[0] = answer[1] = -1;
		Arrays.sort(arr);
		int start = 0;
		int end = arr.length - 1;
		while(start<end) {
			if(arr[start]+arr[end] == sum) {
				answer[0] = search(arr1,arr[start]);
				answer[1] = search(arr1,arr[end]);
				return answer;
			}
			else if(arr[start]+arr[end] < sum) {
				start++;
			}
			else
				end--;
		}
		return answer;
	}

	private static int search(int[] arr,int key) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == key)
				return i;
		}
		return -1;
	}

	private static int[] sum2Indices2(int[] arr, int sum) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> map = new HashMap<>();
		int[] answer = new int[2];
		answer[0] = answer[1] = -1;
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(sum - arr[i])) {
				answer[0] = map.get(sum - arr[i]);
				answer[1] = i;
				return answer;
			}
			map.put(arr[i], i);
		}
		return answer;
	}

	private static int[] sum2Indices1(int[] arr,int sum) {
		// TODO Auto-generated method stub
		int[] answer = new int[2];
		answer[0] = answer[1] = -1;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j] == sum) {
					answer[0] = i;
					answer[1] = j;
					return answer;
				}
			}
		}
		return answer;
	}

}
