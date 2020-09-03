package by.java_intro_online.mod02.task35_51_decomposition;

import java.util.Scanner;

/* Write program that determine the sum of n-digits numbers which have only odd-digits.
 * Determine how many even-digits in the sum.
 * (to solve task use decomposition)
 */

public class Task50 {

	public static void main(String[] args) {

		int n = enterN("n >> ");

		System.out.println("Sum of odd-numbers is " + calcSumOdd(n));

		System.out.print("Number of even digits is " + calcEvenDigit(calcSumOdd(n)));
	}

	public static int calcEvenDigit(int s) {
		int sumEven = 0;
		int k = s;
		while (k > 0) {
			if (!searchOdd(k % 10)) {
				sumEven++;
			}
			k /= 10;
		}
		return sumEven;
	}

	public static int calcSumOdd(int n) {
		int sum = 0;
		for (int i = (int) Math.pow(10, n - 1); i < (int) Math.pow(10, n); i++) {
			boolean oddI = false;
			int j = i;
			int z = n;
			while (z > 0) {
				if (searchOdd(j % 10)) {
					oddI = true;
					j /= 10;
					z--;
				} else {
					oddI = false;
					break;
				}
			}
			if (oddI) {
				sum += i;
			}
		}
		return sum;
	}

	public static boolean searchOdd(int i) {
		
		if (i % 2 != 0) {
			return true;
		}
		return false;
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