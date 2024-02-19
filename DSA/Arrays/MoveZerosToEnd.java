
public class MoveZerosToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,0,1,0,4,0};
		moveZerosToEnd1(arr);
		System.out.println();
		moveZerosToEnd2(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

	private static void moveZerosToEnd2(int[] arr) {
		// TODO Auto-generated method stub
		int i = 0;
		for(;i<arr.length;i++) {
			if(arr[i]==0)
				break;
		}
		for(int j=i+1;j<arr.length;j++) {
			if(arr[j]!=0) {
				int temp =arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
			}
		}
	}

	private static void moveZerosToEnd1(int[] arr) {
		// TODO Auto-generated method stub
		int[] temp = new int[arr.length];
		int index = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				temp[index++] = arr[i];
			}
		}
		for(int i=0;i<temp.length;i++)
			System.out.print(temp[i]+" ");
	}

}
