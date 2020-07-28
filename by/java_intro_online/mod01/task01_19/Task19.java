package by.java_intro_online.mod01.task01_19;

/* Given two numbers,
 * determine the digits included in the record of both the first and the second numbers.
 */

import java.util.Scanner;

public class Task19 {

	public static void main(String[] args) {

		int a;
		int b;

		int a2;
		int b2;
		int b3;

		int c1 = -1;
		int c2 = -1;
		int c3 = -1;
		int c4 = -1;
		int c5 = -1;
		int c6 = -1;
		int c7 = -1;
		int c8 = -1;
		int c9 = -1;
		int c10 = -1;

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.print("a >> ");
		a = scan.nextInt();

		System.out.print("b >> ");
		b = scan.nextInt();

		while (a > 0) {

			a2 = a % 10;
			a = a / 10;

			b2 = b;

			while (b2 > 0) {

				b3 = b2 % 10;
				b2 = b2 / 10;

				if (a2 == b3) {

					if (c9 >= 0 && c10 < 0 && c1 != a2 && c2 != a2 && c3 != a2 && c4 != a2 && c5 != a2 && c6 != a2
							&& c7 != a2 && c8 != a2 && c9 != a2) {
						c10 = a2;
						System.out.print(" " + c10);
					}
					if (c8 >= 0 && c9 < 0 && c1 != a2 && c2 != a2 && c3 != a2 && c4 != a2 && c5 != a2 && c6 != a2
							&& c7 != a2 && c8 != a2) {
						c9 = a2;
						System.out.print(" " + c9);
					}
					if (c7 >= 0 && c8 < 0 && c1 != a2 && c2 != a2 && c3 != a2 && c4 != a2 && c5 != a2 && c6 != a2
							&& c7 != a2) {
						c8 = a2;
						System.out.print(" " + c8);
					}
					if (c6 >= 0 && c7 < 0 && c1 != a2 && c2 != a2 && c3 != a2 && c4 != a2 && c5 != a2 && c6 != a2) {
						c7 = a2;
						System.out.print(" " + c7);
					}
					if (c5 >= 0 && c6 < 0 && c1 != a2 && c2 != a2 && c3 != a2 && c4 != a2 && c5 != a2) {
						c6 = a2;
						System.out.print(" " + c6);
					}
					if (c4 >= 0 && c5 < 0 && c1 != a2 && c2 != a2 && c3 != a2 && c4 != a2) {
						c5 = a2;
						System.out.print(" " + c5);
					}
					if (c3 >= 0 && c4 < 0 && c1 != a2 && c2 != a2 && c3 != a2) {
						c4 = a2;
						System.out.print(" " + c4);
					}
					if (c2 >= 0 && c3 < 0 && c1 != a2 && c2 != a2) {
						c3 = a2;
						System.out.print(" " + c3);
					}
					if (c1 >= 0 && c2 < 0 && c1 != a2) {
						c2 = a2;
						System.out.print(" " + c2);
					}
					if (c1 < 0) {
						c1 = a2;
						System.out.print(" " + c1);
					}

				}

			}
		}

	}

}