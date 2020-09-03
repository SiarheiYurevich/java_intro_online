package by.java_intro_online.mod02.task35_51_decomposition;

/* Write methods for finding of greatest common divisor GCD and lowest common multiple LCM of two natural numbers:
 * LCM(A, B) = A*B / GCD(A, B)
 */

public class Task35 {

	public static void main(String[] args) {

		int a = 6;
		int b = 9;

		System.out.println("The greatest common divisor of " + a + " and " + b + " is " + gcd(a, b));
		System.out.print("The lowest common multiple of " + a + " and " + b + " is " + lcm(a, b));
	}

	public static int lcm(int a, int b) {

		int gcm = (a * b) / gcd(a, b);
		return gcm;
	}

	public static int gcd(int a, int b) {

		while (b != 0) {
			int t = b;
			b = a % b;
			a = t;
		}
		return a;
	}
	
}
