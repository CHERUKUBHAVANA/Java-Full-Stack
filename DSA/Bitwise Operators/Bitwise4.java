package bitwise_operators;

import java.util.Scanner;

public class Bitwise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To set the ith bit of a number.
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int bit = sc.nextInt();
		sc.close();
		n = ((1 << (bit-1)) | n);
		System.out.println(n);
	}

}
