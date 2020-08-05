package by.java_intro_online.mod02.task11_26_multiarrays;

/* Fill 10x20 matrix with random numbers from 0 to 15.
 * Display the matrix and row numbers with 3 and more numbers 5. 
 */

public class Task21 {

	public static void main(String[] args) {

		int matrix[][] = new int[10][20];

		int i5 = 0;
		int in5[] = new int[10];
		boolean in5zero = false;

		for (int i = 0; i < 10; i++) {

			for (int j = 0; j < 20; j++) {

				matrix[i][j] = (int) (Math.random() * 16);

				System.out.print(matrix[i][j] + " ");

				if (matrix[i][j] == 5) {
					i5++;
				}
			}
			System.out.println();

			if (i5 >= 3) {
				in5[i] = 1;
				in5zero = true;
			}

			i5 = 0;
		}

		if (in5zero) {
			System.out.print("Three and more number 5 have row(s) - ");
			for (int ii = 0; ii < 10; ii++) {
				if (in5[ii] == 1) {
					System.out.print(ii + 1 + " ");
				}
			}
		}
		if (!in5zero) {
			System.out.print("No one row of the matrix have 3 and more number 5");
		}

	}
}
