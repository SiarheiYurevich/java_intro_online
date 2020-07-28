package by.java_intro_online.mod01.task01_19;

/* Find a value of function:
 * F(x) = x*x - 3*x + 9, if x =< 3, and
 * F(x) = 1 / (x*x*x + 6), if x > 3. 
 */

public class Task11 {

	public static void main(String[] args) {

		int x;
		double Fx;

		x = 1;

		if (x <= 3) {

			Fx = x * x * x - 3 * x + 9;

		} else {

			Fx = 1 / (x * x * x + 6);

		}

		System.out.println("Fx = " + Fx);
		
	}
}