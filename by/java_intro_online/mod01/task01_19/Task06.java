package by.java_intro_online.mod01.task01_19;

/* For the area (area bounded by points (x, y): (-4, -3); (0, -4); (0, -2); (-2, 4); (2, 4); (2, 0); (4, 0); (4, -3)),
 * write a linear program that prints true if the point (x, y) belongs to the specified area,
 * and print false otherwise. 
 */

public class Task06 {

	public static void main(String[] args) {

		int x;
		int y;
		boolean f;

		x = 1;
		y = 2;

		f = (x > -2 && x < 2 && y > 0 && y < 4) || (x > -4 && x < 4 && y < 0 && y > -3);

		System.out.print(f);

	}
}