package by.java_intro_online.mod02.task11_26_multiarrays;

// Find positive elements of main diagonal of a square matrix.

public class Task20 {

	public static void main(String[] args) {

		int matrix[][] = { { 1, -2, 3, -4 },
						   { 1, -2, 3, -4 },
						   { 1, -2, 3, -4 },
						   { 1, -2, 3, -4 } };

		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix[i].length; j++) {

				if (i == j && matrix[i][j] > 0) {

					System.out.print(matrix[i][j] + " ");
				}
			}
		}

	}
}
