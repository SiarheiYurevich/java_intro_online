package by.java_intro_online.mod02.task27_34_sorting;

/* Given two ascending sequence.
 * Specify the places in the first sequence
 * where the elements of the second sequence should be inserted
 * so that the new sequence will be  also ascending.
 */

public class Task33 {

	public static void main(String[] args) {

		int A[] = { 1, 3, 5, 7, 9 };
		int B[] = { 2, 4, 6, 8 };

		int BinA = 0;
		int AwithB = 0;
		int ab = 0;

		for (int iB = 0; iB < B.length; iB++) {

			for (int iA = 0; iA < A.length; iA++) {

				if (B[iB] >= A[iA]) {
					BinA++;
				}
			}

			ab = BinA + AwithB;

			System.out.println(B[iB] + " - " + ab);

			BinA = 0;
			AwithB++;
		}

	}

}
