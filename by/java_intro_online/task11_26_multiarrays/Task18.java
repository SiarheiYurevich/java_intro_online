package by.java_intro_online.mod02.task11_26_multiarrays;

/* Swap two elements in a numeric matrix.
 * Columns numbers are entered by a user from keyboard.
 */

import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {

		int matrix[][] = { { 1, 2, 3, 4 },
						   { 1, 2, 3, 4 },
						   { 1, 2, 3, 4 },
						   { 1, 2, 3, 4 } };

		int n = matrix.length;

		int p1;
		int pp1 = 0;
		int p2;

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter number from 1 to " + n + " >> ");
		p1 = scan.nextInt();

		System.out.print("Enter number from 1 to " + n + " (exept for number " + p1 + ") >> ");
		p2 = scan.nextInt();

		for (int j = 0; j < matrix[0].length; j++) {

			for (int i = 0; i < matrix.length; i++) {

				if (i == p1 - 1) {

					pp1 = matrix[j][i];
				}

				if (i == p2 - 1) {

					matrix[j][p1 - 1] = matrix[j][i];

					matrix[j][i] = pp1;
				}
			}
		}

		for (int j = 0; j < matrix[0].length; j++) {
			for (int i = 0; i < matrix.length; i++) {
				System.out.print(matrix[j][i] + " ");
			}
			System.out.println();
		}
		
	}
}
