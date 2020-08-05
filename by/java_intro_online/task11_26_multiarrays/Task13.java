package by.java_intro_online.mod02.task11_26_multiarrays;

/* Given a matrix.
 * Display k-row and p-column.
 */

public class Task13 {
	
	public static void main(String[] args) {

		char matrix[][] = { { '.', '.', 'p', '.', '.' },
							{ '.', '.', 'p', '.', '.' },
							{ 'k', 'k', 'x', 'k', 'k' },
							{ '.', '.', 'p', '.', '.' },
							{ '.', '.', 'p', '.', '.' } };

		int k = 2;
		int p = 2;

		for (int i = 0; i < matrix.length; i++) {

			System.out.print(matrix[k][i] + " ");
		}
		System.out.println();

		for (int j = 0; j < matrix[p].length; j++) {

			System.out.print(matrix[j][p] + " ");
		}
		
	}
}