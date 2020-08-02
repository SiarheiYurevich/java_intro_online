package by.java_intro_online.mod02.task01_10_arrays;

/* Find the most common number in an array of integers [n].
 * If there are several such numbers, find the most frequent number. 
 */

public class Task09 {

	public static void main(String[] args) {

		int mas[] = { 5, 4, 2, 3, 4, 1, 5, 5, 4 };
		int n = mas.length;

		int masOft[] = new int[n];

		for (int j = 0; j < n; j++) {

			if (masOft[j] == 0) {

				int iCheck = mas[j];

				for (int i = 0; i < n; i++) {

					if (iCheck == mas[i]) {
						masOft[j]++;

						if (i > j) {
							masOft[i] = -1;
						}
					}
				}
			}
		}

		int iOftPosition = 0; // position most oft elements
		for (int j2 = 1; j2 < n; j2++) {

			if (masOft[iOftPosition] < masOft[j2]) {
				iOftPosition = j2;
			}
		}

		int iOftPositionAmount = masOft[iOftPosition]; // amount of most oft elements
		int iOftZ = 0;
		for (int j3 = 0; j3 < n; j3++) {

			if (masOft[j3] != iOftPositionAmount) {
				masOft[j3] = 0;
			} else {
				iOftZ++; // number most oft elements
			}
		}

		if (iOftPositionAmount == n) {
			System.out.print("All elements of the array are the number " + mas[iOftPosition]);
		} else {

			if (iOftZ == n) {
				System.out.print("All elements of the array are different numbers");
			} else {

				if (iOftZ >= 2) {
					System.out.print("Most common numbers of array are ");
				}

				if (iOftZ < 2) {
					System.out.print("Most common number of array is ");
				}

				for (int j4 = 0; j4 < n; j4++) {

					if (masOft[j4] != 0) {
						System.out.print(mas[j4] + " ");
					}
				}

				if (iOftZ >= 2) {

					System.out.print("\nThe smallest of them is ");

					int iMin = 0;
					for (int j5 = 1; j5 < n; j5++) {
						if (masOft[j5] != 0) {
							iMin = j5;
						}
					}
					for (int j6 = 0; j6 < n; j6++) {
						if (masOft[j6] != 0 && mas[j6] < mas[iMin]) {
							iMin = j6;
						}
					}

					System.out.print(mas[iMin]);
				}
			}
		}

	}
}
