package bitwise_operators;

import java.util.Scanner;

public class Bitwise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// find the ith bit of a number.
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int bit = 5;
		if((n & (1 << (bit-1))) == 0)
			System.out.println(0);
		else
			System.out.println(1);
	}

}
