package patterns;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern3(5);
	}

	static void pattern3(int n) {
		// TODO Auto-generated method stub
		for(int row = n; row >= 1; row--) {
			for(int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
