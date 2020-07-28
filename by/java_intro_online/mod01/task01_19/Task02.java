package by.java_intro_online.mod01.task01_19;

/* Calculate a value of the expression:
 * (b + sq.root(b*b + 4*a*c)) / 2*a - a*a*a*c + 1 / (b*b)
 * (all variables are valid)
 */

public class Task02 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;
		double result;

		a = 1.0;
		b = 2.0;
		c = 3.0;

		if (a == 0) {
			System.out.println(
					"The expression value is undefined (division by zero), enter a nonzero value for the 'a' variable");
		} else {

			if (b == 0) {
				System.out.println(
						"The expression value is undefined (raising zero to a negative power), enter a nonzero value for the 'b' variable");
			} else {

				if (a < 0 && c > 0 || a > 0 && c < 0) {
					System.out.println(
							"The expression value is undefined (extraction of the root from a negative number), the variables 'a' and 'c' cannot be equal to zero");
				} else {

					result = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) + c * Math.pow(a, 3)
							+ Math.pow(b, -2);
					System.out.println("The expression value equals " + result);

				}
			}
		}

	}

}
