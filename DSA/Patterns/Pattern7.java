package patterns;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern7(5);
	}

	static void pattern7(int n) {
		// TODO Auto-generated method stub
		for(int row = n; row >= 1; row--) {
			for(int col = 1; col <= n - row; col++)
				System.out.print(" ");
			for(int col = 1; col <= row; col++)
				System.out.print("*");
			System.out.println();
		}
	}

}
