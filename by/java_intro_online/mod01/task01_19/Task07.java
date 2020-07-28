package by.java_intro_online.mod01.task01_19;

/* Given two angles of a triangle (in degrees),
 * determine whether such a triangle exists and, if so,
 * whether it is right triangle. 
 */

public class Task07 {

	public static void main(String[] args) {

		int angle1;
		int angle2;

		angle1 = 12;
		angle2 = 34;

		if (angle1 + angle2 < 180) {

			System.out.print("The triangle exists.");

			if (angle1 == 90 || angle2 == 90 || angle1 + angle2 == 120) {

				System.out.println("The triange is a right triangle");

			}

		} else {

			System.out.println("The triangle does not exist");
		}

	}

}