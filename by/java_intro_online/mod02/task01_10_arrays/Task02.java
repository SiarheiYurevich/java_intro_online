package by.java_intro_online.mod02.task01_10_arrays;

/* Given a sequence of real numbers a1, a2, .., an.
 * Replace all its members larger than given Z, with this number.
 * Count the number of substitutions.
 */

public class Task02 {

	public static void main(String[] args) {

		double[] mas = { -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5 };

		int Z = 1;

		int replacements = 0;

		for (int i = 0; i < mas.length; i++) {

			if (mas[i] > Z) {

				mas[i] = Z;

				replacements++;
			}
		}

		for (int j = 0; j < mas.length; j++) {
			System.out.print(mas[j] + " ");
		}

		System.out.print("\nNumber of replacements for " + Z + " is " + replacements);
	}
}
