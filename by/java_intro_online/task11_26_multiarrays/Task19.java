package by.java_intro_online.mod02.task11_26_multiarrays;

/* Given a matrix of non-negative numbers.
 * Count sums of elements in each columns, determine which column has the maximal sum.
 */

public class Task19 {
	
	public static void main(String[] args) {

		int matrix[][] = { { 1, 2, 3, 4 },
						   { 1, 2, 3, 4 },
						   { 1, 2, 3, 4 },
						   { 1, 2, 3, 4 } };

		int sumj = 0;
		int sumJmax = 0;
		int Jmax = 0;
		int ii = 0;

		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix[i].length; j++) {

				sumj = sumj + matrix[j][i];
			}
			ii = i + 1;

			System.out.println("Matrix j" + ii + " sum = " + sumj);

			if (sumj > sumJmax) {
				sumJmax = sumj;
				Jmax = ii;
			}
			sumj = 0;
		}
		System.out.println("Max matrix[j] sum at j = " + Jmax);
		
	}
}