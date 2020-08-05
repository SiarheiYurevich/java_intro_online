package by.java_intro_online.mod02.task11_26_multiarrays;

/* Form a matrix of n order of given type (n is even).
 * 
 *  { 1  2   3  ... n }
 *  { n n-1 n-2 ... 1 }
 *  { 1  2   3  ... n }
 *  { n n-1 n-2 ... 1 }
 *  { ......... ... n }
 *  { n  n   n  ... 1 }
 *
 */

public class Task14 {

	public static void main(String[] args) {

		int n = 8;
		int matrix[][] = new int[n][n];

		for (int j = 0; j < n; j++) {

			for (int i = 0; i < n; i++) {

				if (j == (int) (j / 2) * 2) {

					matrix[j][i] = i + 1;
				}

				if (j != (int) (j / 2) * 2) {
					matrix[j][i] = n - i;
				}
				System.out.print(matrix[j][i] + " ");
			}
			System.out.println();
		}

	}
}
