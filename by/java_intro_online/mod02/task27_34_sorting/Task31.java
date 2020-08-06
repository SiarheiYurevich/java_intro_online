package by.java_intro_online.mod02.task27_34_sorting;

// Insertion sort.

public class Task31 {

	public static void main(String[] args) {

		int array[] = { 1000, 100, 0, 1, 2, 5, 10, 50, 200, 500, 10000, 111, 3, 54, 64, 6, 76, 6, 123, 67, 6, 55, 33,
				332, 2 };

		for (int key = 1; key < array.length; key++) {

			int value = array[key];

			int insert = binarySearch(array, value, 0, key - 1);

			int i = key;
			while (i > insert) {
				array[i] = array[i - 1];
				i--;
			}
			array[insert] = value;
		}

		for (int j = 0; j < array.length; j++) {
			System.out.print(array[j] + " ");
		}
	}

	public static int binarySearch(int array[], int value, int low, int high) {

		int index = Integer.MAX_VALUE;

		while (low <= high) {

			int mid = (low + high) / 2;

			index = mid;

			if (array[mid] < value) {
				low = mid + 1;

				if (low > high || array[low] > value) {
					index = low;
					break;
				}

			} else {
				if (array[mid] > value) {
					high = mid - 1;
					if (low == high && high != 0) {
						index = mid;
						break;
					}
				}
			}

			if (array[mid] == value) {
				index = mid;
				break;
			}
		}
		return index;
	}

}

/*
 * import java.util.Arrays; Arrays.binarySearch(array, key);
 */
