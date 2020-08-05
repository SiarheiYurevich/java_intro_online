package by.java_intro_online.mod02.task11_26_multiarrays;

/* Create a magic square.
 * Magic square is a square matrix in which sums of elements of all columns and rows and main diagonals are equal.
 */

public class Task26 {

	public static void main(String[] args) {

		int n = 3;
		int matrix[][] = new int[n][n];

		int magicSum[] = new int[n * 2 + 2];
		boolean magicSquare = false;

		while (!magicSquare) {

			for (int k = 0; k < n * 2 + 2; k++) {

				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						matrix[i][j] = (int) (Math.random() * n * n);
					}
				}

				int sumjj = 0;
				for (int ki = 0; ki < n; ki++) {
					for (int jj = 0; jj < n; jj++) {
						sumjj += matrix[ki][jj];
					}
					magicSum[ki] = sumjj;
					sumjj = 0;
				}

				int sumii = 0;
				for (int kj = n; kj < n * 2; kj++) {
					for (int ii = 0; ii < n; ii++) {
						sumii += matrix[ii][kj - n];
					}
					magicSum[kj] = sumii;
					sumii = 0;
				}

				int sumD = 0;
				int sumD2 = 0;
				for (int ij = 0; ij < n; ij++) {
					sumD += matrix[ij][ij];
					sumD2 += matrix[ij][n - 1 - ij];
				}
				magicSum[n * 2] = sumD;
				magicSum[n * 2 + 1] = sumD2;
			}

			int magic = 0;
			for (int kk = 0; kk < n * 2 + 1; kk++) {
				if (magicSum[kk] == magicSum[kk + 1]) {
					magic++;
					if (magic == n * 2 + 1) {
						magicSquare = true;
					}
				}
			}
		}

		for (int il = 0; il < n; il++) {
			for (int jl = 0; jl < n; jl++) {
				System.out.print(matrix[il][jl] + " ");
			}
			System.out.println();
		}

	}
}