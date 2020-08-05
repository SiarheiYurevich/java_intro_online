package by.java_intro_online.mod02.task11_26_multiarrays;

/* Form a random matrix of N x M order which contains 0 and 1,
 * where the number of 1 elements in each column is equal to the column number.
 */

public class Task24 {

	public static void main(String[] args) {

		int n = 10;
		int m = 10;
		int matrix[][] = new int[n][m];

		int ji = 0;
		int jsum = 0;

		for (int jj = 0; jj < m; jj++) {

			while (jsum < jj + 1) {

				ji = (int) (Math.random() * 10);

				if (matrix[ji][jj] == 0) {
					matrix[ji][jj] = 1;
					jsum++;
				}
			}
			jsum = 0;
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
