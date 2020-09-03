package by.java_intro_online.mod02.task35_51_decomposition;

import java.util.Scanner;

/* Find all n-digits numbers which digits create an ascending sequence (for example 1234).
 * (to solve task use decomposition) 
 */

public class Task49 {

	public static void main(String[] args) {

		int n = enterN("n >> ");

		for (int i = (int) Math.pow(10, n - 1); i < (int) Math.pow(10, n); i++) {
			if (checkNum(n, i)) {
				System.out.print(i + " ");
			}
		}
	}

	public static boolean checkNum(int n, int j) {

		boolean increase = true;

		for (int m = n; m > 1; m--) {

			if (j % 10 <= (j / 10) % 10) {
				increase = false;
				break;
			}
			j /= 10;
		}
		return increase;
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