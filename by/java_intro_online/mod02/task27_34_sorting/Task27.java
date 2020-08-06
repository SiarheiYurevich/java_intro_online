package by.java_intro_online.mod02.task27_34_sorting;

/* Given two one-dimension arrays and natural number k.
 * Concatenate arrays into one, insert the second into the first between k and k + 1 elements,
 * do not use an addition array.
 */

public class Task27 {

	public static void main(String[] args) {

		int mas1[] = { 1, 1, 1, 1, 1, 1 };
		int mas2[] = { 2, 2, 2, 2, 2, 2 };
		int k = 3;

		int mas3[] = new int[mas1.length + mas2.length];

		for (int i = 0; i < mas3.length; i++) {
			if (i < k) {
				mas3[i] = mas1[i];
			}
			if (i >= k && i < k + mas2.length) {
				mas3[i] = mas2[i - k];
			}
			if (i >= k + mas2.length) {
				mas3[i] = mas1[i - mas2.length];
			}
			System.out.print(mas3[i] + " ");
		}

	}
}
