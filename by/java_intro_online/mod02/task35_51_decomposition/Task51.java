package by.java_intro_online.mod02.task35_51_decomposition;

import java.util.Scanner;
import java.util.Arrays;

/* From given number subtract sum of its digits. From result also subtract sum of its digits.
 * How many this subtracts is needed to get zero?
 * (to solve task use decomposition)
 */

public class Task51 {

	public static void main(String[] args) {

		int n = enterN("n >> ");

		System.out.println("Number of iteration is " + calcIter(n));

		System.out.print(Arrays.toString(passArray(n, calcIter(n))));
	}

	public static int[] passArray(int n, int z) {

		int array[] = new int[z];

		for (int i = 0; i < z; i++) {
			array[i] = n;
			n -= calcDigitSum(n);
		}
		return array;
	}

	public static int calcIter(int n) {

		int z = 0;

		while (n > 0) {
			n -= calcDigitSum(n);
			z++;
		}
		return z;
	}

	public static int calcDigitSum(int n) {

		int sum = 0;

		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;

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
