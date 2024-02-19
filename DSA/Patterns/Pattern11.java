package patterns;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern11(5);
	}

	static void pattern11(int n) {
		// TODO Auto-generated method stub
		for(int row = 5; row >= 1; row--) {
			for(int col = 1; col <= n - row; col++)
				System.out.print(" ");
			for(int col = 1; col <= 2*row - 1; col++) {
				if(col % 2 != 0)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for(int col = 1; col <= n- row; col++)
				System.out.print(" ");
			System.out.println();
		}
	}

}
