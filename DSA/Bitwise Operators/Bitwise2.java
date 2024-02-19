package bitwise_operators;

public class Bitwise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//find un-repeated element of an array
		int[] arr = {2,4,1,2,6,1,4};
		int unique = 0;
		for(int i : arr) {
			unique ^= i;
		}
		System.out.println(unique);
	}

}
