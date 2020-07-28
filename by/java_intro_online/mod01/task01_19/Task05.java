package by.java_intro_online.mod01.task01_19;

/* Given a natural number that represents time in seconds.
 * Output the given value of time in hours, minutes and seconds in the following form:
 * HHh MMm SSs
 */

public class Task05 {

	public static void main(String[] args) {

		int T;
		int HH;
		int MM;
		int SS;

		T = 12345;
		HH = (int) (T / 3600);
		MM = (int) ((T - HH * 3600) / 60);
		SS = T - HH * 3600 - MM * 60;

		System.out.println(HH + "h " + MM + "min " + SS + "s");

	}
}