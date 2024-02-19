
public class IsSorted {
	public static void main(String[] args) {
		int[] arr = {12,12,18,21,30};
		System.out.println(isSorted1(arr));
		System.out.println(isSorted2(arr));
	}

	private static boolean isSorted2(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<arr[i-1])
				return false;
		}
		return true;
	}

	private static boolean isSorted1(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[i])
					return false;
			}
		}
		return true;
	}
}
