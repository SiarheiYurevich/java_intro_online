package by.java_intro_online.mod02.task27_34_sorting;

// Shell sort.

public class Task32 {

	public static void main(String[] args) {

		double array[] = { 9.9, 2.8, 6.7, 4.6, 5.5, 0.4, 7.3, 2.2, 9.1 };

		int gap = array.length / 2;

		while (gap >= 1) {

			for (int right = 0; right < array.length; right++) {

				for (int c = right - gap; c >= 0; c -= gap) {

					if (array[c] > array[c + gap]) {

						double cc = array[c];
						array[c] = array[c + gap];
						array[c + gap] = cc;
					}
				}
			}
			gap = gap / 2;
		}

		for (int j = 0; j < array.length; j++) {
			System.out.print(array[j] + " ");
		}

	}
}
