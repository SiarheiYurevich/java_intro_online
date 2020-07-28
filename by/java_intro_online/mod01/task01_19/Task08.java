package by.java_intro_online.mod01.task01_19;

// Find max{min(a, b), min(c, d)}.

public class Task08 {

	public static void main(String[] args) {

		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;

		int minab;
		int mincd;

		int max;

		if (a < b) {
			minab = a;
		} else {
			minab = b;
		}

		if (c < d) {
			mincd = c;
		} else {
			mincd = d;
		}

		if (minab < mincd) {
			max = mincd;
		} else {
			max = minab;
		}

		System.out.println("max{min(" + a + ", " + b + "), min(" + c + ", " + d + ")} = " + max);

	}
}