package by.java_intro_online.mod02.task27_34_sorting;

/* Given fractions p1/q1, p2/q2, .., pn/qn (p and q - natural numbers).
 * Create a program that set a common denominator for fractions and orders them in ascending order.
 */

public class Task34 {

	public static void main(String[] args) {

		int fract[][] = { { 9, 1 }, { 7, 3 }, { 8, 2 }, { 6, 5 }, { 4, 4 } };

		for (int i = 0; i < fract.length; i++) {
			for (int j = 0; j < fract[0].length; j++) {
				System.out.print(fract[i][j]);
				if (j == 0) {
					System.out.print("/");
				}
				if (j == 1 && i + 1 != fract.length) {
					System.out.print(", ");
				}
			}
		}
		System.out.println();

		int den = 1;

		for (int k = 1; k < fract.length; k++) {
			if (k == 1) {
				if (Math.max(fract[k - 1][1], fract[k][1]) % Math.min(fract[k - 1][1], fract[k][1]) != 0
						|| fract[k - 1][1] != 1 || fract[k][1] != 1) {
					den = fract[k - 1][1] * fract[k][1];
				} else {
					den = Math.min(fract[k - 1][1], fract[k][1]);
				}
			}
			if (k > 1) {
				if (den % fract[k][1] != 0) {
					den = den * fract[k][1];
				}
			}
		}

		int dden;
		for (int i = 0; i < fract.length; i++) {
			dden = den / fract[i][1];
			for (int j = 0; j < fract[0].length; j++) {
				fract[i][j] = fract[i][j] * dden;
			}
		}

		for (int i = 1; i < fract.length; i++) {
			if (fract[i - 1][0] > fract[i][0]) {
				int t = fract[i][0];
				fract[i][0] = fract[i - 1][0];
				fract[i - 1][0] = t;
				i = 0;
			}
		}

		for (int i = 0; i < fract.length; i++) {
			for (int j = 0; j < fract[0].length; j++) {
				System.out.print(fract[i][j]);
				if (j == 0) {
					System.out.print("/");
				}
				if (j == 1 && i + 1 != fract.length) {
					System.out.print(", ");
				}
			}
		}

	}
}
