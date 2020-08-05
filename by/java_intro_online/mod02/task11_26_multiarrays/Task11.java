package by.java_intro_online.mod02.task11_26_multiarrays;

/* Given a matrix.
 * Display all odd columns with the first element greater than the last element.
 */

public class Task11 {

	public static void main(String[] args) {

		int matrix[][] = { { 2, 2, 3, 1, 1, 6, 7 },
						   { 1, 2, 3, 4, 5, 6, 7 },
						   { 1, 2, 3, 4, 5, 6, 7 },
						   { 1, 2, 3, 4, 5, 6, 7 },
						   { 1, 2, 3, 4, 5, 6, 7 },
						   { 1, 2, 3, 4, 5, 6, 7 },
						   { 1, 1, 1, 4, 5, 1, 1 } };

		for (int j = 0; j < matrix[0].length; j++) {

			for (int i = 0; i < matrix.length; i++) {

				if (i == (int) (i / 2) * 2 && matrix[0][i] > matrix[matrix[i].length - 1][i]) {

					System.out.print(matrix[j][i] + " ");
				}
			}
			System.out.println();
		}

	}
}