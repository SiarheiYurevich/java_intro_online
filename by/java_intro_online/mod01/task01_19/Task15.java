package by.java_intro_online.mod01.task01_19;

//Find product of squares of first two hundred numbers.

import java.math.BigDecimal;

public class Task15 {

	public static void main(String[] args) {

		int i;
		int ii;

		BigDecimal mult = new BigDecimal(1);

		for (i = 1; i <= 200; i++) {

			ii = i * i;

			BigDecimal iii = new BigDecimal(ii);

			mult = mult.multiply(iii);
		}

		System.out.println(mult);

// Without BigDecimal, but with readable result

		int x = 0;
		double mult2 = 1;

		for (int j = 1; j <= 200; j++) {

			mult2 *= j * j;

			while (mult2 > 10) {
				mult2 = mult2 / 10;
				x += 1;
			}
		}
		System.out.println(mult2 + "e+" + x);
	}
}