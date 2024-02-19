package bitwise_operators;

import java.util.Scanner;

public class Bitwise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Generate nth magic number.
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int magicNum = 0;
		int i = 1;
		while(n != 0) {
			magicNum += (n & 1) * (int)Math.pow(5, i);
			n = (n >> 1);
			i++;
		}
		System.out.println(magicNum);
	}

}
