package by.java_intro_online.mod01.task01_19;

/* Given a number series and some number e,
 * find the sum of those series members whose modulus is greater than or equal to given number.
 * The common member of the series is:
 * a = 1 / 2^n + 1 / 3^n
 */

import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {

		double a;
		int n;
		double e;
		double sum;

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.print("e >> ");
		e = scan.nextDouble();

		System.out.print("n >> ");
		n = scan.nextInt();

		sum = 0;

		for (int i = 1; i <= n; i += 1) {

			a = (1 / Math.pow(2, i)) + (1 / Math.pow(3, i));

			if (Math.abs(a) >= e) {

				sum = sum + a;
			}
		}

		System.out.print("sum = " + sum);
	}
}