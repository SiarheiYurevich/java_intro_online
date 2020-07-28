package by.java_intro_online.mod01.task01_19;

// Determine if three points (A(x1, y1), B(x2, y2), C(x3, y3)) are on the same line.

public class Task09 {

	public static void main(String[] args) {

		int x1;
		int y1;

		int x2;
		int y2;

		int x3;
		int y3;

		x1 = 1;
		y1 = 2;

		x2 = 3;
		y2 = 4;

		x3 = 5;
		y3 = 6;

		if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {

			System.out.println("The points lie on the same line.");

		} else {

			System.out.println("The points do not lie on the same line.");
		}

	}
}
