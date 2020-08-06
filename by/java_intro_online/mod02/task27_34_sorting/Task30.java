package by.java_intro_online.mod02.task27_34_sorting;

// Bubble sort.

public class Task30 {

	public static void main(String[] args) {

		int array[] = { 1, 2, 3, 4, 5, 10, 20, 40 };

		boolean iteration = true;

		while (iteration) {

			iteration = false;

			for (int i = 1; i < array.length; i++) {

				if (array[i] > array[i - 1]) {

					int tmp = array[i];
					array[i] = array[i - 1];
					array[i - 1] = tmp;

					iteration = true;
				}

			}
		}

		for (int j = 0; j < array.length; j++) {
			System.out.print(array[j] + " ");
		}
	}
}
