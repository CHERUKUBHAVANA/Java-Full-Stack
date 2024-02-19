package patterns;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern6(5);
	}

	static void pattern6(int n) {
		// TODO Auto-generated method stub
		for(int row = 1; row <= n; row++) {
			for(int col = 1; col <= n - row; col++)
				System.out.print(" ");
			for(int col = 1; col <= row; col++)
				System.out.print("*");
			System.out.println();
		}
	}

}
