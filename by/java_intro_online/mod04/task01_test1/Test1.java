package by.java_intro_online.mod04.task01_test1;

/* Create a class Test1 with two variables.
 * Write a method for display and methods for changing the variables.
 * Write a method for sum calculating and a method for finding of the largest value of the two variables.
 */

public class Test1 {

	private int a;
	private int b;

	public Test1() {
	}

	public Test1(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void printA() {
		System.out.println("a = " + a);
	}

	public void printB() {
		System.out.println("b = " + b);
	}

	public int getSum() {
		return a + b;
	}

	public int getMaxAB() {
		return Math.max(a, b);
	}
}
