package bitwise_operators;

import java.util.Scanner;

public class Bitwise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Find the position of the right most set bit.
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.println((int)(Math.log(n & (-n)) / Math.log(2)) + 1);
	}

}
