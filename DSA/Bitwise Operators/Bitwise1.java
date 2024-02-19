package bitwise_operators;

import java.util.Scanner;

public class Bitwise1 {
	public static void main(String[] args) {
		//find whether a number is even or odd.
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		if((n & 1) == 0)
			System.out.println("even");
		else
			System.out.println("odd");
	}
}
