package by.java_intro_online.mod01.task01_19;

/* Given a real number R of the form nnn.ddd (three digits in fractional and integer parts).
 * Swap the fractional and integer parts of the number and output the resulting value of the number. 
 */

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task04 {

	public static void main(String[] args) {

		double R;
		double newR;

		R = 123.456;
		newR = 1000 * (R - (int) R) + 0.001 * (int) R;

		System.out.println(R);

		System.out.printf("%.3f\n", newR);

		BigDecimal a = new BigDecimal(newR);
		a = a.setScale(3, RoundingMode.DOWN);
		System.out.print(a);

	}

}