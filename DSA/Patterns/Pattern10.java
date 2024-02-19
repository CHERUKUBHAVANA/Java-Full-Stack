package patterns;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern10(5);
	}

	static void pattern10(int n) {
		// TODO Auto-generated method stub
		for(int row = 1; row <= n; row++) {
			for(int col = 1; col <= n - row; col++)
				System.out.print(" ");
			for(int col = 1; col <= 2*row - 1; col++) {
				if(col % 2 != 0)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for(int col = 1; col <= 2*row - 1; col++)
				System.out.print(" ");
			System.out.println();
		}
	}

}
