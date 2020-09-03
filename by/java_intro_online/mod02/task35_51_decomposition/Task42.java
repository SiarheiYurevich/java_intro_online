package by.java_intro_online.mod02.task35_51_decomposition;

/* Given an array D. Determine sums D[1]+D[2]+D[3], D[4]+D[5]+D[6] and D[7]+D[8]+D[9].
 * Write methods that determine the sums of three elements of the array with position number in the array are from "k" to "m". 
 */

public class Task42 {
	
public static void main(String[] args) {
		
		int array[] = { 1, 2, 3, 4, 5 };
				
		System.out.println("Sum of D[1-3] is " + sumThree(array, 0, 2));
		System.out.println("Sum of D[2-4] is " + sumThree(array, 1, 3));
		System.out.println("Sum of D[3-5] is " + sumThree(array, 2, 4));
		
	}
	
	public static int sumThree(int array[], int k, int m) {
		
		int sum = 0;
		
		for (int i = k; i <= m; i++) {
			sum = sum + array[i];
		}
		return sum;
	}

}
