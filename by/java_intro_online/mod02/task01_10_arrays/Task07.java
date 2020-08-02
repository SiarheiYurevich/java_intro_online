package by.java_intro_online.mod02.task01_10_arrays;

/* Given real numbers a1, a2, .., an.
 * Find max{ a(1)+a(2n), a(2)+a(2n-1), .., a(n)+a(n+1) }
 */

public class Task07 {

	public static void main(String[] args) {

		double mas[] = { 5, 4, 3, 2, 1, 2, 3, 4, 1 };

		int n = (mas.length - 1) / 2;
		double max = mas[0] + mas[2 * n];

		int i = 1;
		double j = 0;

		while (i <= n) {
			j = mas[i] + mas[2 * n - i];
			if (max < j) {
				max = j;
			}
			i++;
		}
		System.out.print("max{ } = " + max);
	}
}
