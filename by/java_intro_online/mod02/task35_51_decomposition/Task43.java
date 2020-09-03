package by.java_intro_online.mod02.task35_51_decomposition;

/* Given numbers X, Y, Z, T that are side length of a tetragon.
 * Write methods for finding of tetragon area if angle between sides X and Y is right.
 */

public class Task43 {
	
	public static void main(String[] args) {

		int X = 1;
		int Y = 2;
		int Z = 3;
		int T = 4;

		System.out.print("The tetragon area is " + estArea(X, Y, Z, T));
	}

	public static double estArea(int x, int y, int z, int t) {

		double area = 0;

		double areaOne = 0.5 * x * y;

		double xy = Math.sqrt(x * x + y * y);
		double P = (xy + z + t) / 2;
		double areaTwo = Math.sqrt(P * (P - xy) * (P - z) * (P - t));
		area = areaOne + areaTwo;

		return area;
	}

}
