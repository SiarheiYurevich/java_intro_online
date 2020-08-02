package by.java_intro_online.mod02.task01_10_arrays;

/* Given an array of real numbers, the dimension of which is N.
 * Calculate how many negative, positive and zero elements it contains.
 */

public class Task03 {

	public static void main(String[] args) {

		double mas[] = { -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5 };

		int positive = 0;
		int negative = 0;
		int zero = 0;

		for (int i = 0; i < mas.length; i++) {

			if (mas[i] > 0) {
				positive++;
			}
			if (mas[i] < 0) {
				negative++;
			}
			if (mas[i] == 0) {
				zero++;
			}
		}

		System.out.print("Number of positive elements is " + positive + "\nNumber of negative elements is " + negative
				+ "\nNumber of zero elements is " + zero);

	}
}
