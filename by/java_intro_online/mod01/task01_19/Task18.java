package by.java_intro_online.mod01.task01_19;

/* For each natural number in the range from m to n, output all dividers
 * except one and the number itself.
 * The number m and n entered from the keyboard.
 */

import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {

		int m;
		int n;
		int N;
		double N2;

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.print("m >> ");
		m = scan.nextInt();

		System.out.print("n >> ");
		n = scan.nextInt();

		for (int i = m; i <= n; i += 1) {

			N = i;
			System.out.print("Deviders of number " + N + " are");

			for (int j = 2; j < N; j += 1) {

				N2 = N / j;

				if (N == (int) N2 * j) {

					System.out.print(" " + j);
				}
			}
			System.out.println();

		}
	}
}