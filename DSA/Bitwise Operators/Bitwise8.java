package bitwise_operators;

import java.util.Scanner;

public class Bitwise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = n;
		sc.close();
		int i = 1;
		int pos = 0;
		while(n != 0) {
			if((n & 1) == 1)
				pos = i;
			n = n >> 1;
			i++;
		}
		n = (~((int)Math.pow(2, pos-1)) & m);
		System.out.println(n);
	}

}
