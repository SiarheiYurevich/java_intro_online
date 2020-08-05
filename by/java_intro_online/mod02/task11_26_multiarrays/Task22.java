package by.java_intro_online.mod02.task11_26_multiarrays;

// Sort elements of matrix rows in ascending and descending order of elements values.

public class Task22 {

	public static void main(String[] args) {

		int matrix[][] = new int[10][10];

		System.out.println("Random filled matrix");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				matrix[i][j] = (int) (Math.random() * 10);
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Descending");
		int ilow = 0;
		for (int j2 = 0; j2 < 10; j2++) {
			for (int i2 = 1; i2 < 10; i2++) {
				if (matrix[j2][i2 - 1] < matrix[j2][i2]) {
					ilow = matrix[j2][i2 - 1];
					matrix[j2][i2 - 1] = matrix[j2][i2];
					matrix[j2][i2] = ilow;
					i2 = 0;
				}
			}
		}

		for (int i3 = 0; i3 < 10; i3++) {
			for (int j3 = 0; j3 < 10; j3++) {
				System.out.print(matrix[i3][j3] + " ");
			}
			System.out.println();
		}

		System.out.println("Ascending");
		int ihigh = 0;
		for (int j4 = 0; j4 < 10; j4++) {
			for (int i4 = 1; i4 < 10; i4++) {
				if (matrix[j4][i4 - 1] > matrix[j4][i4]) {
					ihigh = matrix[j4][i4 - 1];
					matrix[j4][i4 - 1] = matrix[j4][i4];
					matrix[j4][i4] = ihigh;
					i4 = 0;
				}
			}
		}

		for (int i5 = 0; i5 < 10; i5++) {
			for (int j5 = 0; j5 < 10; j5++) {
				System.out.print(matrix[i5][j5] + " ");
			}
			System.out.println();
		}

	}
}
