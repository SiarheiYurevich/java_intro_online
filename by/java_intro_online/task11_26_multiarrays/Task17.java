package by.java_intro_online.mod02.task11_26_multiarrays;

/* Form a square matrix of N order according to the rule:
 * A[I, J] = sin((I*I - J*J) / N).
 * Count the number of positive elements in the matrix.
 */

public class Task17 {

	public static void main(String[] args) {

		int n = 8;

		double a[][] = new double[n][n];

		double sumPlus = 0;

		for (int j = 0; j < n; j++) {

			for (int i = 0; i < n; i++) {

				a[j][i] = Math.sin((i * i + j * j) / n);

				System.out.printf(" %.3f", a[j][i]);

				if (a[j][i] > 0) {

					sumPlus = a[j][i];
				}
			}
			System.out.println();
		}
		System.out.print("sumPlus = " + sumPlus);
		
	}
}
