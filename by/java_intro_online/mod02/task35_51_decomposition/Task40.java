package by.java_intro_online.mod02.task35_51_decomposition;

// Write method(s) that check whether three numbers are coprime numbers.

public class Task40 {

	public static void main(String[] args) {

		int a = 4;
		int b = 7;
		int c = 9;
		
		searchThreePrime(a, b, c);
		
	}

	public static void searchThreePrime(int a, int b, int c) {
		
		if (searchTwoPrime(a, b) && searchTwoPrime(b, c) && searchTwoPrime(a, c)) {
			
			System.out.print("The numbers " + a + ", " + b + " and " + c + " are coprime");
			
		} else {
			
			System.out.print("The numbers " + a + ", " + b + " and " + c + " are not coprime");
		}
	}
	
	public static boolean searchTwoPrime(int a, int b) {

		if (Math.max(a, b) % Math.min(a, b) != 0) {
			return true;
		}
		return false;
	}
}
