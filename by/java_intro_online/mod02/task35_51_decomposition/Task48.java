package by.java_intro_online.mod02.task35_51_decomposition;

/* Find all numbers from 1 to k which have n digits and which digits sum in power n is equal to the same number.
 * (to solve task use decomposition)
 */

import java.util.Scanner;

public class Task48 {

	public static void main(String[] args) {

		int k = enterK("k >> ");

		for (int i = 1; i <= k; i++) {
			if (searchArmNum(i)) {
				System.out.print(i + " ");
			}
		}
	}

	public static boolean searchArmNum(int n) {

		boolean ArmNum = false;
		int sum = 0;
		int m = 0;

		for (int j = n; j != 0; j /= 10) {
			sum += (j % 10);
			m++;
		}

		if ((int) Math.pow(sum, m) == n) {
			ArmNum = true;
		}
		return ArmNum;
	}

	public static int enterK(String message) {

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
