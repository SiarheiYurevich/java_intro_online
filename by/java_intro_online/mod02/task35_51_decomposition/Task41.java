package by.java_intro_online.mod02.task35_51_decomposition;

// Write methods for finding of sum of factorials of all odd numbers from 1 to 9.

public class Task41 {

	public static void main(String[] args) {

		int number = 9;

		System.out.print("Sum of factorials is " + sumFactOddNum(number));
	}

	public static boolean searchOdd(int a) {

		if (a % 2 != 0) {
			return true;
		}
		return false;
	}

	public static int fact(int b) {

		int f = 0;

		for (int i = 1; i <= b; i++) {
			f = f + i;
		}
		return f;
	}

	public static int sumFactOddNum(int c) {

		int sum = 0;

		for (int j = 1; j <= c; j++) {
			if (searchOdd(j)) {
				sum = sum + fact(j);
			}
		}
		return sum;
	}

}
