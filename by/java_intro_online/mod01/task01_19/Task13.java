package by.java_intro_online.mod01.task01_19;

/* Calculate the value of the function on the segment [a, b] with step h:
 * y = x, if x > 2, and
 * y = -x, if x=<2.
 */

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {

		int a;
		int b;
		int h;

		int x;
		int y;

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.print("a >> ");
		a = scan.nextInt();

		System.out.print("b >> ");
		b = scan.nextInt();

		System.out.print("h >> ");
		h = scan.nextInt();

		for (x = a; x <= b; x += h) {

			if (x > 2) {

				y = x;

			} else {

				y = -x;
			}

			System.out.print(y + " ");

		}

	}
}