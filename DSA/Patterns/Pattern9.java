package patterns;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern9(5);
	}

	static void pattern9(int n) {
		// TODO Auto-generated method stub
		for(int row = 5; row >= 1; row--) {
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
