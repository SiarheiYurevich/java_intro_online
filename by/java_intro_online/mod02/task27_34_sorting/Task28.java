package by.java_intro_online.mod02.task27_34_sorting;

/* Given two ascending sequences.
 * Create a new ascending sequence by combining the two given sequences.
 * Do not use a addition sequence.
 */

public class Task28 {

	public static void main(String[] args) {

		int a[] = { 1, 3, 5, 7, 9, 11, 13 };
		int b[] = { 0, 2, 4, 6, 8, 10, 10, 10, 10 };

		int na = a.length;
		int nb = b.length;

		int c[] = new int[na + nb];

		int ia = 0;
		int ib = 0;
		int ic = 0;

		while (ia <= na - 1 || ib <= nb - 1) {

			if (ia <= na - 1 && ib <= nb - 1) {

				if (a[ia] < b[ib]) {
					c[ic] = a[ia];
					ic++;
					ia++;
				} else {
					c[ic] = b[ib];
					ic++;
					ib++;
				}
			} else {
				if (ia > na - 1) {
					c[ic] = b[ib];
					ic++;
					ib++;
				} else {
					if (ib > nb - 1) {
						c[ic] = a[ia];
						ic++;
						ia++;
					}
				}
			}
		}

		for (int j = 0; j < na + nb; j++) {
			System.out.print(c[j] + " ");
		}
	}
}
