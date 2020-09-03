package by.java_intro_online.mod02.task35_51_decomposition;

/* Two numbers is "twins" if they differ from each other by two (for example 41 and 43).
 * Find and print all "twins" from range [n, 2n] where n is natural specified number more that 2.
 * (to solve the task use decomposition)
 */

import java.util.Scanner;
import java.util.Arrays;

public class Task47 {

	public static void main(String[] args) {

		int n = enterN("n >> ");

		System.out.print(Arrays.deepToString(fillArrayN(createArrayN(n), n)));

	}

	public static int[][] fillArrayN(int array[][], int n) {

		for (int i = n; i <= n * 2 - 2; i++) {
			array[i - n][0] = i;
			array[i - n][1] = i + 2;
		}
		return array;
	}

	public static int[][] createArrayN(int n) {

		int k = n;
		int z = 0;

		while (k <= n * 2 - 2) {
			k++;
			z++;
		}
		int array[][] = new int[z][2];
		return array;
	}

	public static int enterN(String message) {

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
