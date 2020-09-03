package by.java_intro_online.mod02.task35_51_decomposition;

/* Given two natural numbers K and N.
 * Write methods that form an array which elements are numbers which are less than N and which sum of digits is equal K.
 */

import java.util.Scanner;
import java.util.Arrays;

public class Task46 {

	public static void main(String[] args) {

		int K = enterKN("K >> ");
		int N = enterKN("N >> ");

		System.out.print(Arrays.toString(fillArray(K, N)));
	}

	public static int[] fillArray(int k, int n) {

		int arrayI = 0;
		int arrayTemp[] = new int[n - 1];

		for (int i = 1; i < n; i++) {

			int sumk = 0;
			int x = i;

			for (int j = i; j != 0; j /= 10) {
				sumk += (j % 10);
			}

			if (sumk == k) {
				arrayTemp[arrayI] = x;
				arrayI++;
			}
		}

		int array[] = new int[arrayI];
		for (int j = 0; j < array.length; j++) {
			array[j] = arrayTemp[j];
		}

		return array;
	}

	public static int enterKN(String message) {

		int value;

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.print(message);
		while (!scan.hasNextInt()) {
			scan.next();
			System.out.print(message);
		}
		value = scan.nextInt();
		return value;
	}

}