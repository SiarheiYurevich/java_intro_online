package by.java_intro_online.mod02.task35_51_decomposition;

// Write methods for finding greatest common divisor of four natural numbers.

public class Task36 {

	public static void main(String[] args) {

		int a = 6;
		int b = 9;
		int c = 24;
		int d = 27;

		System.out.print(
				"The greatest common divisor of " + a + ", " + b + ", " + c + " and " + d + " is " + gcd(a, b, c, d));
	}

	public static int gcd(int a, int b, int c, int d) {

		int gcd4 = gcd2(gcd2(gcd2(a, b), c), d);
		return gcd4;
	}

	public static int gcd2(int m, int n) {

		if (n == 0)
			return m;
		else
			return gcd2(n, m % n);
	}

}
