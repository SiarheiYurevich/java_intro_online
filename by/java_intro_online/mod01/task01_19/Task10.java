package by.java_intro_online.mod01.task01_19;

/* Given the dimensions of the rectangular hole (A, B) and the dimensions of the brick (x, y, z).
 * Determine if the brick will go through the hole.
 */

public class Task10 {

	public static void main(String[] args) {

		int x;
		int y;
		int z;
		int A;
		int B;

		x = 1;
		y = 2;
		z = 3;
		A = 1;
		B = 5;

		if ((A * B > x * y || A * B > x * z || A * B > y * z)
				&& (Math.min(A, B) > x || Math.min(A, B) > y || Math.min(A, B) > z)) {

			System.out.println("The brick will go through the hole.");

		} else {

			System.out.println("The brick will NOT go through the hole.");
		}

	}
}