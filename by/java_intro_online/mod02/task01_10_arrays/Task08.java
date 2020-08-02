package by.java_intro_online.mod02.task01_10_arrays;

/* Given a sequence of real numbers a1, a2, ..an.
 * Create a new sequence by discarding from the original elements that are equal to min{a1, a2, .., an}.
 */

public class Task08 {

	public static void main(String[] args) {

		int mas[] = { -1, 3, -1, 2, -1, 1, -1, 2, -1, 3, -1 };

		int min;
		int minPosition = 0;

		for (int i = 1; i < mas.length; i++) {

			if (mas[minPosition] > mas[i]) {
				minPosition = i;
			}
		}

		min = mas[minPosition];

		int Zmin = 0;

		for (int ii = 0; ii < mas.length; ii++) {

			if (min == mas[ii]) {
				Zmin++;
			}
		}

		int n = mas.length - Zmin;

		int masWithoutMin[] = new int[n];

		int jj = 0;

		for (int j = 0; j < mas.length; j++) {

			if (mas[j] != min) {
				masWithoutMin[j - jj] = mas[j];
				System.out.print(masWithoutMin[j - jj] + " ");
			}

			if (mas[j] == min) {
				++jj;
			}
		}

	}

}
