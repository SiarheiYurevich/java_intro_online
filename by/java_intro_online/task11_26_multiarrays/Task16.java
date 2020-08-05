package by.java_intro_online.mod02.task11_26_multiarrays;

/* Form a square matrix of n order of given type (n is even). 
 * 
 *  { 1 1 1 ... 1 1 1 }
 *  { 0 1 1 ... 1 1 0 }
 *  { 0 0 1 ... 1 0 0 }
 *  { ............... }
 *  { 0 0 1 ... 1 0 0 }
 *  { 0 1 1 ... 1 1 0 }
 *  { 1 1 1 ... 1 1 1 }
 *
 */

public class Task16 {

	public static void main(String[] args) {

		int n = 8;
		int matrix[][] = new int[n][n];

		for (int j = 0; j < n; j++) {

			for (int i = 0; i < n; i++) {

				if (j <= i && j + i < n || j >= i && j + i >= n - 1) {

					matrix[j][i] = 1;
				}
				System.out.print(matrix[j][i] + " ");
			}
			System.out.println();
		}

	}
}