package patterns;

public class Pattern8 {
	public static void main(String[] args) {
		pattern7(5);
	}

	static void pattern7(int n) {
		// TODO Auto-generated method stub
		for(int row = 1; row <= n; row++) {
			for(int col = 1; col <= n - row; col++)
				System.out.print(" ");
			for(int col = 1; col <= 2*row - 1; col++)
				System.out.print("*");
			for(int col = 1; col <= n - row; col++)
				System.out.print(" ");
			System.out.println();
		}
	}
}
