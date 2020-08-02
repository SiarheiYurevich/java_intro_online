package by.java_intro_online.mod02.task01_10_arrays;

/* Given a sequence N of real numbers.
 * Calculate the sum of numbers whose ordinal numbers are prime numbers. 
 */


public class Task06 {

	public static void main(String[] args) {

		double mas[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		double sum = 0;

		for (int i = 2; i < mas.length; i++) {

			int k = i;

			for (int j = 2; j < i; j++) {

				int jj = (int) (i / j) * j;

				if (jj == i) {

					--k;
				}

			}

			if (k == i) {

				sum = sum + mas[i];

				System.out.print(i + " ");
			}

		}

		System.out.print("\nsum = " + sum);
	}
}
