
public class SetMatrixZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
//		setToZero1(matrix);
//		for(int i=0; i<matrix.length; i++) {
//			for(int j=0; j<matrix[0].length; j++) {
//				System.out.print(matrix[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		setToZero2(matrix);
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

	private static void setToZero2(int[][] matrix) {
		// TODO Auto-generated method stub
		int[] rows = new int[matrix.length];
		int[] cols = new int[matrix[0].length];
		
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				if(matrix[i][j] == 0) {
					rows[i] = 1;
					cols[j] = 1;
				}
			}
		}
		
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				if(cols[j]==1 || rows[i]==1) {
					matrix[i][j] = 0;
				}
			}
		}
	}

	private static void setToZero1(int[][] matrix) {
		// TODO Auto-generated method stub
		int col = 0;
		int row = 0;
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				if(matrix[i][j] == 0) {
					markRow(i,matrix);
					markCol(j,matrix);
				}
			}
			
		}
		for(int i=0; i<matrix.length; i++) {
			for(int j=0;j<matrix[0].length;j++) {
				if(matrix[i][j]==-1)
					matrix[i][j] = 0;
			}
		}
	}

	private static void markCol(int col,int[][] matrix) {
		// TODO Auto-generated method stub
		for(int i=0; i<matrix.length; i++) {
			if(matrix[i][col]!=0) {
				matrix[i][col] = -1;
			}
		}
	}

	private static void markRow(int row,int[][] matrix) {
		// TODO Auto-generated method stub
		for(int j=0;j<matrix[0].length;j++) {
			if(matrix[row][j]!=0) {
				matrix[row][j] = -1;
			}
		}
	}

}
