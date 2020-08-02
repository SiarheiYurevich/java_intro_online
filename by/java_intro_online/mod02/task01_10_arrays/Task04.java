package by.java_intro_online.mod02.task01_10_arrays;

/* Given sequence of real numbers a1, a2, .., an.
 * Swap the largest and the smallest elements. 
 */

public class Task04 {

	public static void main(String[] args) {

		double mas[] = { 1, 1, 2, 3, 4, 5, 6, 7, 8, 8 };

		double iMax = mas[0];
		double iMin = mas[0];

		for (int i = 1; i < mas.length; i++) {

			if (iMax < mas[i]) {
				iMax = mas[i];
			}
			if (iMin > mas[i]) {
				iMin = mas[i];
			}
		}

		for (int j = 0; j < mas.length; j++) {

			if (mas[j] == iMax) {
				mas[j] = iMin;
			} else {
				if (mas[j] == iMin) {
					mas[j] = iMax;
				}
			}
		}

		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
	}
}
