
public class FindMissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,5,3,4};
		System.out.println("Missing number is : "+missingNumber1(arr));
		System.out.println("Missing number is : "+missingNumber2(arr));
		System.out.println("Missing number is : "+missingNumber3(arr));
		System.out.println("Missing number is : "+missingNumber4(arr));
	}

	private static int missingNumber4(int[] arr) {
		// TODO Auto-generated method stub
		int actualXor = 0;
		int arrayXor = 0;
		for(int i=0;i<arr.length;i++) {
			arrayXor = arrayXor ^ arr[i];
			actualXor = actualXor ^ (i+1);
		}
		actualXor = actualXor^(arr.length+1);
		return actualXor^arrayXor;
	}

	private static int missingNumber3(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length+1;
		int arraySum = 0;
		int sum = (n*(n+1))/2;
		for(int i=0;i<arr.length;i++)
			arraySum += arr[i];
		return sum - arraySum;
	}

	private static int missingNumber2(int[] arr) {
		// TODO Auto-generated method stub
		int[] hashArray = new int[arr.length+2];
		for(int i=0;i<arr.length;i++) {
			hashArray[arr[i]] += 1;
		}
		for(int i=1;i<hashArray.length;i++) {
			if(hashArray[i] == 0) {
				return i;
			}
		}
		return -1;
	}

	private static int missingNumber1(int[] arr) {
		// TODO Auto-generated method stub
//		for(int i=0;i<arr.length;i++) { Works only for sorted array
//			if(arr[i]!=i+1)
//				return i+1;
//		}
//		return -1;
		for(int i=1;i<=arr.length;i++) {
			boolean flag = false;
			for(int j=0;j<arr.length;j++) {
				if(arr[j] == i) {
					flag = true;
					break;
				}
			}
			if(!flag)
				return i;
		}
		return -1;
	}

}
