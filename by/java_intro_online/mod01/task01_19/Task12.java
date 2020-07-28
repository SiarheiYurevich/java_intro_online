package by.java_intro_online.mod01.task01_19;

/* Write a program where the user enters any positive integer, 
 * and the program sums all numbers from 1 to the number entered by the user.
 */

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {

		int a;
		int sum;
		boolean checking;

		a = 0;
		sum = 0;
		checking = false;

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("a >> ");

		while (!checking) {

			if (scan.hasNextInt()) {

				a = scan.nextInt();

				if (a > 0) {
					checking = true;

				} else {
					System.out.print("number 'a' have to be > 0, a >> ");
				}

			} else {
				scan.next();
				System.out.print("number 'a' have to be integer, a >> ");
			}
		}

		for (int i = 1; i <= a; i++) {

			sum = sum + i;
		}
		System.out.print("sum = " + sum);
	}
}