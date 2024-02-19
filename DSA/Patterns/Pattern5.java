package patterns;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern5(5);
	}

	static void pattern5(int n) {
		// TODO Auto-generated method stub
		for(int row = 1; row < 2*n; row++) {
			if(row <= n) {
				for(int col = 1; col <= row; col++)
					System.out.print("*");
			}
			else {
				for(int col = 1; col <= 2*n - row; col++)
					System.out.print("*");
			}
			System.out.println();
		}
	}

}
