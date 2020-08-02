package by.java_intro_online.mod02.task01_10_arrays;

/* Given integers a1, a2, .., an.
 * Output the numbers for which the expression ai > i is true. 
 */

public class Task05 {

	public static void main(String[] args) {

		int mas[] = { -20, -10, -5, 0, 5, 10, 20 };

		for (int i = 0; i < mas.length; i++) {

			if (mas[i] > i) {

				System.out.print(mas[i] + " ");
			}
		}
	}
}
