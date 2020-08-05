package by.java_intro_online.mod02.task11_26_multiarrays;

/* Given a square matrix.
 * Display elements which placed on diagonal.
 */

public class Task12 {
	
	public static void main(String[] args) {

		int matrix[][] = { { 1, 0, 0, 0 },
						   { 0, 2, 0, 0 },
						   { 0, 0, 3, 0 },
						   { 0, 0, 0, 4 } };

		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix[i].length; j++) {

				if (i == j) {

					System.out.print(matrix[i][j] + " ");
				}
			}
		}
		
	}
}
