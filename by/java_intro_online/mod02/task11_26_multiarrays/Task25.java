package by.java_intro_online.mod02.task11_26_multiarrays;

// Find largest element of a matrix and replace all odd elements with this element.

public class Task25 {

	public static void main(String[] args) {

		int matrix[][] = new int[10][10];

		int ij = 0;

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				ij = (int) (Math.random() * 200);
				matrix[i][j] = ij;
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		int ijmax = 0;

		for (int i2 = 0; i2 < 10; i2++) {
			for (int j2 = 0; j2 < 10; j2++) {
				if (matrix[i2][j2] > ijmax) {
					ijmax = matrix[i2][j2];
				}
			}
		}

		for (int i3 = 0; i3 < 10; i3++) {
			for (int j3 = 0; j3 < 10; j3++) {
				if (i3 == (int) (i3 / 2) * 2 && j3 == (int) (j3 / 2) * 2) {
					matrix[i3][j3] = ijmax;
				}
			}
		}

		System.out.println("After replacement");
		for (int i4 = 0; i4 < 10; i4++) {
			for (int j4 = 0; j4 < 10; j4++) {
				System.out.print(matrix[i4][j4] + " ");
			}
			System.out.println();
		}
		
	}
}
