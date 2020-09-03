package by.java_intro_online.mod02.task35_51_decomposition;

/* In an array given coordinates of n points.
 * Write methods that find which pairs of the points have the smallest distance.
 */

public class Task38 {

	public static void main(String[] args) {

		int point[][] = { { 100, 2 }, { -3, 2 }, { 5, 6 }, { 7, 8 }, { 9, 10 } };

		System.out.print("The max distance of array's two points is " + twoPointMaxDist(point));
	}

	public static double twoPointMaxDist(int point[][]) {

		double dist = 0;
		double maxdist = 0;

		for (int k = 0; k < point.length; k++) {

			for (int i = 1; i < point.length; i++) {

				if (i > k) {
					dist = Math
							.sqrt(Math.pow((point[i][0] - point[k][0]), 2) + Math.pow((point[i][1] - point[k][1]), 2));
				}
				if (dist > maxdist) {
					maxdist = dist;
				}
			}
		}
		return maxdist;
	}

}
