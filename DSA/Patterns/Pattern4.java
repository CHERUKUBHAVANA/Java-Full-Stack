package patterns;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern4(5);
	}

	static void pattern4(int n) {
		// TODO Auto-generated method stub
		for(int row = 1; row <= n; row++) {
			for(int col = 1; col <= row; col++) {
				System.out.print(col);
			}
			System.out.println();
		}
	}

}
