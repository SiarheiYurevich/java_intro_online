package by.java_intro_online.mod02.task01_10_arrays;

/* Array A[N] contains natural numbers.
 * Find the sum of elements that are a multiple of given number K.
 */

public class Task01 {

	public static void main(String[] args) {

		int A[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int K = 2;
		int checkAi = 0;
		int sum = 0;

		for (int i = 0; i < A.length; i++) {

			checkAi = (int) (A[i] / K) * K;

			if (A[i] == checkAi) {

				sum = sum + A[i];
			}
		}

		System.out.print("sum = " + sum);
	}
}
