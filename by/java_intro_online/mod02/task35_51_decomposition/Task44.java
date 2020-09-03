package by.java_intro_online.mod02.task35_51_decomposition;

/* Given a natural number N.
 * Write methods that form an array which elements are digits of number N.
 */

import java.util.Arrays;

public class Task44 {

	public static void main(String[] args) {

		int N = 1234567890;

		System.out.print(Arrays.toString(fillArray(N)));
	}

	public static int estLength(int n) {
		int length = 0;

		while (n > 0) {
			n = n / 10;
			length++;
		}
		return length;
	}

	public static int[] fillArray(int n) {

		int array[] = new int[estLength(n)];

		for (int i = 0; i < estLength(n); i++) {
			array[i] = (int) ((n / Math.pow(10, estLength(n) - i - 1)) % 10);
		}
		return array;
	}
}
