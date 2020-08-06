package by.java_intro_online.mod02.task27_34_sorting;

// Selection sort.

public class Task29 {

	public static void main(String[] args) {

		int array[] = { 1, 2, 3, 4, 5, 10, 15, 20 };

		for (int ileft = 0; ileft < array.length; ileft++) {

			int imax = ileft;

			for (int i = ileft; i < array.length; i++) {

				if (array[i] > array[imax]) {
					imax = i;
				}
			}

			int tmp = array[ileft];
			array[ileft] = array[imax];
			array[imax] = tmp;

			System.out.print(array[ileft] + " ");
		}

	}
}
