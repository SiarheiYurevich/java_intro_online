package by.java_intro_online.mod02.task35_51_decomposition;

// Calculate the area of hexagon with side 'a' using method for calculating the area of triangle.

public class Task37 {

	public static void main(String[] args) {

		int a = 1;

		System.out.print("Hexagon area is " + hexagonS(triangleS(a)));

	}

	public static double triangleS(int a) {

		double tS = 0.5 * a * a * Math.sin(Math.toRadians(60));
		return tS;
	}

	public static double hexagonS(double tS) {

		double hS = 6 * tS;
		return hS;
	}

}
