package by.java_intro_online.mod01.task01_19;

/* Calculate a value of the expression:
 * ((sin x + cos y)/(sin x - cos y)) * tg x*y
 * (all variables are valid)
 */

public class Task03 {

	public static void main(String[] args) {

		double x;
		double y;
		double result;

		x = 1;
		y = 1;

		if (x == 0 || x == Math.PI || x == 2 * Math.PI && y == Math.PI / 2 || y == 3 * Math.PI / 2) {

			System.out.println("The expression value is undefined (division by zero)");

		} else {

			result = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);

			System.out.println("The expression value equals " + result);

		}
	}

}
