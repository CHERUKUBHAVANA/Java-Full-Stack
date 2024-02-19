package bitwise_operators;

import java.util.Scanner;

public class Bitwise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reset the ith bit of a number.
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int bit = sc.nextInt();
		sc.close();
		n = ~(1 << (bit - 1)) & n;
		System.out.println(n);
	}

}
