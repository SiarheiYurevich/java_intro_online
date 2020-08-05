package by.java_intro_online.mod02.task11_26_multiarrays;

/* Form a matrix of n order of given type (n is even).
 *
 *  {  1   1  1 ... 1 1 1 }
 *  {  2   2  2 ... 2 2 0 }
 *  {  3   3  3 ... 3 0 0 }
 *  { ......... ... 0 0 0 }
 *  { n-1 n-2 0 ... 0 0 0 }
 *  {  n   0  0 ... 0 0 0 }
 *
 */

public class Task15 {

	public static void main(String[] args) {

		int n = 10;
		int matrix[][] = new int[n][n];

		for (int j = 0; j < n; j++) {

			for (int i = 0; i < n - j; i++) {

				matrix[j][i] = j + 1;
			}
		}

		for (int j = 0; j < n; j++) {

			for (int i = 0; i < n; i++) {

				System.out.print(matrix[j][i] + " ");
			}
			System.out.println();
		}

	}
}