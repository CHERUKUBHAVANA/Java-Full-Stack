package patterns;

public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern12(5);
	}

	static void pattern12(int n) {
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
			for(int row1 = n - 1; row1 >= 1; row1--) {
				for(int col = 1; col <= n - row1; col++)
					System.out.print(" ");
				for(int col = 1; col <= 2*row1 - 1; col++) {
					if(col % 2 != 0)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				for(int col = 1; col <= n- row1; col++)
					System.out.print(" ");
				System.out.println();
			}
	}
}
