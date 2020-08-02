package by.java_intro_online.mod02.task01_10_arrays;

/* Given an array of integers.
 * Shrink the array, throwing out every second element from it,
 * fill the released elements with zeros.
 * Do not use an additional array.
 */

public class Task10 {

	public static void main(String[] args) {

		int mas[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int n = mas.length;
		int nn = (int) (mas.length / 2);

		if (nn * 2 != n) {
			nn++;
		}

		for (int i = 0; i < n; i++) {

			if (i < nn) {
				mas[i] = mas[i + i];
			} else {
				mas[i] = 0;
			}
		}

		for (int ii = 0; ii < n; ii++) {
			System.out.print(mas[ii] + " ");
		}

	}
}
