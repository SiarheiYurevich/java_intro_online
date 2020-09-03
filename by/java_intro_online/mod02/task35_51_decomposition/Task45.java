package by.java_intro_online.mod02.task35_51_decomposition;

// Write methods that determine which of two numbers has more digits.

public class Task45 {
	
	public static void main(String[] args) {
		
		int a = 123456;
		int b = 7890;
		
		int na = countDigit(a);
		int nb = countDigit(b);
		
		System.out.print("The number " + Math.max(a, b) + " has more digits (" + Math.max(na, nb) + " digits) that number " +  Math.min(a, b) + " (" + Math.min(na, nb) + " digits)");
		
	}
	
	public static int countDigit(int d) {
		
		int digit = 0;
		
		while (d > 0) {
			d = d / 10;
			digit++;
		}
		return digit;
	}

}
